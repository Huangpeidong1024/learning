package cn.itcast.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @Description: TODO
 * @ProjectName: demo
 * @Package: cn.itcast.user.controller
 * @Author: HuangPeiDong
 * @CreateDate: 2020/3/24 7:49
 */
@Controller
@RequestMapping("user")
public class UserController {

    @GetMapping("test")
    @ResponseBody
    public String test() {

        System.out.println("hello");
        return "hello";
    }
}
