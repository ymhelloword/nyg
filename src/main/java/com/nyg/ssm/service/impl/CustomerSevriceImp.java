package com.nyg.ssm.service.impl;

import com.nyg.ssm.dao.CustomerDao;
import com.nyg.ssm.entity.*;
import com.nyg.ssm.service.Customersevrice;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;

/**
 * @Author zjl
 * @Date 2019/5/23 19:12
 */
@Service
public class CustomerSevriceImp implements Customersevrice {
    @Resource
    private CustomerDao customerDao;
    @Override
    public int addCustomerLogin(CustomerLogin customerLogin) {
        return customerDao.addCustomer(customerLogin);
    }
    @Override
    public int addCustomerInf(CustomerInf customerInf, CommonsMultipartFile commonsMultipartFile) {

        customerDao.addCustomerInf(customerInf);
        if ( !StringUtils.isEmpty(commonsMultipartFile) ){
            String headPortrait = customerInf.getCustomerId()+"."+commonsMultipartFile.getOriginalFilename().split("\\.")[1];
            System.out.println(headPortrait+".........") ;
            File file = new File("/usr/local/static/imgs/avatar/"+headPortrait);
            try {
                FileUtils.writeByteArrayToFile(file,commonsMultipartFile.getBytes());
            } catch ( IOException e ) {
                e.printStackTrace( );
                return 0;
            }

        }

        return 1;
    }
    @Override
    public CustomerInf findCustomerByID(Integer id) {
        return customerDao.findCustomerByID(id);
    }
    @Override
    public int addCustomerAddr(CustomerAddr customerAddr) {
        return customerDao.addCustomerAddr(customerAddr);
    }

    @Override
    public int addCustomerPointLog(CustomerPointLog pointLog) {
        return customerDao.addCustomerPointLog(pointLog);
    }

    @Override
    public int modifyPointLog(CustomerPointLog pointLog) {
        return customerDao.modifyPointLog(pointLog);
    }

    @Override
    public int finAccount(String account) {
        return customerDao.findAccount(account);
    }

    @Override
    public Integer findCustomer(CustomerLogin customerLogin) {
        return customerDao.findCustomer(customerLogin);
    }

    @Override
    public CustomerInf findCustomerInfById(int id) {
        return customerDao.getCustomerInfById(id);
    }

    @Override
    public int findCustomerByNameAndPsd(String loginName, String password) {
        return customerDao.findCustomerByNameAndPsd(loginName,password);
    }

    @Override
    public int checkAddr(int customerId) {
        return 0;
    }
}
