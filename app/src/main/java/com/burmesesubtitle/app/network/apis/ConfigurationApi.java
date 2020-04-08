package com.burmesesubtitle.app.network.apis;

import com.burmesesubtitle.app.network.model.Configuration;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

public interface ConfigurationApi {

    @GET("config")
    Call<Configuration> getConfigurationData(@Header("API-KEY") String apiKey);
}
