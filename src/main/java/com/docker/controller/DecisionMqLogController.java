package com.docker.controller;

import com.docker.entity.DecisionMqLog;
import com.docker.service.DecisionMqLogService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("decisionMqLogs")
public class DecisionMqLogController {

    @Resource
    private DecisionMqLogService decisionMqLogService;

    @GetMapping("{id}")
    public DecisionMqLog decisionMqLog(@PathVariable("id") Long id){
        return decisionMqLogService.getById(id);
    }

    @GetMapping
    public List<DecisionMqLog> decisionMqLogs(){
        return decisionMqLogService.list();
    }
}
