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
 * Values: noError,validationError,authorizationModelNotFound,authorizationModelResolutionTooComplex,invalidWriteInput,cannotAllowDuplicateTuplesInOneRequest,cannotAllowDuplicateTypesInOneRequest,cannotAllowMultipleReferencesToOneRelation,invalidContinuationToken,invalidTupleSet,invalidCheckInput,invalidExpandInput,unsupportedUserSet,invalidObjectFormat,writeFailedDueToInvalidInput,authorizationModelAssertionsNotFound,latestAuthorizationModelNotFound,typeNotFound,relationNotFound,emptyRelationDefinition,invalidUser,invalidTuple,unknownRelation,storeIdInvalidLength,assertionsTooManyItems,idTooLong,authorizationModelIdTooLong,tupleKeyValueNotSpecified,tupleKeysTooManyOrTooFewItems,pageSizeInvalid,paramMissingValue,differenceBaseMissingValue,subtractBaseMissingValue,objectTooLong,relationTooLong,typeDefinitionsTooFewItems,typeInvalidLength,typeInvalidPattern,relationsTooFewItems,relationsTooLong,relationsInvalidPattern,objectInvalidPattern,queryStringTypeContinuationTokenMismatch,exceededEntityLimit,invalidContextualTuple,duplicateContextualTuple,invalidAuthorizationModel,unsupportedSchemaVersion
 */

enum class ErrorCode(val value: kotlin.String) {

    @Json(name = "no_error")
    noError("no_error"),

    @Json(name = "validation_error")
    validationError("validation_error"),

    @Json(name = "authorization_model_not_found")
    authorizationModelNotFound("authorization_model_not_found"),

    @Json(name = "authorization_model_resolution_too_complex")
    authorizationModelResolutionTooComplex("authorization_model_resolution_too_complex"),

    @Json(name = "invalid_write_input")
    invalidWriteInput("invalid_write_input"),

    @Json(name = "cannot_allow_duplicate_tuples_in_one_request")
    cannotAllowDuplicateTuplesInOneRequest("cannot_allow_duplicate_tuples_in_one_request"),

    @Json(name = "cannot_allow_duplicate_types_in_one_request")
    cannotAllowDuplicateTypesInOneRequest("cannot_allow_duplicate_types_in_one_request"),

    @Json(name = "cannot_allow_multiple_references_to_one_relation")
    cannotAllowMultipleReferencesToOneRelation("cannot_allow_multiple_references_to_one_relation"),

    @Json(name = "invalid_continuation_token")
    invalidContinuationToken("invalid_continuation_token"),

    @Json(name = "invalid_tuple_set")
    invalidTupleSet("invalid_tuple_set"),

    @Json(name = "invalid_check_input")
    invalidCheckInput("invalid_check_input"),

    @Json(name = "invalid_expand_input")
    invalidExpandInput("invalid_expand_input"),

    @Json(name = "unsupported_user_set")
    unsupportedUserSet("unsupported_user_set"),

    @Json(name = "invalid_object_format")
    invalidObjectFormat("invalid_object_format"),

    @Json(name = "write_failed_due_to_invalid_input")
    writeFailedDueToInvalidInput("write_failed_due_to_invalid_input"),

    @Json(name = "authorization_model_assertions_not_found")
    authorizationModelAssertionsNotFound("authorization_model_assertions_not_found"),

    @Json(name = "latest_authorization_model_not_found")
    latestAuthorizationModelNotFound("latest_authorization_model_not_found"),

    @Json(name = "type_not_found")
    typeNotFound("type_not_found"),

    @Json(name = "relation_not_found")
    relationNotFound("relation_not_found"),

    @Json(name = "empty_relation_definition")
    emptyRelationDefinition("empty_relation_definition"),

    @Json(name = "invalid_user")
    invalidUser("invalid_user"),

    @Json(name = "invalid_tuple")
    invalidTuple("invalid_tuple"),

    @Json(name = "unknown_relation")
    unknownRelation("unknown_relation"),

    @Json(name = "store_id_invalid_length")
    storeIdInvalidLength("store_id_invalid_length"),

    @Json(name = "assertions_too_many_items")
    assertionsTooManyItems("assertions_too_many_items"),

    @Json(name = "id_too_long")
    idTooLong("id_too_long"),

    @Json(name = "authorization_model_id_too_long")
    authorizationModelIdTooLong("authorization_model_id_too_long"),

    @Json(name = "tuple_key_value_not_specified")
    tupleKeyValueNotSpecified("tuple_key_value_not_specified"),

    @Json(name = "tuple_keys_too_many_or_too_few_items")
    tupleKeysTooManyOrTooFewItems("tuple_keys_too_many_or_too_few_items"),

    @Json(name = "page_size_invalid")
    pageSizeInvalid("page_size_invalid"),

    @Json(name = "param_missing_value")
    paramMissingValue("param_missing_value"),

    @Json(name = "difference_base_missing_value")
    differenceBaseMissingValue("difference_base_missing_value"),

    @Json(name = "subtract_base_missing_value")
    subtractBaseMissingValue("subtract_base_missing_value"),

    @Json(name = "object_too_long")
    objectTooLong("object_too_long"),

    @Json(name = "relation_too_long")
    relationTooLong("relation_too_long"),

    @Json(name = "type_definitions_too_few_items")
    typeDefinitionsTooFewItems("type_definitions_too_few_items"),

    @Json(name = "type_invalid_length")
    typeInvalidLength("type_invalid_length"),

    @Json(name = "type_invalid_pattern")
    typeInvalidPattern("type_invalid_pattern"),

    @Json(name = "relations_too_few_items")
    relationsTooFewItems("relations_too_few_items"),

    @Json(name = "relations_too_long")
    relationsTooLong("relations_too_long"),

    @Json(name = "relations_invalid_pattern")
    relationsInvalidPattern("relations_invalid_pattern"),

    @Json(name = "object_invalid_pattern")
    objectInvalidPattern("object_invalid_pattern"),

    @Json(name = "query_string_type_continuation_token_mismatch")
    queryStringTypeContinuationTokenMismatch("query_string_type_continuation_token_mismatch"),

    @Json(name = "exceeded_entity_limit")
    exceededEntityLimit("exceeded_entity_limit"),

    @Json(name = "invalid_contextual_tuple")
    invalidContextualTuple("invalid_contextual_tuple"),

    @Json(name = "duplicate_contextual_tuple")
    duplicateContextualTuple("duplicate_contextual_tuple"),

    @Json(name = "invalid_authorization_model")
    invalidAuthorizationModel("invalid_authorization_model"),

    @Json(name = "unsupported_schema_version")
    unsupportedSchemaVersion("unsupported_schema_version");

    /**
     * Override toString() to avoid using the enum variable name as the value, and instead use
     * the actual value defined in the API spec file.
     *
     * This solves a problem when the variable name and its value are different, and ensures that
     * the client sends the correct enum values to the server always.
     */
    override fun toString(): String = value

    companion object {
        /**
         * Converts the provided [data] to a [String] on success, null otherwise.
         */
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is ErrorCode) "$data" else null

        /**
         * Returns a valid [ErrorCode] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): ErrorCode? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

