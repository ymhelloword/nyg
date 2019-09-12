package com.nyg.ssm.controller.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author zjl
 * @Date 2019/6/22 13:32
 */
@Controller
public class ResirectTest {
    @RequestMapping(value = "/error",method = RequestMethod.GET)
    public String errorTest(Model model){
        model.addAttribute("name","habuma");
        model.addAttribute("spittlerId",12);
        return "redirect:/error/{name}";
    }
}
