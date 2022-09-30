package com.example.demo.service;

import com.example.demo.model.NewCustomerInput;
import com.example.demo.model.NewCustomerOutput;


import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;


public interface NewCustomer {


    public NewCustomerOutput newCustomer_Vx0( NewCustomerInput cust);


    public NewCustomerOutput newCustomer_Vx101(NewCustomerInput cust);

    public NewCustomerOutput newCustomer_Vx138(NewCustomerInput cust);

    public NewCustomerOutput newCustomer_Vx158( NewCustomerInput cust);

    public NewCustomerOutput newCustomer_Vx197( NewCustomerInput cust);

    public NewCustomerOutput newCustomer_VxA( NewCustomerInput cust);

}