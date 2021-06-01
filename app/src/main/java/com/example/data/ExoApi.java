package com.example.data;

import com.example.projetapplication01.presentation.model.RestExerciceImageResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ExoApi {
    @GET("/api/v2/exerciseimage/")
    Call<RestExerciceImageResponse> getExerciceImageResponse();
}
