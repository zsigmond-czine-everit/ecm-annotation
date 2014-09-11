package org.everit.osgi.component.annotation.attribute;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Allows to define multiple {@link PasswordAttribute} annotations for one type.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.CLASS)
@Documented
public @interface PasswordAttributes {

    /**
     * List of {@link PasswordAttribute} annotations.
     */
    PasswordAttribute[] value();

}
