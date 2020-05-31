package com.ivankresic.kotlinlearning.interop;

import com.ivankresic.kotlinlearning.classes.CustomerKotlin;
import com.ivankresic.kotlinlearning.classes.CustomerKotlinKt;
import com.ivankresic.kotlinlearning.classes.Status;

import java.io.IOException;

/**
 * Created by ivan on 31/05/2020
 */
public class TalkingToKotlin {


    /**
     * Using Throws annotation we can tell Java witch Exception can be expected in catch block
     * Otherwise we would get error in catch block
     * */
    public void loadStats(CustomerKotlin customerKotlin){
        try {
            customerKotlin.loadStatistics("filename ");
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }


    public static void main(String[] args){
        CustomerKotlin customerKotlin = new CustomerKotlin(1, "Hadi", "mail@mail.com", null);


        /**
         * Because writing Java, we have to use Java convention, so we have to use getters and setters here
         * and not property like in kotlin
         * */
        customerKotlin.setEmail("mail@mail.com");


        /**
         * Because of no-field <-> everything is a property concept in kotlin, we cannot access field from Java
         * unless we annotate property in Kotlin with @JvmField annotation
         * So actually accessing property as field from Java
         * */

        String value = customerKotlin.someField;


        customerKotlin.changeStatur(Status.CURRENT);


        /**
         * Usually we cannot call a member like this from Java, because not instancing default value
         * But using JvmOverloads
         * */
        customerKotlin.changeStatur();


        /**
         * Using @JvmName in Kotlin we can change the name of the member we are calling from Java
         * */
        customerKotlin.preferential();


        /**
         * This way we can access top level functions from Java
         * */
        UtilityFunctions.prefix("pre", "fix");
        int copyrightYear = UtilityFunctions.CopyrightYear;



        /**
         * This way we can access extension members in kotlin, but we also need to pass instance as a paramater
         * */
        CustomerKotlinKt.extension(customerKotlin);
    }

}
