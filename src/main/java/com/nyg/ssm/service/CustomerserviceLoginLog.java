package com.nyg.ssm.service;
import com.nyg.ssm.entity.CustomerLoginLog;
import java.util.List;

public interface CustomerserviceLoginLog {
    public Integer addLoginLog(CustomerLoginLog customerLoginLog);
    public List <CustomerLoginLog> getLoginLogs(int customerId, int start, int page);
}
