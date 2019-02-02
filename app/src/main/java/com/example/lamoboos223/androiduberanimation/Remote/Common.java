package com.example.lamoboos223.androiduberanimation.Remote;

public class Common {

    public static final String baseURL = "https://googleapis.com";

    public static IGoogleAPI getGoogleAPI(){
        return RetroFitClient.getClient(baseURL).create(IGoogleAPI.class);
    }
}
