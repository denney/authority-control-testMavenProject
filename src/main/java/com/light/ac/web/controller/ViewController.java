package com.light.ac.web.controller;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {
    @RequiresPermissions("user:listUI")
    @RequestMapping("/listUIUser")
    public String listUI() {
        return "user/listUI";
    }

    @RequiresPermissions("role:listUI")
    @RequestMapping("listUIRole")
    public String listUIrole() {

        return "role/listUI";
    }

    @RequiresPermissions("permission:listUI")
    @RequestMapping("listUIPermission")
    public String listUIpermission() {
        return "permission/listUI";
    }
}
