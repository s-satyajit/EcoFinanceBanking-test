package com.ecofinancebanking.account;


public @interface PathVariable {
    String value() default "";
}
enum Identifier {} // Removed @Retention annotation
enum EnumBody {} // Added EnumBody to complete EnumDeclaration
// Remove the duplicate declaration of PathVariable annotation
// public @interface PathVariable {
//     String value() default "";
// }
