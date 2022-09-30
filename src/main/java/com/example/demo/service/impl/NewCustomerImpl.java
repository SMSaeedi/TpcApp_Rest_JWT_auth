package com.example.demo.service.impl;

import com.example.demo.model.*;

import com.example.demo.service.NewCustomer;
import org.springframework.stereotype.Service;

import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;
@Service
public class NewCustomerImpl implements NewCustomer {

    @Override
    public NewCustomerOutput newCustomer_Vx0(NewCustomerInput cust) {
            return new NewCustomer_Vx0().test(cust);
    }

    @Override
    public NewCustomerOutput newCustomer_VxA(NewCustomerInput cust) {
            return new NewCustomer_VxA().process(cust);
    }

    @Override
    public NewCustomerOutput newCustomer_Vx101(NewCustomerInput cust) {
            return new NewCustomer_Vx101().process(cust);
    }

    @Override
    public NewCustomerOutput newCustomer_Vx138(NewCustomerInput cust) {
            return new NewCustomer_Vx138().process(cust);
    }

    @Override
    public NewCustomerOutput newCustomer_Vx158(NewCustomerInput cust) {
            return new NewCustomer_Vx158().process(cust);
    }

    @Override
    public NewCustomerOutput newCustomer_Vx197(NewCustomerInput cust) {
            return new NewCustomer_Vx197().process(cust);
    }

}