/*
 * Copyright 2011-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.services.dynamodbv2.datamodeling;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation to mark a property as using a custom type-converter.
 *
 * <p>May be annotated on a user-defined annotation to pass additional
 * properties to the {@link DynamoDBTypeConverter}.</p>
 *
 * <pre class="brush: java">
 * &#064;CurrencyFormat(separator=&quot; &quot;) //&lt;- user-defined annotation
 * public Currency getCurrency()
 * </pre>
 *
 * <p>Where,</p>
 * <pre class="brush: java">
 * public class Currency {
 *     private Double amount;
 *     private String unit;
 *
 *     public Double getAmount() { return amount; }
 *     public void setAmount(Double amount) { this.amount = amount; }
 *
 *     public String getUnit() { return unit; }
 *     public void setUnit(String unit) { this.unit = unit; }
 * }
 * </pre>
 *
 * <p>And user-defined annotation,</p>
 * <pre class="brush: java">
 * &#064;Target({ElementType.METHOD})
 * &#064;Retention(RetentionPolicy.RUNTIME)
 * &#064;DynamoDBTypeConverted(converter=CurrencyFormat.Converter.class)
 * public &#064;interface CurrencyFormat {
 *
 *     String separator() default &quot; &quot;;
 *
 *     public static class Converter implements DynamoDBTypeConverter&lt;String,Currency&gt; {
 *         private final String separator;
 *         public Converter(final Class&lt;Currency&gt; targetType, final CurrencyFormat annotation) {
 *             this.separator = annotation.separator();
 *         }
 *         public Converter() {
 *             this.separator = &quot;|&quot;;
 *         }
 *         &#064;Override
 *         public String convert(final Currency o) {
 *             return String.valueOf(o.getAmount()) + separator + o.getUnit();
 *         }
 *         &#064;Override
 *         public Currency unconvert(final String o) {
 *             final String[] strings = o.split(separator);
 *             final Currency currency = new Currency();
 *             currency.setAmount(Double.valueOf(strings[0]));
 *             currency.setUnit(strings[1]);
 *             return currency;
 *         }
 *     }
 * }
 * </pre>
 *
 * <p>Alternately, the property/field may be annotated directly (which
 * requires the converter to provide a default constructor or a constructor
 * with only the {@code targetType}),</p>
 * <pre class="brush: java">
 * &#064;DynamoDBTypeConverted(converter=CurrencyFormat.Converter.class)
 * public Currency getCurrency() { return currency; }
 * </pre>
 *
 * <p>All converters are null-safe, a {@code null} value will never be passed
 * to {@link DynamoDBTypeConverter#convert}
 * or {@link DynamoDBTypeConverter#unconvert}.</p>
 *
 * <p>Precedence for selecting a type-converter first goes to getter annotations,
 * then field, then finally type.</p>
 *
 * <p>May be used in combination with {@link DynamoDBTyped} to specify the
 * attribute type binding.</p>
 * <p>Compatible with {@link DynamoDBAutoGeneratedTimestamp}</p>
 *
 * <p>May be used as a meta-annotation.</p>
 */
@DynamoDB
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.ANNOTATION_TYPE})
public @interface DynamoDBTypeConverted {

    /**
     * The class of the converter for this property.
     */
    @SuppressWarnings("rawtypes")
    Class<? extends DynamoDBTypeConverter> converter();

}
