package com.androidwave.fileupload.network;

import io.reactivex.Single;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

/**
 * Created on : Dec 30, 2018
 * Author     : AndroidWave
 * Website    : https://androidwave.com/
 */
public interface FileUploadService {
    @Multipart
    @POST("fileUpload.php")
    Single<ResponseBody> onFileUpload(@Part("username") RequestBody mUserName, @Part("email") RequestBody mEmail, @Part MultipartBody.Part file);
}
