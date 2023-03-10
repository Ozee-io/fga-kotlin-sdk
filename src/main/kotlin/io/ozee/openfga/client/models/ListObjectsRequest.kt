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

import io.ozee.openfga.client.models.ContextualTupleKeys

import com.squareup.moshi.Json
import java.io.Serializable

/**
 * 
 *
 * @param type 
 * @param relation 
 * @param user 
 * @param authorizationModelId 
 * @param contextualTuples 
 */

data class ListObjectsRequest (

    @Json(name = "type")
    val type: kotlin.String,

    @Json(name = "relation")
    val relation: kotlin.String,

    @Json(name = "user")
    val user: kotlin.String,

    @Json(name = "authorization_model_id")
    val authorizationModelId: kotlin.String? = null,

    @Json(name = "contextual_tuples")
    val contextualTuples: ContextualTupleKeys? = null

) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

}

