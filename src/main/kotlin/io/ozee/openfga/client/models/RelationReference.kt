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

package io.ozee.openfga.client.models


import com.squareup.moshi.Json
import java.io.Serializable

/**
 * RelationReference represents a relation of a particular object type (e.g. 'document#viewer').
 *
 * @param type 
 * @param relation 
 * @param wildcard 
 */

data class RelationReference (

    @Json(name = "type")
    val type: kotlin.String,

    @Json(name = "relation")
    val relation: kotlin.String? = null,

    @Json(name = "wildcard")
    val wildcard: kotlin.Any? = null

) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

}

