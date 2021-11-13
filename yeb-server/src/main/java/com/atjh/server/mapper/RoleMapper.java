package com.atjh.server.mapper;

import com.atjh.server.pojo.Role;
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
public interface RoleMapper extends BaseMapper<Role> {

    /**
     * 根据用户id查询角色列表
     */
    List<Role> getRoles(Integer adminId);
}
