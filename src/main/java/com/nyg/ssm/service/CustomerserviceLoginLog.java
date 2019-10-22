package com.nyg.ssm.service;
import com.nyg.ssm.entity.CustomerLoginLog;
import java.util.List;

public interface CustomerserviceLoginLog {
   Integer addLoginLog(CustomerLoginLog customerLoginLog);
    List <CustomerLoginLog> getLoginLogs(int customerId, int start, int page);
}
