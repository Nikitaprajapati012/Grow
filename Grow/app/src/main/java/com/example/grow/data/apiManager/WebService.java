package com.example.grow.data.apiManager;

import android.content.Context;

import java.io.IOException;
import java.util.Map;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by sagar on 01/09/17.
 */

public class WebService {

    private Context context;
    WSResponse objWsResponse;

    public WebService(Context context){
        this.context =context;
    }

    public void callGetMethod(String path, Map<String, Object> header, final WSResponse objWsResponse) {
        this.objWsResponse = objWsResponse;
        Call<ResponseBody> call = ApiClient.getClient().create(ApiInterface.class).getData(path, header);
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                String result = null;
                if (response.code() == 200) {
                    try {
                        result = response.body().string();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    objWsResponse.onSuccess(result, response.code());
                } else {
                    try {
                        result = response.errorBody().string();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    objWsResponse.onSuccess(result, response.code());
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                t.printStackTrace();
                objWsResponse.onFailure(call.toString());
            }
        });
    }

    public void callPostMethod(String path, Map<String, Object> header, Object body, final WSResponse objWsResponse) {
        this.objWsResponse = objWsResponse;
        Call<ResponseBody> call = ApiClient.getClient().create(ApiInterface.class).postData(path, header, body);
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                String result = null;
                if (response.code() == 200 || response.code() == 206) {
                    try {
                        result = response.body().string();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    objWsResponse.onSuccess(result, response.code());
                } else {
                    try {
                        result = response.errorBody().string();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    objWsResponse.onSuccess(result, response.code());
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                t.printStackTrace();
                objWsResponse.onFailure(call.toString());
            }
        });
    }

    public void callPutMethod(String path, Map<String, Object> header, Object body, final WSResponse objWsResponse) {
        this.objWsResponse = objWsResponse;
        Call<ResponseBody> call = ApiClient.getClient().create(ApiInterface.class).putData(path, header, body);
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                String result = null;
                if (response.code() == 200) {
                    try {
                        result = response.body().string();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    objWsResponse.onSuccess(result, response.code());
                } else {
                    try {
                        result = response.errorBody().string();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    objWsResponse.onSuccess(result, response.code());
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                t.printStackTrace();
                objWsResponse.onFailure(call.toString());
            }
        });
    }

    public void callDeleteMethod(String path, Map<String, Object> header, final WSResponse objWsResponse) {
        this.objWsResponse = objWsResponse;
        Call<ResponseBody> call = ApiClient.getClient().create(ApiInterface.class).deleteData(path, header);
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                String result = null;
                if (response.code() == 200) {
                    try {
                        result = response.body().string();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    objWsResponse.onSuccess(result, response.code());
                } else {
                    try {
                        result = response.errorBody().string();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    objWsResponse.onSuccess(result, response.code());
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                t.printStackTrace();
                objWsResponse.onFailure(call.toString());
            }
        });
    }

    public void callMultipartDataMethod(String path, MultipartBody.Part body, RequestBody name, Map<String, Object> header, final WSResponse objWsResponse) {
        this.objWsResponse = objWsResponse;
        Call<ResponseBody> call = ApiClient.getClient().create(ApiInterface.class).multipartData(path, body,name,header);
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                String result = null;
                if (response.code() == 200) {
                    try {
                        result = response.body().string();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    objWsResponse.onSuccess(result, response.code());
                } else {
                    try {
                        result = response.errorBody().string();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    objWsResponse.onSuccess(result, response.code());
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                t.printStackTrace();
                objWsResponse.onFailure(call.toString());
            }
        });
    }

}
