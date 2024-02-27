package ru.dovakun;

import retrofit2.Call;
import retrofit2.http.*;
import ru.dovakun.request.PostCreateRequest;
import ru.dovakun.request.PostUpdateRequest;
import ru.dovakun.response.PostResponse;

import java.util.List;

public interface JsonPlaceHolderAPI {
    @GET("/posts")
    Call<List<PostResponse>> posts(@Query("userId")Integer userId);
    @POST("/posts")
    Call<PostResponse> create(@Body PostCreateRequest postRequest);
    @PUT("/posts/{id}")
    Call<PostResponse> update(@Path("id") Integer id, @Body PostUpdateRequest postUpdateRequest);
}
