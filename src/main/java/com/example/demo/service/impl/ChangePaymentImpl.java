package com.example.demo.service.impl;


import com.example.demo.model.ChangePaymentMethodInput;
import com.example.demo.model.ChangePaymentMethodOutput;
import com.example.demo.model.ChangePaymentMethod_Vx0;
import com.example.demo.model.ChangePaymentMethod_VxA;
import com.example.demo.service.ChangePayment;
import org.springframework.stereotype.Service;

import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

@Service
public class ChangePaymentImpl implements ChangePayment {

    @Override
    public ChangePaymentMethodOutput changePaymentMethod_Vx0(ChangePaymentMethodInput input) throws Exception {
        return new ChangePaymentMethod_Vx0().process(input);
    }

    @Override
    public ChangePaymentMethodOutput changePaymentMethod_VxA(ChangePaymentMethodInput input) throws Exception {
        return new ChangePaymentMethod_VxA().process(input);
    }

    @Override
    public ChangePaymentMethodOutput changePaymentMethod_test(ChangePaymentMethodInput input) throws Exception {
        return new ChangePaymentMethod_VxA().hardCodeData(input);
    }
}