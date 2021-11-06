package com.app.jaunfix;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface Retrointerface {

    @POST ("/Nuevousuario")
    Call<Void> executeNuevousuario (@Body HashMap<String, String>map);
}
