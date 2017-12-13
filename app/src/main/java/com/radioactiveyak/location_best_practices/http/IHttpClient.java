package com.radioactiveyak.location_best_practices.http;

public interface IHttpClient {

    void request(String url, HttpClient.ResponseListener listener);
}
