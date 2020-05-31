package com.ivankresic.kotlinlearning.interop;

import com.ivankresic.kotlinlearning.classes.CustomerJava;

import java.util.List;

/**
 * Created by ivan on 31/05/2020
 */
public interface CustomerRepository {

    CustomerJava getById(int id);
    List<CustomerJava> getAll();

}
