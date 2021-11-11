package com.atjh.server.controller.a;

import com.atjh.server.pojo.Admin;
import com.atjh.server.pojo.a.AdminLoginParam;
import com.atjh.server.pojo.a.RespBean;
import com.atjh.server.service.IAdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;

@Api(tags = "LoginController")
@RestController
public class LoginController {
    @Autowired
    private IAdminService adminService;

    @ApiOperation(value = "登录之后返回token")
    @PostMapping("login")
    public RespBean login(@RequestBody AdminLoginParam adminLoginParam, HttpServletRequest request){
        return adminService.login(adminLoginParam.getUsername(),adminLoginParam.getPassword(),adminLoginParam.getCode(),request);
    }

    @ApiOperation(value = "获取当前用户登录的信息")
    @PostMapping("admin/info")
    public Admin getAdminInfo(Principal principal){
        if (null==principal) {
            return null;
        }
        String name = principal.getName();
        Admin admin = adminService.getAdminByUserName(name);
        admin.setPassword(null);
        return admin;


    }

    @ApiOperation(value = "退出登录")
    @PostMapping("logout")
    public RespBean logout(){
        return RespBean.success("注销成功!");
    }

}
