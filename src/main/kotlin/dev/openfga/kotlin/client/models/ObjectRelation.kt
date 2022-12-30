/**
 * OpenFGA
 *
 * A high performance and flexible authorization/permission engine built for developers and inspired by Google Zanzibar.
 *
 * The version of the OpenAPI document: 0.1
 * Contact: community@openfga.dev
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package dev.openfga.kotlin.client.models


import com.squareup.moshi.Json

/**
 * 
 *
 * @param `object` 
 * @param relation 
 */

data class ObjectRelation (

    @Json(name = "object")
    val `object`: kotlin.String? = null,

    @Json(name = "relation")
    val relation: kotlin.String? = null

)

