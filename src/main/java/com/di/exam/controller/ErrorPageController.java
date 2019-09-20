package com.di.exam.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

//错误页面处理
@Controller
public class ErrorPageController implements ErrorController {
    @Override
    public String getErrorPath() {
        return "/error";
    }

    @RequestMapping("/error")
    public String resolveError(HttpServletRequest request){
        int stateCode= (int) request.getAttribute("javax.servlet.error.status_code");
        return ""+stateCode;
    }

    @RequestMapping("/404")
    public String error404(){
        return "404";
    }
}
