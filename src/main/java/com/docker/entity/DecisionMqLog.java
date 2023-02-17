package com.docker.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;


@Data
@TableName("t_decision_mq_log")
public class DecisionMqLog {

    private Long id;

    
    private String productType;

    
    private String orderId;

    
    private String mqType;

    
    private String mqMsg;

    
    private Integer status;

    
    private Date createTime;
}