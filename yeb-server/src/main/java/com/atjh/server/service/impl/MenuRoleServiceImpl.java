package com.atjh.server.service.impl;

import com.atjh.server.pojo.MenuRole;
import com.atjh.server.mapper.MenuRoleMapper;
import com.atjh.server.pojo.a.RespBean;
import com.atjh.server.service.IMenuRoleService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jiahui
 * @since 2021-11-06
 */
@Service
public class MenuRoleServiceImpl extends ServiceImpl<MenuRoleMapper, MenuRole> implements IMenuRoleService {

    @Autowired
    private MenuRoleMapper menuRoleMapper;

    /**
     * 更新角色菜单
     * @param rid
     * @param mids
     * @return
     */
    @Override
    @Transactional
    public RespBean updateMenuRole(Integer rid, Integer[] mids) {
        menuRoleMapper.delete(new QueryWrapper<MenuRole>().eq("rid",rid));
        if (null==mids || 0==mids.length) {
            return RespBean.success("更新成功");
        }
        Integer result = menuRoleMapper.insertRecord(rid, mids);
        if (result==mids.length) {
            return RespBean.success("更新成功");
        }
        return RespBean.error("更新失败");
    }
}
