package com.lwb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

                 // @RestController  原来让一个普通类变成控制器@Controller
@RestController  // @RestController = @Controller + @ResponseBody
public class MenberController {
    //控制器方法，返回的都是json数据
    @RequestMapping("/getAllUsers")
    public List<String> getAllUsers(){
        List<String> list=new ArrayList<String>();
        list.add("2017");
        list.add("2018");
        list.add("2019");
//        list.add("server");
        return list;
    }
}
