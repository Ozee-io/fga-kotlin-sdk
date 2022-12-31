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

import io.ozee.openfga.client.models.ErrorCode

import com.squareup.moshi.Json
import java.io.Serializable

/**
 * 
 *
 * @param code 
 * @param message 
 */

data class ValidationErrorMessageResponse (

    @Json(name = "code")
    val code: ErrorCode? = ErrorCode.noError,

    @Json(name = "message")
    val message: kotlin.String? = null

) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

}

