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
 * @param allowed 
 * @param resolution For internal use only.
 */

data class CheckResponse (

    @Json(name = "allowed")
    val allowed: kotlin.Boolean? = null,

    /* For internal use only. */
    @Json(name = "resolution")
    val resolution: kotlin.String? = null

)
