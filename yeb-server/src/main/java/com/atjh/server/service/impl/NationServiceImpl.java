package com.atjh.server.service.impl;

import com.atjh.server.pojo.Nation;
import com.atjh.server.mapper.NationMapper;
import com.atjh.server.service.INationService;
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
public class NationServiceImpl extends ServiceImpl<NationMapper, Nation> implements INationService {

}
