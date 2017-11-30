package com.bavariya.kiran.retrofitcardview_recycleview;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;


public interface MyApiEndpointInterface {

    @GET("/search/users")
    Call<User> getUsersNamedTom(@Query("q") String name);

}
