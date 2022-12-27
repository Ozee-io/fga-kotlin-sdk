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

import dev.openfga.kotlin.client.models.Node

import com.squareup.moshi.Json

/**
 * A UsersetTree contains the result of an Expansion.
 *
 * @param root 
 */

data class UsersetTree (

    @Json(name = "root")
    val root: Node? = null

)

