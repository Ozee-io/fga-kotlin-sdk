# OpenFgaApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**check**](OpenFgaApi.md#check) | **POST** /stores/{store_id}/check | Check whether a user is authorized to access an object
[**createStore**](OpenFgaApi.md#createStore) | **POST** /stores | Create a store
[**deleteStore**](OpenFgaApi.md#deleteStore) | **DELETE** /stores/{store_id} | Delete a store
[**expand**](OpenFgaApi.md#expand) | **POST** /stores/{store_id}/expand | Expand all relationships in userset tree format, and following userset rewrite rules.  Useful to reason about and debug a certain relationship
[**getStore**](OpenFgaApi.md#getStore) | **GET** /stores/{store_id} | Get a store
[**listObjects**](OpenFgaApi.md#listObjects) | **POST** /stores/{store_id}/list-objects | [EXPERIMENTAL] Get all objects of the given type that the user has a relation with
[**listStores**](OpenFgaApi.md#listStores) | **GET** /stores | List all stores
[**read**](OpenFgaApi.md#read) | **POST** /stores/{store_id}/read | Get tuples from the store that matches a query, without following userset rewrite rules
[**readAssertions**](OpenFgaApi.md#readAssertions) | **GET** /stores/{store_id}/assertions/{authorization_model_id} | Read assertions for an authorization model ID
[**readAuthorizationModel**](OpenFgaApi.md#readAuthorizationModel) | **GET** /stores/{store_id}/authorization-models/{id} | Return a particular version of an authorization model
[**readAuthorizationModels**](OpenFgaApi.md#readAuthorizationModels) | **GET** /stores/{store_id}/authorization-models | Return all the authorization models for a particular store
[**readChanges**](OpenFgaApi.md#readChanges) | **GET** /stores/{store_id}/changes | Return a list of all the tuple changes
[**write**](OpenFgaApi.md#write) | **POST** /stores/{store_id}/write | Add or delete tuples from the store
[**writeAssertions**](OpenFgaApi.md#writeAssertions) | **PUT** /stores/{store_id}/assertions/{authorization_model_id} | Upsert assertions for an authorization model ID
[**writeAuthorizationModel**](OpenFgaApi.md#writeAuthorizationModel) | **POST** /stores/{store_id}/authorization-models | Create a new authorization model


<a name="check"></a>
# **check**
> CheckResponse check(storeId, body)

Check whether a user is authorized to access an object

The Check API queries to check if the user has a certain relationship with an object in a certain store. A &#x60;contextual_tuples&#x60; object may also be included in the body of the request. This object contains one field &#x60;tuple_keys&#x60;, which is an array of tuple keys. You may also provide an &#x60;authorization_model_id&#x60; in the body. This will be used to assert that the input &#x60;tuple_key&#x60; is valid for the model specified. If not specified, the assertion will be made against the latest authorization model ID. The response will return whether the relationship exists in the field &#x60;allowed&#x60;.  ## Example In order to check if user &#x60;user:anne&#x60; of type &#x60;user&#x60; has a &#x60;reader&#x60; relationship with object &#x60;document:2021-budget&#x60; given the following contextual tuple &#x60;&#x60;&#x60;json {   \&quot;user\&quot;: \&quot;user:anne\&quot;,   \&quot;relation\&quot;: \&quot;member\&quot;,   \&quot;object\&quot;: \&quot;time_slot:office_hours\&quot; } &#x60;&#x60;&#x60; the Check API can be used with the following request body: &#x60;&#x60;&#x60;json {   \&quot;tuple_key\&quot;: {     \&quot;user\&quot;: \&quot;user:anne\&quot;,     \&quot;relation\&quot;: \&quot;reader\&quot;,     \&quot;object\&quot;: \&quot;document:2021-budget\&quot;   },   \&quot;contextual_tuples\&quot;: {     \&quot;tuple_keys\&quot;: [       {         \&quot;user\&quot;: \&quot;user:anne\&quot;,         \&quot;relation\&quot;: \&quot;member\&quot;,         \&quot;object\&quot;: \&quot;time_slot:office_hours\&quot;       }     ]   } } &#x60;&#x60;&#x60; OpenFGA&#39;s response will include &#x60;{ \&quot;allowed\&quot;: true }&#x60; if there is a relationship and &#x60;{ \&quot;allowed\&quot;: false }&#x60; if there isn&#39;t.

### Example
```kotlin
// Import classes:
//import dev.openfga.kotlin.client.infrastructure.*
//import dev.openfga.kotlin.client.models.*

val apiInstance = OpenFgaApi()
val storeId : kotlin.String = storeId_example // kotlin.String | 
val body : CheckRequest =  // CheckRequest | 
try {
    val result : CheckResponse = apiInstance.check(storeId, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OpenFgaApi#check")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OpenFgaApi#check")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **kotlin.String**|  |
 **body** | [**CheckRequest**](CheckRequest.md)|  |

### Return type

[**CheckResponse**](CheckResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createStore"></a>
# **createStore**
> CreateStoreResponse createStore(body)

Create a store

Create a unique OpenFGA store which will be used to store authorization models and relationship tuples.

### Example
```kotlin
// Import classes:
//import dev.openfga.kotlin.client.infrastructure.*
//import dev.openfga.kotlin.client.models.*

val apiInstance = OpenFgaApi()
val body : CreateStoreRequest =  // CreateStoreRequest | 
try {
    val result : CreateStoreResponse = apiInstance.createStore(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OpenFgaApi#createStore")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OpenFgaApi#createStore")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateStoreRequest**](CreateStoreRequest.md)|  |

### Return type

[**CreateStoreResponse**](CreateStoreResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteStore"></a>
# **deleteStore**
> deleteStore(storeId)

Delete a store

Delete an OpenFGA store. This does not delete the data associated with the store, like tuples or authorization models.

### Example
```kotlin
// Import classes:
//import dev.openfga.kotlin.client.infrastructure.*
//import dev.openfga.kotlin.client.models.*

val apiInstance = OpenFgaApi()
val storeId : kotlin.String = storeId_example // kotlin.String | 
try {
    apiInstance.deleteStore(storeId)
} catch (e: ClientException) {
    println("4xx response calling OpenFgaApi#deleteStore")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OpenFgaApi#deleteStore")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="expand"></a>
# **expand**
> ExpandResponse expand(storeId, body)

Expand all relationships in userset tree format, and following userset rewrite rules.  Useful to reason about and debug a certain relationship

The Expand API will return all users and usersets that have certain relationship with an object in a certain store. This is different from the &#x60;/stores/{store_id}/read&#x60; API in that both users and computed usersets are returned. Body parameters &#x60;tuple_key.object&#x60; and &#x60;tuple_key.relation&#x60; are all required. The response will return a tree whose leaves are the specific users and usersets. Union, intersection and difference operator are located in the intermediate nodes.  ## Example To expand all users that have the &#x60;reader&#x60; relationship with object &#x60;document:2021-budget&#x60;, use the Expand API with the following request body &#x60;&#x60;&#x60;json {   \&quot;tuple_key\&quot;: {     \&quot;object\&quot;: \&quot;document:2021-budget\&quot;,     \&quot;relation\&quot;: \&quot;reader\&quot;   } } &#x60;&#x60;&#x60; OpenFGA&#39;s response will be a userset tree of the users and usersets that have read access to the document. &#x60;&#x60;&#x60;json {   \&quot;tree\&quot;:{     \&quot;root\&quot;:{       \&quot;type\&quot;:\&quot;document:2021-budget#reader\&quot;,       \&quot;union\&quot;:{         \&quot;nodes\&quot;:[           {             \&quot;type\&quot;:\&quot;document:2021-budget#reader\&quot;,             \&quot;leaf\&quot;:{               \&quot;users\&quot;:{                 \&quot;users\&quot;:[                   \&quot;user:bob\&quot;                 ]               }             }           },           {             \&quot;type\&quot;:\&quot;document:2021-budget#reader\&quot;,             \&quot;leaf\&quot;:{               \&quot;computed\&quot;:{                 \&quot;userset\&quot;:\&quot;document:2021-budget#writer\&quot;               }             }           }         ]       }     }   } } &#x60;&#x60;&#x60; The caller can then call expand API for the &#x60;writer&#x60; relationship for the &#x60;document:2021-budget&#x60;.

### Example
```kotlin
// Import classes:
//import dev.openfga.kotlin.client.infrastructure.*
//import dev.openfga.kotlin.client.models.*

val apiInstance = OpenFgaApi()
val storeId : kotlin.String = storeId_example // kotlin.String | 
val body : ExpandRequest =  // ExpandRequest | 
try {
    val result : ExpandResponse = apiInstance.expand(storeId, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OpenFgaApi#expand")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OpenFgaApi#expand")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **kotlin.String**|  |
 **body** | [**ExpandRequest**](ExpandRequest.md)|  |

### Return type

[**ExpandResponse**](ExpandResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getStore"></a>
# **getStore**
> GetStoreResponse getStore(storeId)

Get a store

Returns an OpenFGA store by its identifier

### Example
```kotlin
// Import classes:
//import dev.openfga.kotlin.client.infrastructure.*
//import dev.openfga.kotlin.client.models.*

val apiInstance = OpenFgaApi()
val storeId : kotlin.String = storeId_example // kotlin.String | 
try {
    val result : GetStoreResponse = apiInstance.getStore(storeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OpenFgaApi#getStore")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OpenFgaApi#getStore")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **kotlin.String**|  |

### Return type

[**GetStoreResponse**](GetStoreResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listObjects"></a>
# **listObjects**
> ListObjectsResponse listObjects(storeId, body)

[EXPERIMENTAL] Get all objects of the given type that the user has a relation with

The ListObjects API returns a list of all the objects of the given type that the user has a relation with. To achieve this, both the store tuples and the authorization model are used. An &#x60;authorization_model_id&#x60; may be specified in the body. If it is, it will be used to decide the underlying implementation used. If it is not specified, the latest authorization model ID will be used. You may also specify &#x60;contextual_tuples&#x60; that will be treated as regular tuples. The response will contain the related objects in an array in the \&quot;objects\&quot; field of the response and they will be strings in the object format &#x60;&lt;type&gt;:&lt;id&gt;&#x60; (e.g. \&quot;document:roadmap\&quot;)  

### Example
```kotlin
// Import classes:
//import dev.openfga.kotlin.client.infrastructure.*
//import dev.openfga.kotlin.client.models.*

val apiInstance = OpenFgaApi()
val storeId : kotlin.String = storeId_example // kotlin.String | 
val body : ListObjectsRequest =  // ListObjectsRequest | 
try {
    val result : ListObjectsResponse = apiInstance.listObjects(storeId, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OpenFgaApi#listObjects")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OpenFgaApi#listObjects")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **kotlin.String**|  |
 **body** | [**ListObjectsRequest**](ListObjectsRequest.md)|  |

### Return type

[**ListObjectsResponse**](ListObjectsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listStores"></a>
# **listStores**
> ListStoresResponse listStores(pageSize, continuationToken)

List all stores

Returns a paginated list of OpenFGA stores.

### Example
```kotlin
// Import classes:
//import dev.openfga.kotlin.client.infrastructure.*
//import dev.openfga.kotlin.client.models.*

val apiInstance = OpenFgaApi()
val pageSize : kotlin.Int = 56 // kotlin.Int | 
val continuationToken : kotlin.String = continuationToken_example // kotlin.String | 
try {
    val result : ListStoresResponse = apiInstance.listStores(pageSize, continuationToken)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OpenFgaApi#listStores")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OpenFgaApi#listStores")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageSize** | **kotlin.Int**|  | [optional]
 **continuationToken** | **kotlin.String**|  | [optional]

### Return type

[**ListStoresResponse**](ListStoresResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="read"></a>
# **read**
> ReadResponse read(storeId, body)

Get tuples from the store that matches a query, without following userset rewrite rules

The Read API will return the tuples for a certain store that match a query filter specified in the body of the request. It is different from the &#x60;/stores/{store_id}/expand&#x60; API in that it only returns relationship tuples that are stored in the system and satisfy the query.  In the body: 1. tuple_key is optional.  If tuple_key is not specified, it will return all tuples in the store.2. &#x60;tuple_key.object&#x60; is mandatory if tuple_key is specified. It can be a full object (e.g., &#x60;type:object_id&#x60;) or type only (e.g., &#x60;type:&#x60;). 3. &#x60;tuple_key.user&#x60; is mandatory if tuple_key is specified in the case the &#x60;tuple_key.object&#x60; is a type only. ## Examples ### Query for all objects in a type definition To query for all objects that &#x60;user:bob&#x60; has &#x60;reader&#x60; relationship in the document type definition, call read API with body of &#x60;&#x60;&#x60;json {  \&quot;tuple_key\&quot;: {      \&quot;user\&quot;: \&quot;user:bob\&quot;,      \&quot;relation\&quot;: \&quot;reader\&quot;,      \&quot;object\&quot;: \&quot;document:\&quot;   } } &#x60;&#x60;&#x60; The API will return tuples and an optional continuation token, something like &#x60;&#x60;&#x60;json {   \&quot;tuples\&quot;: [     {       \&quot;key\&quot;: {         \&quot;user\&quot;: \&quot;user:bob\&quot;,         \&quot;relation\&quot;: \&quot;reader\&quot;,         \&quot;object\&quot;: \&quot;document:2021-budget\&quot;       },       \&quot;timestamp\&quot;: \&quot;2021-10-06T15:32:11.128Z\&quot;     }   ] } &#x60;&#x60;&#x60; This means that &#x60;user:bob&#x60; has a &#x60;reader&#x60; relationship with 1 document &#x60;document:2021-budget&#x60;. ### Query for all stored relationship tuples that have a particular relation and object To query for all users that have &#x60;reader&#x60; relationship with &#x60;document:2021-budget&#x60;, call read API with body of  &#x60;&#x60;&#x60;json {   \&quot;tuple_key\&quot;: {      \&quot;object\&quot;: \&quot;document:2021-budget\&quot;,      \&quot;relation\&quot;: \&quot;reader\&quot;    } } &#x60;&#x60;&#x60; The API will return something like  &#x60;&#x60;&#x60;json {   \&quot;tuples\&quot;: [     {       \&quot;key\&quot;: {         \&quot;user\&quot;: \&quot;user:bob\&quot;,         \&quot;relation\&quot;: \&quot;reader\&quot;,         \&quot;object\&quot;: \&quot;document:2021-budget\&quot;       },       \&quot;timestamp\&quot;: \&quot;2021-10-06T15:32:11.128Z\&quot;     }   ] } &#x60;&#x60;&#x60; This means that &#x60;document:2021-budget&#x60; has 1 &#x60;reader&#x60; (&#x60;user:bob&#x60;).  Note that the API will not return writers such as &#x60;user:anne&#x60; even when all writers are readers.  This is because only direct relationship are returned for the READ API. ### Query for all users with all relationships for a particular document To query for all users that have any relationship with &#x60;document:2021-budget&#x60;, call read API with body of  &#x60;&#x60;&#x60;json {   \&quot;tuple_key\&quot;: {       \&quot;object\&quot;: \&quot;document:2021-budget\&quot;    } } &#x60;&#x60;&#x60; The API will return something like  &#x60;&#x60;&#x60;json {   \&quot;tuples\&quot;: [     {       \&quot;key\&quot;: {         \&quot;user\&quot;: \&quot;user:anne\&quot;,         \&quot;relation\&quot;: \&quot;writer\&quot;,         \&quot;object\&quot;: \&quot;document:2021-budget\&quot;       },       \&quot;timestamp\&quot;: \&quot;2021-10-05T13:42:12.356Z\&quot;     },     {       \&quot;key\&quot;: {         \&quot;user\&quot;: \&quot;user:bob\&quot;,         \&quot;relation\&quot;: \&quot;reader\&quot;,         \&quot;object\&quot;: \&quot;document:2021-budget\&quot;       },       \&quot;timestamp\&quot;: \&quot;2021-10-06T15:32:11.128Z\&quot;     }   ] } &#x60;&#x60;&#x60; This means that &#x60;document:2021-budget&#x60; has 1 &#x60;reader&#x60; (&#x60;user:bob&#x60;) and 1 &#x60;writer&#x60; (&#x60;user:anne&#x60;). 

### Example
```kotlin
// Import classes:
//import dev.openfga.kotlin.client.infrastructure.*
//import dev.openfga.kotlin.client.models.*

val apiInstance = OpenFgaApi()
val storeId : kotlin.String = storeId_example // kotlin.String | 
val body : ReadRequest =  // ReadRequest | 
try {
    val result : ReadResponse = apiInstance.read(storeId, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OpenFgaApi#read")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OpenFgaApi#read")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **kotlin.String**|  |
 **body** | [**ReadRequest**](ReadRequest.md)|  |

### Return type

[**ReadResponse**](ReadResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="readAssertions"></a>
# **readAssertions**
> ReadAssertionsResponse readAssertions(storeId, authorizationModelId)

Read assertions for an authorization model ID

The ReadAssertions API will return, for a given authorization model id, all the assertions stored for it. An assertion is an object that contains a tuple key, and the expectation of whether a call to the Check API of that tuple key will return true or false. 

### Example
```kotlin
// Import classes:
//import dev.openfga.kotlin.client.infrastructure.*
//import dev.openfga.kotlin.client.models.*

val apiInstance = OpenFgaApi()
val storeId : kotlin.String = storeId_example // kotlin.String | 
val authorizationModelId : kotlin.String = authorizationModelId_example // kotlin.String | 
try {
    val result : ReadAssertionsResponse = apiInstance.readAssertions(storeId, authorizationModelId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OpenFgaApi#readAssertions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OpenFgaApi#readAssertions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **kotlin.String**|  |
 **authorizationModelId** | **kotlin.String**|  |

### Return type

[**ReadAssertionsResponse**](ReadAssertionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readAuthorizationModel"></a>
# **readAuthorizationModel**
> ReadAuthorizationModelResponse readAuthorizationModel(storeId, id)

Return a particular version of an authorization model

The ReadAuthorizationModel API returns an authorization model by its identifier. The response will return the authorization model for the particular version.  ## Example To retrieve the authorization model with ID &#x60;01G5JAVJ41T49E9TT3SKVS7X1J&#x60; for the store, call the GET authorization-models by ID API with &#x60;01G5JAVJ41T49E9TT3SKVS7X1J&#x60; as the &#x60;id&#x60; path parameter.  The API will return: &#x60;&#x60;&#x60;json {   \&quot;authorization_model\&quot;:{     \&quot;id\&quot;:\&quot;01G5JAVJ41T49E9TT3SKVS7X1J\&quot;,     \&quot;type_definitions\&quot;:[       {         \&quot;type\&quot;:\&quot;user\&quot;       },       {         \&quot;type\&quot;:\&quot;document\&quot;,         \&quot;relations\&quot;:{           \&quot;reader\&quot;:{             \&quot;union\&quot;:{               \&quot;child\&quot;:[                 {                   \&quot;this\&quot;:{}                 },                 {                   \&quot;computedUserset\&quot;:{                     \&quot;object\&quot;:\&quot;\&quot;,                     \&quot;relation\&quot;:\&quot;writer\&quot;                   }                 }               ]             }           },           \&quot;writer\&quot;:{             \&quot;this\&quot;:{}           }         }       }     ]   } } &#x60;&#x60;&#x60; In the above example, there are 2 types (&#x60;user&#x60; and &#x60;document&#x60;). The &#x60;document&#x60; type has 2 relations (&#x60;writer&#x60; and &#x60;reader&#x60;).

### Example
```kotlin
// Import classes:
//import dev.openfga.kotlin.client.infrastructure.*
//import dev.openfga.kotlin.client.models.*

val apiInstance = OpenFgaApi()
val storeId : kotlin.String = storeId_example // kotlin.String | 
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : ReadAuthorizationModelResponse = apiInstance.readAuthorizationModel(storeId, id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OpenFgaApi#readAuthorizationModel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OpenFgaApi#readAuthorizationModel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **kotlin.String**|  |
 **id** | **kotlin.String**|  |

### Return type

[**ReadAuthorizationModelResponse**](ReadAuthorizationModelResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readAuthorizationModels"></a>
# **readAuthorizationModels**
> ReadAuthorizationModelsResponse readAuthorizationModels(storeId, pageSize, continuationToken)

Return all the authorization models for a particular store

The ReadAuthorizationModels API will return all the authorization models for a certain store. OpenFGA&#39;s response will contain an array of all authorization models, sorted in descending order of creation.  ## Example Assume that a store&#39;s authorization model has been configured twice. To get all the authorization models that have been created in this store, call GET authorization-models. The API will return a response that looks like: &#x60;&#x60;&#x60;json {   \&quot;authorization_models\&quot;: [     {       \&quot;id\&quot;: \&quot;01G50QVV17PECNVAHX1GG4Y5NC\&quot;,       \&quot;type_definitions\&quot;: [...]     },     {       \&quot;id\&quot;: \&quot;01G4ZW8F4A07AKQ8RHSVG9RW04\&quot;,       \&quot;type_definitions\&quot;: [...]     },   ] } &#x60;&#x60;&#x60; If there are more authorization models available, the response will contain an extra field &#x60;continuation_token&#x60;: &#x60;&#x60;&#x60;json {   \&quot;authorization_models\&quot;: [     {       \&quot;id\&quot;: \&quot;01G50QVV17PECNVAHX1GG4Y5NC\&quot;,       \&quot;type_definitions\&quot;: [...]     },     {       \&quot;id\&quot;: \&quot;01G4ZW8F4A07AKQ8RHSVG9RW04\&quot;,       \&quot;type_definitions\&quot;: [...]     },   ],   \&quot;continuation_token\&quot;: \&quot;eyJwayI6IkxBVEVTVF9OU0NPTkZJR19hdXRoMHN0b3JlIiwic2siOiIxem1qbXF3MWZLZExTcUoyN01MdTdqTjh0cWgifQ&#x3D;&#x3D;\&quot; } &#x60;&#x60;&#x60; 

### Example
```kotlin
// Import classes:
//import dev.openfga.kotlin.client.infrastructure.*
//import dev.openfga.kotlin.client.models.*

val apiInstance = OpenFgaApi()
val storeId : kotlin.String = storeId_example // kotlin.String | 
val pageSize : kotlin.Int = 56 // kotlin.Int | 
val continuationToken : kotlin.String = continuationToken_example // kotlin.String | 
try {
    val result : ReadAuthorizationModelsResponse = apiInstance.readAuthorizationModels(storeId, pageSize, continuationToken)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OpenFgaApi#readAuthorizationModels")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OpenFgaApi#readAuthorizationModels")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **kotlin.String**|  |
 **pageSize** | **kotlin.Int**|  | [optional]
 **continuationToken** | **kotlin.String**|  | [optional]

### Return type

[**ReadAuthorizationModelsResponse**](ReadAuthorizationModelsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readChanges"></a>
# **readChanges**
> ReadChangesResponse readChanges(storeId, type, pageSize, continuationToken)

Return a list of all the tuple changes

The ReadChanges API will return a paginated list of tuple changes (additions and deletions) that occurred in a given store, sorted by ascending time. The response will include a continuation token that is used to get the next set of changes. If there are no changes after the provided continuation token, the same token will be returned in order for it to be used when new changes are recorded. If the store never had any tuples added or removed, this token will be empty. You can use the &#x60;type&#x60; parameter to only get the list of tuple changes that affect objects of that type. 

### Example
```kotlin
// Import classes:
//import dev.openfga.kotlin.client.infrastructure.*
//import dev.openfga.kotlin.client.models.*

val apiInstance = OpenFgaApi()
val storeId : kotlin.String = storeId_example // kotlin.String | 
val type : kotlin.String = type_example // kotlin.String | 
val pageSize : kotlin.Int = 56 // kotlin.Int | 
val continuationToken : kotlin.String = continuationToken_example // kotlin.String | 
try {
    val result : ReadChangesResponse = apiInstance.readChanges(storeId, type, pageSize, continuationToken)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OpenFgaApi#readChanges")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OpenFgaApi#readChanges")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **kotlin.String**|  |
 **type** | **kotlin.String**|  | [optional]
 **pageSize** | **kotlin.Int**|  | [optional]
 **continuationToken** | **kotlin.String**|  | [optional]

### Return type

[**ReadChangesResponse**](ReadChangesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="write"></a>
# **write**
> kotlin.Any write(storeId, body)

Add or delete tuples from the store

The Write API will update the tuples for a certain store. Tuples and type definitions allow OpenFGA to determine whether a relationship exists between an object and an user. In the body, &#x60;writes&#x60; adds new tuples while &#x60;deletes&#x60; removes existing tuples. The API is not idempotent: if, later on, you try to add the same tuple, or if you try to delete a non-existing tuple, it will throw an error. An &#x60;authorization_model_id&#x60; may be specified in the body. If it is, it will be used to assert that each written tuple (not deleted) is valid for the model specified. If it is not specified, the latest authorization model ID will be used. ## Example ### Adding relationships To add &#x60;user:anne&#x60; as a &#x60;writer&#x60; for &#x60;document:2021-budget&#x60;, call write API with the following  &#x60;&#x60;&#x60;json {   \&quot;writes\&quot;: {     \&quot;tuple_keys\&quot;: [       {         \&quot;user\&quot;: \&quot;user:anne\&quot;,         \&quot;relation\&quot;: \&quot;writer\&quot;,         \&quot;object\&quot;: \&quot;document:2021-budget\&quot;       }     ]   } } &#x60;&#x60;&#x60; ### Removing relationships To remove &#x60;user:bob&#x60; as a &#x60;reader&#x60; for &#x60;document:2021-budget&#x60;, call write API with the following  &#x60;&#x60;&#x60;json {   \&quot;deletes\&quot;: {     \&quot;tuple_keys\&quot;: [       {         \&quot;user\&quot;: \&quot;user:bob\&quot;,         \&quot;relation\&quot;: \&quot;reader\&quot;,         \&quot;object\&quot;: \&quot;document:2021-budget\&quot;       }     ]   } } &#x60;&#x60;&#x60; 

### Example
```kotlin
// Import classes:
//import dev.openfga.kotlin.client.infrastructure.*
//import dev.openfga.kotlin.client.models.*

val apiInstance = OpenFgaApi()
val storeId : kotlin.String = storeId_example // kotlin.String | 
val body : WriteRequest =  // WriteRequest | 
try {
    val result : kotlin.Any = apiInstance.write(storeId, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OpenFgaApi#write")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OpenFgaApi#write")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **kotlin.String**|  |
 **body** | [**WriteRequest**](WriteRequest.md)|  |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="writeAssertions"></a>
# **writeAssertions**
> writeAssertions(storeId, authorizationModelId, body)

Upsert assertions for an authorization model ID

The WriteAssertions API will upsert new assertions for an authorization model id, or overwrite the existing ones. An assertion is an object that contains a tuple key, and the expectation of whether a call to the Check API of that tuple key will return true or false. 

### Example
```kotlin
// Import classes:
//import dev.openfga.kotlin.client.infrastructure.*
//import dev.openfga.kotlin.client.models.*

val apiInstance = OpenFgaApi()
val storeId : kotlin.String = storeId_example // kotlin.String | 
val authorizationModelId : kotlin.String = authorizationModelId_example // kotlin.String | 
val body : WriteAssertionsRequest =  // WriteAssertionsRequest | 
try {
    apiInstance.writeAssertions(storeId, authorizationModelId, body)
} catch (e: ClientException) {
    println("4xx response calling OpenFgaApi#writeAssertions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OpenFgaApi#writeAssertions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **kotlin.String**|  |
 **authorizationModelId** | **kotlin.String**|  |
 **body** | [**WriteAssertionsRequest**](WriteAssertionsRequest.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="writeAuthorizationModel"></a>
# **writeAuthorizationModel**
> WriteAuthorizationModelResponse writeAuthorizationModel(storeId, body)

Create a new authorization model

The WriteAuthorizationModel API will add a new authorization model to a store. Each item in the &#x60;type_definitions&#x60; array is a type definition as specified in the field &#x60;type_definition&#x60;. The response will return the authorization model&#39;s ID in the &#x60;id&#x60; field.  ## Example To add an authorization model with &#x60;user&#x60; and &#x60;document&#x60; type definitions, call POST authorization-models API with the body:  &#x60;&#x60;&#x60;json {   \&quot;type_definitions\&quot;:[     {       \&quot;type\&quot;:\&quot;user\&quot;     },     {       \&quot;type\&quot;:\&quot;document\&quot;,       \&quot;relations\&quot;:{         \&quot;reader\&quot;:{           \&quot;union\&quot;:{             \&quot;child\&quot;:[               {                 \&quot;this\&quot;:{}               },               {                 \&quot;computedUserset\&quot;:{                   \&quot;object\&quot;:\&quot;\&quot;,                   \&quot;relation\&quot;:\&quot;writer\&quot;                 }               }             ]           }         },         \&quot;writer\&quot;:{           \&quot;this\&quot;:{}         }       }     }   ] } &#x60;&#x60;&#x60; OpenFGA&#39;s response will include the version id for this authorization model, which will look like  &#x60;&#x60;&#x60; {\&quot;authorization_model_id\&quot;: \&quot;01G50QVV17PECNVAHX1GG4Y5NC\&quot;} &#x60;&#x60;&#x60; 

### Example
```kotlin
// Import classes:
//import dev.openfga.kotlin.client.infrastructure.*
//import dev.openfga.kotlin.client.models.*

val apiInstance = OpenFgaApi()
val storeId : kotlin.String = storeId_example // kotlin.String | 
val body : WriteAuthorizationModelRequest =  // WriteAuthorizationModelRequest | 
try {
    val result : WriteAuthorizationModelResponse = apiInstance.writeAuthorizationModel(storeId, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OpenFgaApi#writeAuthorizationModel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OpenFgaApi#writeAuthorizationModel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **kotlin.String**|  |
 **body** | [**WriteAuthorizationModelRequest**](WriteAuthorizationModelRequest.md)|  |

### Return type

[**WriteAuthorizationModelResponse**](WriteAuthorizationModelResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

