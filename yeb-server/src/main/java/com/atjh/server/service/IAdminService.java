package com.atjh.server.service;

import com.atjh.server.pojo.Admin;
import com.atjh.server.pojo.a.RespBean;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author jiahui
 * @since 2021-11-06
 */
public interface IAdminService extends IService<Admin> {

    RespBean login(String username, String password, String code, HttpServletRequest request);

    Admin getAdminByUserName(String name);
}
