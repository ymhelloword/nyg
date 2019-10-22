package com.nyg.ssm.service;

import com.nyg.ssm.entity.CustomerAddr;
import com.nyg.ssm.entity.CustomerInf;
import com.nyg.ssm.entity.CustomerLogin;
import com.nyg.ssm.entity.CustomerPointLog;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface Customersevrice {
    /**
     * 添加user登录账号及密码
     *
     * @param customerLogin
     * @return 添加的条数
     * @dateTime 2019/5/23 19:13
     */
    int addCustomerLogin(CustomerLogin customerLogin);

    /**
     * 添加user详细信息
     *
     * @param customerInf
     * @return int
     * @dateTime 2019/5/23 19:16
     */
    int addCustomerInf(CustomerInf customerInf, CommonsMultipartFile commonsMultipartFile);

    /**
     * 通过userID找到user
     *
     * @param id
     * @return customer
     * @dateTime 2019/5/23 19:32
     */
    CustomerInf findCustomerByID(Integer id);

    /**
     * 添加user地址信息
     *
     * @param customerAddr
     * @return int
     * @dateTime 2019/5/23 19:33
     */
    int addCustomerAddr(CustomerAddr customerAddr);

    int addCustomerPointLog(CustomerPointLog pointLog);

    int modifyPointLog(CustomerPointLog pointLog);

    int finAccount(String account);

    Integer findCustomer(CustomerLogin customerLogin);

    CustomerInf findCustomerInfById(int id);

    int findCustomerByNameAndPsd(String loginName, String password);

    int checkAddr(int customerId);
    int updatePassword(String phoneNumber,String pwd);

}
