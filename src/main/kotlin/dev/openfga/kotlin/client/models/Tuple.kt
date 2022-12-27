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

import dev.openfga.kotlin.client.models.TupleKey

import com.squareup.moshi.Json

/**
 * 
 *
 * @param key 
 * @param timestamp 
 */

data class Tuple (

    @Json(name = "key")
    val key: TupleKey? = null,

    @Json(name = "timestamp")
    val timestamp: java.time.OffsetDateTime? = null

)

