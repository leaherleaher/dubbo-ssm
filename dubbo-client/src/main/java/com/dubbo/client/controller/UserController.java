package com.dubbo.client.controller;

import com.dubbo.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value="/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping(value="/getUserList",method = RequestMethod.GET)
    public String list(Model model) {
        //获取列表页
        List list = userService.getListUser();
        model.addAttribute("list", list);
        //list.jsp + model = ModelAndView
        return "list";// /WEB-INF/jsp/"list".jsp
    }
}
