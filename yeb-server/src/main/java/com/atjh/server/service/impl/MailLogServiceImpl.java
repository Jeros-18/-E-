package com.atjh.server.service.impl;

import com.atjh.server.pojo.MailLog;
import com.atjh.server.mapper.MailLogMapper;
import com.atjh.server.service.IMailLogService;
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
public class MailLogServiceImpl extends ServiceImpl<MailLogMapper, MailLog> implements IMailLogService {

}
