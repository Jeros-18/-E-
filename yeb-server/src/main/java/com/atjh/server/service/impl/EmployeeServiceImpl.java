package com.atjh.server.service.impl;

import com.atjh.server.pojo.Employee;
import com.atjh.server.mapper.EmployeeMapper;
import com.atjh.server.service.IEmployeeService;
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
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements IEmployeeService {

}
