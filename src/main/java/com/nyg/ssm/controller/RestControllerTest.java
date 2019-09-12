package com.nyg.ssm.controller;

import com.nyg.ssm.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author zjl
 * @Date 2019/6/26 12:13
 */
@Controller
public class RestControllerTest {
    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public String insertUser(@RequestBody User user){
        System.out.println("dfd") ;
        return "no";
    }
}
