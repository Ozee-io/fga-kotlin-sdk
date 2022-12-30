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

/**
 * 
 *
 * @param id 
 * @param name 
 * @param createdAt 
 * @param updatedAt 
 * @param deletedAt 
 */

data class Store (

    @Json(name = "id")
    val id: kotlin.String? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "created_at")
    val createdAt: java.time.OffsetDateTime? = null,

    @Json(name = "updated_at")
    val updatedAt: java.time.OffsetDateTime? = null,

    @Json(name = "deleted_at")
    val deletedAt: java.time.OffsetDateTime? = null

)
