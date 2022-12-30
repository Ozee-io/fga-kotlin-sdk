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
import dev.openfga.kotlin.client.models.TupleOperation

import com.squareup.moshi.Json

/**
 * 
 *
 * @param tupleKey 
 * @param operation 
 * @param timestamp 
 */

data class TupleChange (

    @Json(name = "tuple_key")
    val tupleKey: TupleKey? = null,

    @Json(name = "operation")
    val operation: TupleOperation? = TupleOperation.wRITE,

    @Json(name = "timestamp")
    val timestamp: java.time.OffsetDateTime? = null

)

