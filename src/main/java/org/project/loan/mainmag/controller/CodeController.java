package org.project.loan.mainmag.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

import org.project.loan.beans.UserBean;
import org.project.loan.utils.GeetestLib;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.*;

@Controller
@RequestMapping(value = "/gt")
public class CodeController {
    @RequestMapping(value = "/ajax-validate2")
    @ResponseBody
    public String login(HttpServletRequest request,
                                      HttpServletResponse response) {
        GeetestLib gtSdk = new GeetestLib(GeetestConfig.getGeetest_id(), GeetestConfig.getGeetest_key(),
                GeetestConfig.isnewfailback());

        String challenge = request.getParameter(GeetestLib.fn_geetest_challenge);
        String validate = request.getParameter(GeetestLib.fn_geetest_validate);
        String seccode = request.getParameter(GeetestLib.fn_geetest_seccode);
        String userName=request.getParameter("username");
        String passWord=request.getParameter("password");
        System.out.println(".............."+userName+passWord);
        //从session中获取gt-server状态
        int gt_server_status_code = (Integer) request.getSession().getAttribute(gtSdk.gtServerStatusSessionKey);

        //从session中获取userid
        String userid = (String) request.getSession().getAttribute("userid");

        //自定义参数,可选择添加
        HashMap<String, String> param = new HashMap<String, String>();
        param.put("user_id", userid); //网站用户id
        param.put("client_type", "web"); //web:电脑上的浏览器；h5:手机上的浏览器，包括移动应用内完全内置的web_view；native：通过原生SDK植入APP应用的方式
        param.put("ip_address", "127.0.0.1"); //传输用户请求验证时所携带的IP

        int gtResult = 0;

        if (gt_server_status_code == 1) {
            //gt-server正常，向gt-server进行二次验证

            gtResult = gtSdk.enhencedValidateRequest(challenge, validate, seccode, param);
        } else {
            // gt-server非正常情况下，进行failback模式验证

            System.out.println("failback:use your own server captcha validate");
            gtResult = gtSdk.failbackValidateRequest(challenge, validate, seccode);
            //System.out.println(gtResult);
            //System.out.println(".............."+userName+passWord);
        }


        if (gtResult == 1) {
            // 验证成功
            //PrintWriter out = response.getWriter();
            //System.out.println(".............."+userName+passWord);
            //JOptionPane.showMessageDialog(null,userName+passWord);
            /**
             * 这里调用登录方法
             */
        	UserBean user = new UserBean();
        	user.setUserLoginName(userName);
        	user.setUserPassword(passWord);
            Subject subject = SecurityUtils.getSubject();
            UsernamePasswordToken token = new UsernamePasswordToken(user.getUserLoginName(), user.getUserPassword());
            System.out.println(user);
            System.out.println(token);
            JSONObject data = new JSONObject();
            try{
                subject.login(token);//会跳到我们自定义的realm中
                System.out.println();
                data.put("status", "success");
                data.put("version", gtSdk.getVersionInfo());
                data.put("username", user.getUserLoginName());
            }catch(Exception e){
                e.printStackTrace();
                request.getSession().setAttribute("user", user);
                request.setAttribute("error", "用户名或密码错误！");
                try {
					data.put("status", "fail");
					data.put("version", gtSdk.getVersionInfo());
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
            }                      
            return data.toString();
        } else {
            // 验证失败
            //JOptionPane.showMessageDialog(null,"sad");
            JSONObject data = new JSONObject();
            try {
                data.put("status", "fail");
                data.put("version", gtSdk.getVersionInfo());
            } catch (JSONException e) {
                e.printStackTrace();
            }

            return data.toString();
        }

    }

}
