package com.example.demo.service.impl;

import com.example.demo.model.*;
import com.example.demo.service.ProductDetail;
import org.springframework.stereotype.Service;

import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;
import java.sql.Connection;

@Service
public class ProductDetailImpl implements ProductDetail {

    @Override
    public ProductDetailOutput productDetail_Vx0(ProductDetailInput input) throws Exception {
        Connection conn = null;
        return new ProductDetail_Vx0().getData(conn, input);
    }

    public ProductDetailOutput productDetail_Vx0_token(ProductDetailPojo input) throws Exception {
        return new ProductDetail_Vx0().getHardCodeData(input);
    }

    @Override
    public ProductDetailOutput productDetail_VxA(ProductDetailInput input) throws Exception {
        return new ProductDetail_VxA().process(input);
    }

}