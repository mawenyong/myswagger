package com.myswagger.controller;

import com.myswagger.model.Role;
import com.myswagger.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/Role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @RequestMapping(value = "/getStr")
    public String getStr(String str){
        return "你输入的名字叫"+str;
    }

    /*跨域访问*/
    @CrossOrigin
    @RequestMapping(value = "/getOne")
    public Role getOne(Integer rid){
        System.out.println("输入的数据为："+rid);
        return roleService.selectByPrimaryKey(rid);
    }

    public Role getLog(Role role){
        if (role!=null){
            roleService.selectByPrimaryKey(role.getRid());
        }
    }
}
