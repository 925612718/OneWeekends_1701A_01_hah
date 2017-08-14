package com.liu.administratorexample.oneweekends_1701a_01.https;

import android.os.Handler;

import com.google.gson.Gson;
import com.liu.administratorexample.oneweekends_1701a_01.Bean.Bean;

import java.io.IOException;

import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class Fengzhuang {

    private static volatile Fengzhuang fengzhuang;

    private Handler handler;

    private OkHttpClient client;


    public static Fengzhuang getFengzhuang() {

        if (fengzhuang == null) {

            fengzhuang = new Fengzhuang();

        }

        return fengzhuang;

    }


    public Fengzhuang() {

        this.handler = new Handler();

        this.client = new OkHttpClient();

    }


    public interface GetBeantu {

        void showtu(Bean bean);

    }




    public void jiexi(String url, final GetBeantu getBeantu) {

        final Request request = new Request.Builder().url(url).build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(okhttp3.Call call, IOException e) {

            }

            @Override
            public void onResponse(okhttp3.Call call, Response response) throws IOException {
                String bb = response.body().string();

                Gson gson = new Gson();

                final Bean bean = gson.fromJson(bb, Bean.class);

                handler.post(new Runnable() {

                    @Override

                    public void run() {

                        getBeantu.showtu(bean);

                    }

                });
            }
        });


    }


}