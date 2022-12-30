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

import dev.openfga.kotlin.client.models.Computed
import dev.openfga.kotlin.client.models.Users
import dev.openfga.kotlin.client.models.UsersetTreeTupleToUserset

import com.squareup.moshi.Json

/**
 * A leaf node contains either - a set of users (which may be individual users, or usersets   referencing other relations) - a computed node, which is the result of a computed userset   value in the authorization model - a tupleToUserset nodes, containing the result of expanding   a tupleToUserset value in a authorization model.
 *
 * @param users 
 * @param computed 
 * @param tupleToUserset 
 */

data class Leaf (

    @Json(name = "users")
    val users: Users? = null,

    @Json(name = "computed")
    val computed: Computed? = null,

    @Json(name = "tupleToUserset")
    val tupleToUserset: UsersetTreeTupleToUserset? = null

)

