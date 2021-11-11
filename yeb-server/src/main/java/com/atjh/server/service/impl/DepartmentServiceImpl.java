package com.atjh.server.service.impl;

import com.atjh.server.pojo.Department;
import com.atjh.server.mapper.DepartmentMapper;
import com.atjh.server.service.IDepartmentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jiahui
 * @since 2021-11-06
 */
@Service
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department> implements IDepartmentService {

}
