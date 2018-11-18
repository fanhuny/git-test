package com.qianfeng.git.test.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author FangYu
 * @Date 2018/11/18
 */
@Controller
@RequestMapping("git")
public class TestMy {
    @RequestMapping("hello")
    public String hello(){
        System.out.println("bloodinheart");
        return "hello";
    }
}
