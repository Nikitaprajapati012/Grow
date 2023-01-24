package com.example.grow.ws;

/**
 * Created by hardik on 27/1/17.
 */


public interface WSResponse {

    public void onSuccess(String response, int code);
    public void onFailure(String error);

}
