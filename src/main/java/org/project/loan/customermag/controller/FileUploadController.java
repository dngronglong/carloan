package org.project.loan.customermag.controller;


import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;



@RequestMapping("/fileCustomers")
@Controller
public class FileUploadController {
	
	@Autowired
	private HttpServletRequest request;


	    @RequestMapping("/jq")
	    public String jq() {
	        System.out.println("oooo");
	        return "index";
	    }

	    @RequestMapping("/upload&{id}")
	    public String upload(MultipartFile[] mfile) throws IOException {

	        if (mfile !=null && mfile.length>0) {
	            for (int i = 0;i<mfile.length;i++){
	                long start = System.currentTimeMillis();
	                System.out.println("-------------------------------------------------");
	                System.out.println("获取文件流"+mfile[i].getInputStream());
	                System.out.println("获取文件的字节大小【byte】"+mfile[i].getSize());
	                System.out.println("文件类型"+mfile[i].getContentType());
	                System.out.println("获取文件数据"+mfile[i].getBytes());
	                System.out.println("文件名字"+mfile[i].getName());
	                System.out.println("获取上传文件的原名"+mfile[i].getOriginalFilename());

	                System.out.println("-------------------------------------------------");

	                try {
	                    String filePath = request.getSession().getServletContext()
	                            .getRealPath("/") + "assets/" +start+ mfile[i].getOriginalFilename();

	                    //转存文件

	                    mfile[i].transferTo(new File(filePath));
	                }catch (Exception e){
	                    e.printStackTrace();
	                }


	            } return "cg";

	        } else {
	            System.out.println("失败");
	            return "sb";
	        }
	    }
}
