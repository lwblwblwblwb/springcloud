package com.lwb.day01;


import com.opensymphony.xwork2.Action;

//一个普通类如何变成一个处理器，可以处理客户端请求
     //Service     Service
     //Controller     Controller
     //Action     implements Action

public class HelloAction implements Action {

    //执行
    @Override
    public String execute() throws Exception {
        return "login";//返回的是逻辑视图名
    }
}
