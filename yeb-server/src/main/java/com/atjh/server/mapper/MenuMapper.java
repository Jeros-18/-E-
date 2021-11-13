package com.atjh.server.mapper;

import com.atjh.server.pojo.Menu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author jiahui
 * @since 2021-11-06
 */
public interface MenuMapper extends BaseMapper<Menu> {

    List<Menu> getMenusByIdAdminId(Integer id);

    List<Menu> getMenusWithRole();

    /**
     * 查询所有菜单
     * @return
     */
    List<Menu> getAllMenus();
}
