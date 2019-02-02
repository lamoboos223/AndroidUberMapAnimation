package com.example.lamoboos223.androiduberanimation.Remote;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface IGoogleAPI {

    @GET
    Call<String> getDataFromGoogleAPI(@Url String url);
}
