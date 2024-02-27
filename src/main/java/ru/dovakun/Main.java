package ru.dovakun;

import retrofit2.Response;
import ru.dovakun.request.PostCreateRequest;
import ru.dovakun.request.PostUpdateRequest;
import ru.dovakun.response.PostResponse;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        JsonPlaceHolderAPI api = JsonPlaceHolderService.getInstance().api();
        System.out.println("/post");
        Response<List<PostResponse>> postResponses = api.posts(null).execute();
        System.out.println(postResponses.isSuccessful());
        System.out.println(postResponses.code());


        System.out.println("Create");
        PostCreateRequest postRequest = new PostCreateRequest();
        postRequest.setBody("bar");
        PostResponse postCreateResponse = api.create(postRequest).execute().body();
        System.out.println(postCreateResponse);

        System.out.println("Update");
        PostUpdateRequest postUpdateRequest = new PostUpdateRequest();
        PostResponse postResponse = api.update(50,postUpdateRequest).execute().body();
        System.out.println(postResponse);

//        System.out.println("Update");
//        PostUpdateRequest postUpdateRequest = new PostUpdateRequest();
//        postUpdateRequest.setBody("bar");
//        Response<List<PostUpdateRequest>> postUpdateRequest = api.update(1,postUpdateRequest).execute();
    }
}