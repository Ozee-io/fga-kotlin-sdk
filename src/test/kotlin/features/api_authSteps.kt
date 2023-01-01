package features

import io.cucumber.java8.En
import io.ozee.openfga.client.apis.OpenFgaApi
import io.ozee.openfga.client.infrastructure.ApiClient
import io.ozee.openfga.client.infrastructure.Response
import okhttp3.Authenticator
import okhttp3.Credentials
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Route
import org.junit.jupiter.api.Assertions.*
import java.io.IOException


class apiAuthSteps : En {
    init {
        Given("I have a client with Authentication Disabled") {
            var api = OpenFgaApi()
        }

        Given("I have a client with Api Token Credentials with a valid token") {
            val api_key = "12345"
            var api = OpenFgaApi(
                client=ApiClient.defaultClient.newBuilder().header("Authorization", "my_key")
            )
        }
    }
}
