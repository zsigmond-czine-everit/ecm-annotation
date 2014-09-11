package org.everit.osgi.component.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.everit.osgi.component.annotation.attribute.ReferenceType;

@Target({ ElementType.TYPE, ElementType.FIELD, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Reference {

    ReferenceType attributeType() default ReferenceType.DEFAULT;

    /**
     * The bind method that should be used to bind the reference. If the annotation is defined on a method, that method
     * and it is not specified otherwise in the annotation, the method will be used as a setter. If the annotation is
     * attached to a field and the bind method is not defined in the annotation and there is.
     */
    String bind() default "";

    /**
     * Cardinality of the reference. In case the annotation is appended to a field or method, only those cardinalities
     * are allowed that meet the type of the method/field.
     */
    Cardinality cardinality();

    /**
     * The default clause(s) or OSGi filter(s) of the reference.
     */
    String[] defaultValue() default {};

    /**
     * A descriptive text to provide the client in a form to configure this property. This name may be localized by
     * prepending a % sign to the name. Default value: %&lt;name&gt;.description
     */
    String description() default "";

    /**
     * If true, the reference is re-binded without restarting the component in case of a service switch. The component
     * also does not stop if the configuration is updated behind in the way that the reference can remain satisfied
     * after the actualization of the clause(s) or filter(s).
     */
    boolean dynamic() default false;

    /**
     * The label to display in a form to configure this property. This name may be localized by prepending a % sign to
     * the name. Default value: %&lt;name&gt;.name
     */
    String label() default "";

    /**
     * The name of the reference.
     */
    String name() default "";

    /**
     * Boolean flag defining whether the property should be listed in the MetatypeProvider or not.
     */
    boolean propertyPrivate() default false;
}
