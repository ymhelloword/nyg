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
    int addCustomer(CustomerLogin customerLogin);

    CustomerInf findCustomerByID(Integer id);

    int addCustomerInf(CustomerInf customerInf);

    int addCustomerAddr(CustomerAddr customerAddr);

    int addCustomerPointLog(CustomerPointLog pointLog);

    int modifyPointLog(CustomerPointLog pointLog);

    int getPointSumById(Integer id);

    List <CustomerPointLog> getPointLog(Integer id, int start, int size);

    int findAccount(String account);

    Integer findCustomer(CustomerLogin customerLogin);

    CustomerInf getCustomerInfById(int id);

    int findCustomerByNameAndPsd(String loginName, String pwd);

    int insertHeadUrl(String url);
    int updatePassword(@Param("phoneNumber") String phoneNumber,@Param("pwd") String pwd);
}
