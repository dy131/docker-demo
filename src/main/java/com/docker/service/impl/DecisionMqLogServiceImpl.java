package com.docker.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.docker.dao.DecisionMqLogMapper;
import com.docker.entity.DecisionMqLog;
import com.docker.service.DecisionMqLogService;

import org.springframework.stereotype.Service;

@Service
public class DecisionMqLogServiceImpl extends ServiceImpl<DecisionMqLogMapper, DecisionMqLog> implements DecisionMqLogService {

}