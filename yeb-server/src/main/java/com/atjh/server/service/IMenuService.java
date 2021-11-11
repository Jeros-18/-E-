package com.atjh.server.service;

import com.atjh.server.pojo.Menu;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author jiahui
 * @since 2021-11-06
 */
public interface IMenuService extends IService<Menu> {


    /**
     * 通过用户id查询菜单列表
     * @return
     */
    List<Menu> getMenusByAdminId();
}
