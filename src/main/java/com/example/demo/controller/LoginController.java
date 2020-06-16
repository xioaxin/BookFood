package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.entity.VerifyCode;
import com.example.demo.service.IVerifyCodeGen;
import com.example.demo.service.impl.SimpleCharVerifyCodeGenImpl;
import com.sun.org.apache.bcel.internal.classfile.Code;
import javafx.geometry.Pos;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Description:
 * @author: ZPX
 * @createDate: 2020/6/16 10:51
 * @version: 1.0
 */
@Controller
public class LoginController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String gotoLoginPage() {
        return "index";
    }

    @ResponseBody
    @GetMapping("/verifyCode")
    public void verifyCode(HttpServletRequest request, HttpServletResponse response, Model model) {
        IVerifyCodeGen iVerifyCodeGen = new SimpleCharVerifyCodeGenImpl();;
        try {
            //设置长宽
            VerifyCode verifyCode = iVerifyCodeGen.generate(80, 28);
             String code= verifyCode.getCode();
            logger.info(code);
            model.addAttribute("code", code);
            //将VerifyCode绑定session
            request.getSession().setAttribute("VerifyCode", code);
            //设置响应头
            response.setHeader("Pragma", "no-cache");
            //设置响应头
            response.setHeader("Cache-Control", "no-cache");
            //在代理服务器端防止缓冲
            response.setDateHeader("Expires", 0);
            //设置响应内容类型
            response.setContentType("image/jpeg");
            response.getOutputStream().write(verifyCode.getImgBytes());
            response.getOutputStream().flush();
        } catch (IOException e) {
            logger.info("", e);
        }
    }
    @ResponseBody
    @RequestMapping(value = "/getCode",method = RequestMethod.POST)
    public  Object getCode(@SessionAttribute("VerifyCode") String code){
        logger.info("getCode "+code);
        System.out.println(code+"Hello");
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("code",code);
        return  jsonObject;
    }
}




