package com.nyg.ssm.controller.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author zjl
 * @Date 2019/6/12 19:02
 */
@Controller
public class Enrol {
    @RequestMapping("/enrol")
    public String enrol(){
        return "registered";
    }
}
