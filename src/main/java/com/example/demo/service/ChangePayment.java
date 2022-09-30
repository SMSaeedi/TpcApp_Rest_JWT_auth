package com.example.demo.service;


import com.example.demo.model.ChangePaymentMethodInput;
import com.example.demo.model.ChangePaymentMethodOutput;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;


public interface ChangePayment {


    public ChangePaymentMethodOutput changePaymentMethod_VxA(
             ChangePaymentMethodInput input) throws Exception;

    public ChangePaymentMethodOutput changePaymentMethod_test(
             ChangePaymentMethodInput input) throws Exception;

    public ChangePaymentMethodOutput changePaymentMethod_Vx0(
             ChangePaymentMethodInput input) throws Exception ;

}