package com.example.demo.controller;


import com.example.demo.model.*;

import com.example.demo.service.impl.ChangePaymentImpl;
import com.example.demo.service.impl.ProductDetailImpl;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private ChangePaymentImpl changePayment = new ChangePaymentImpl();

    @RequestMapping(value = "changePaymentMethod_Vx0", method = RequestMethod.POST)
    public ChangePaymentMethodOutput changePaymentMethod_Vx0(@RequestBody ChangePaymentMethodInput input) throws Exception {
        return new ChangePaymentMethod_Vx0().process(input);
    }

    @RequestMapping("changePaymentMethod_test")
    public ChangePaymentMethodOutput changePaymentMethod_test(@RequestBody ChangePaymentMethodInput input) throws Exception {
        return changePayment.changePaymentMethod_test(input);
    }

    @RequestMapping("changePaymentMethod_VxA")
    public ChangePaymentMethodOutput changePaymentMethod_VxA(@RequestBody ChangePaymentMethodInput input) throws Exception {
        return new ChangePaymentMethod_VxA().process(input);
    }

    //==============================================================================================


    @RequestMapping("newCustomer_Vx0")
    public NewCustomerOutput newCustomer_Vx0(@RequestBody NewCustomerInput input) throws Exception {
        return new NewCustomer_Vx0().process(input);
    }

    @RequestMapping("newCustomer_Vx0Test")
    public NewCustomerOutput newCustomer_Vx0Test(@RequestBody NewCustomerInput input) throws Exception {
        return new NewCustomer_Vx0().test(input);
    }

    @RequestMapping("newCustomer_VxA")
    public NewCustomerOutput newCustomer_VxA(@RequestBody NewCustomerInput input) throws Exception {
        return new NewCustomer_VxA().process(input);
    }

    @RequestMapping("newCustomer_Vx101")
    public NewCustomerOutput newCustomer_Vx101(@RequestBody NewCustomerInput input) throws Exception {
        return new NewCustomer_Vx101().process(input);
    }

    @RequestMapping("newCustomer_Vx138")
    public NewCustomerOutput newCustomer_Vx138(@RequestBody NewCustomerInput input) throws Exception {
        return new NewCustomer_Vx138().process(input);
    }

    @RequestMapping("newCustomer_Vx158")
    public NewCustomerOutput newCustomer_Vx158(@RequestBody NewCustomerInput input) throws Exception {
        return new NewCustomer_Vx158().process(input);
    }

    @RequestMapping("newCustomer_Vx197")
    public NewCustomerOutput newCustomer_Vx197(@RequestBody NewCustomerInput input) throws Exception {
        return new NewCustomer_Vx197().process(input);
    }
    //==============================================================================================


    @RequestMapping("NewProducts_Vx0")
    public NewProductsOutput NewProducts_Vx0(@RequestBody NewProductsInput input) throws Exception {
        return new NewProducts_Vx0().test(input);
    }

    @RequestMapping("NewProducts_VxA")
    public NewProductsOutput NewProducts_VxA(@RequestBody NewProductsInput input) throws Exception {
        return new NewProducts_VxA().process(input);
    }
    //===============================================================================================


    private ProductDetailImpl productDetail = new ProductDetailImpl();

    @RequestMapping("productDetail_Vx0")
    public ProductDetailOutput productDetail_Vx0(@RequestBody ProductDetailPojo input) throws Exception {
        return productDetail.productDetail_Vx0_token(input);
    }

    @RequestMapping("productDetail_VxA")
    public ProductDetailOutput productDetail_VxA(@RequestBody ProductDetailInput input) throws Exception {
        return productDetail.productDetail_VxA(input);
    }
}