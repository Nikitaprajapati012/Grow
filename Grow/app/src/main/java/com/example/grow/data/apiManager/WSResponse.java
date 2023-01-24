package com.example.grow.data.apiManager;


public interface WSResponse {

    public void onSuccess(String response, int code);
    public void onFailure(String error);

}
