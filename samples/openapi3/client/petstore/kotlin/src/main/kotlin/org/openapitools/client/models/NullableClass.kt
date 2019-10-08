/**
* OpenAPI Petstore
* This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
*
* The version of the OpenAPI document: 1.0.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.client.models


import com.squareup.moshi.Json
import java.io.Serializable
/**
 * 
 * @param integerProp 
 * @param numberProp 
 * @param booleanProp 
 * @param stringProp 
 * @param dateProp 
 * @param datetimeProp 
 * @param arrayNullableProp 
 * @param arrayAndItemsNullableProp 
 * @param arrayItemsNullable 
 * @param objectNullableProp 
 * @param objectAndItemsNullableProp 
 * @param objectItemsNullable 
 */

data class NullableClass (
    @Json(name = "integer_prop")
    val integerProp: kotlin.Int? = null,
    @Json(name = "number_prop")
    val numberProp: java.math.BigDecimal? = null,
    @Json(name = "boolean_prop")
    val booleanProp: kotlin.Boolean? = null,
    @Json(name = "string_prop")
    val stringProp: kotlin.String? = null,
    @Json(name = "date_prop")
    val dateProp: java.time.LocalDate? = null,
    @Json(name = "datetime_prop")
    val datetimeProp: java.time.LocalDateTime? = null,
    @Json(name = "array_nullable_prop")
    val arrayNullableProp: kotlin.Array<kotlin.Any>? = null,
    @Json(name = "array_and_items_nullable_prop")
    val arrayAndItemsNullableProp: kotlin.Array<kotlin.Any>? = null,
    @Json(name = "array_items_nullable")
    val arrayItemsNullable: kotlin.Array<kotlin.Any>? = null,
    @Json(name = "object_nullable_prop")
    val objectNullableProp: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null,
    @Json(name = "object_and_items_nullable_prop")
    val objectAndItemsNullableProp: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null,
    @Json(name = "object_items_nullable")
    val objectItemsNullable: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null
) 
: Serializable 


