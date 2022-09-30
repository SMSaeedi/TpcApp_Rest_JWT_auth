package com.example.demo.service.impl;

import com.example.demo.model.NewProductsInput;
import com.example.demo.model.NewProductsOutput;
import com.example.demo.model.NewProducts_Vx0;
import com.example.demo.model.NewProducts_VxA;
import com.example.demo.service.NewProduct;
import org.springframework.stereotype.Service;

import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

@Service
public class NewProductImpl implements NewProduct {

    @Override
    public NewProductsOutput newProducts_Vx0(NewProductsInput input) throws Exception {
            return new NewProducts_Vx0().test(input);
    }

    @Override
    public NewProductsOutput newProducts_VxA(NewProductsInput input) throws Exception {
        return new NewProducts_VxA().process(input);
    }

}