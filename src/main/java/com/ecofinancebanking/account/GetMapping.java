package com.ecofinancebanking.account;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


public @interface GetMapping {
    
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    @interface InnerGetMapping {
        String value();
    }
    String value();
}
