package com.atjh.server.service;

import com.atjh.server.pojo.Admin;
import com.atjh.server.pojo.Role;
import com.atjh.server.pojo.a.RespBean;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author jiahui
 * @since 2021-11-06
 */
public interface IAdminService extends IService<Admin> {

    /**
     * 登录之后返回token
     * @param username
     * @param password
     * @param code
     * @param request
     * @return
     */
    RespBean login(String username, String password, String code, HttpServletRequest request);

    /**
     * 根据用户名获取用户
     * @param name
     * @return
     */
    Admin getAdminByUserName(String name);

    /**
     * 根据用户id查询角色列表
     */
    List<Role> getRoles(Integer adminId);
}
