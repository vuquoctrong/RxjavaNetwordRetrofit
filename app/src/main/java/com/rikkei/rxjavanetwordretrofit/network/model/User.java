package com.rikkei.rxjavanetwordretrofit.network.model;

import com.google.gson.annotations.SerializedName;
import com.rikkei.rxjavanetwordretrofit.network.model.BaseResponse;

public class User extends BaseResponse {
    @SerializedName("api_key")
    String api_key;

    public String getApikey() {
        return api_key;
    }
}
