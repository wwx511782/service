package com.service.service.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestService {

    ServiceDelegate serviceDelegate = new ServiceDelegate();


    @Test
    public void helloworld(){

        String expactReturnValue = "hi, Tom! welcome to ServiceStage";
            
            //"hi, wjl!Welcom to ServiceStage"; // You should put the expect String type value here.

        String returnValue = serviceDelegate.helloworld("Tom");

        assertEquals(expactReturnValue, returnValue);
    }

}
