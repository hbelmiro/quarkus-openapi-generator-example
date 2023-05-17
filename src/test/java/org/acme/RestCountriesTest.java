package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.junit.jupiter.api.Test;
import org.openapi.quarkus.restcountries_json.api.DefaultApi;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
class RestCountriesTest {

    @Inject
    @RestClient
    DefaultApi api;

    @Test
    void testApiWasGenerated() {
        assertThat(api).isNotNull();
    }
}
