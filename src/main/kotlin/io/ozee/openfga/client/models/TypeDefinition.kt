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

import io.ozee.openfga.client.models.Metadata
import io.ozee.openfga.client.models.Userset

import com.squareup.moshi.Json

/**
 * 
 *
 * @param type 
 * @param relations 
 * @param metadata 
 */

data class TypeDefinition (

    @Json(name = "type")
    val type: kotlin.String,

    @Json(name = "relations")
    val relations: kotlin.collections.Map<kotlin.String, Userset>? = null,

    @Json(name = "metadata")
    val metadata: Metadata? = null

)
