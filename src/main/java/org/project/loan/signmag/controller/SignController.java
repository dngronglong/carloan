package org.project.loan.signmag.controller;

import org.project.loan.beans.SignBean;
import org.project.loan.signmag.service.ISignWriteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class SignController {
    @Resource
    private ISignWriteService iSignWriteService;

    /**
     * 添加签约信息，添加了注释
     *
     */
    @RequestMapping(value = "/sign/addSign",method = RequestMethod.POST)
    @ResponseBody
    public void  addSign(@RequestBody SignBean signBean){
        System.out.println("进来了"+signBean);
        iSignWriteService.addSign(signBean);
    }

    /**
     * 删除
     * @param signBean
     */
    @RequestMapping("/delSign")
    public void delSign(SignBean signBean){
        iSignWriteService.deleteSign(signBean);
    }

    /**
     * 更新
     * @param signBean
     */
    @RequestMapping("/updateSigns")
    public void updateSign(SignBean signBean){
        iSignWriteService.updateSign(signBean);
    }
}
