package com.nyg.ssm.service.impl;
import com.nyg.ssm.dao.CustomerLoginDao;
import com.nyg.ssm.entity.CustomerLoginLog;
import com.nyg.ssm.service.CustomerserviceLoginLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * @Author zjl
 * @Date 2019/6/16 14:39
 */
@Service
public class LoginLogserviceImpl implements CustomerserviceLoginLog {
    @Autowired
    public CustomerLoginDao customerLoginDao;
    @Override
    public Integer addLoginLog(CustomerLoginLog customerLoginLog){
        return customerLoginDao.addLoginLog(customerLoginLog);
    };
    @Override
    public List <CustomerLoginLog> getLoginLogs(int customerId, int start, int page){
        return null;
    };
}
