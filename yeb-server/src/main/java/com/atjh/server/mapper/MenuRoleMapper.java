package com.atjh.server.mapper;

import com.atjh.server.pojo.MenuRole;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.swagger.models.auth.In;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author jiahui
 * @since 2021-11-06
 */
public interface MenuRoleMapper extends BaseMapper<MenuRole> {

    /**
     * 批量更新角色菜单
     * @param rid
     * @param mids
     */
    Integer insertRecord(@Param("rid") Integer rid, @Param("mids") Integer[] mids);
}
