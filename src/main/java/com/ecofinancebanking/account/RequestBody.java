package main.java.com.ecofinancebanking.account;

public @interface RequestBody {
    String value() default "";
    String[] requiredFields() default {};
}
