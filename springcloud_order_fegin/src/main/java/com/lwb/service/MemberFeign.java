package com.lwb.service;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


//发送http请求，调用service-member工程
@FeignClient(value = "service-member")
public class MemberFeign {

    @RequestMapping("getAllUsers")
    public List<String> getToOrderMemberAll();


}
