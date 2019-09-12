package com.nyg.ssm.dao;
import com.nyg.ssm.entity.CustomerAddr;
import com.nyg.ssm.entity.CustomerInf;
import com.nyg.ssm.entity.CustomerLogin;
import com.nyg.ssm.entity.CustomerPointLog;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CustomerDao {
    public int addCustomer(CustomerLogin customerLogin);
    public CustomerInf findCustomerByID(Integer id);
    public int addCustomerInf(CustomerInf customerInf);
    public int addCustomerAddr(CustomerAddr customerAddr);
    public int addCustomerPointLog(CustomerPointLog pointLog);
    public int modifyPointLog(CustomerPointLog pointLog);
    public int getPointSumById(Integer id);
    public List<CustomerPointLog> getPointLog(Integer id,int start,int size);
    public int findAccount(String account);
    public Integer findCustomer(CustomerLogin customerLogin);
    public CustomerInf getCustomerInfById(int id);
    public int findCustomerByNameAndPsd(String loginName,String pwd);
    public int insertHeadUrl(String url);
}
