package io.ozee.openfga.client.infrastructure

class Configuration(baseUrl: String = defaultBasePath) : ApiClient(baseUrl) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "http://localhost")
        }
    }


}