package com.nyg.ssm.dao;

import com.nyg.ssm.entity.CustomerLoginLog;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CustomerLoginDao {
    int addLoginLog(CustomerLoginLog customerLoginLog);

    List <CustomerLoginLog> getLoginLogs(int customerId, int start, int page);
}
