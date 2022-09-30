package com.example.demo.service;

import com.example.demo.model.NewProductsInput;
import com.example.demo.model.NewProductsOutput;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

public interface NewProduct {


    public NewProductsOutput newProducts_Vx0( NewProductsInput subject) throws Exception;


    public NewProductsOutput newProducts_VxA( NewProductsInput subject) throws Exception;

}