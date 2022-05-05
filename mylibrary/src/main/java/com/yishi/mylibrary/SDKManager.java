package com.yishi.mylibrary;

import android.content.Context;
import android.widget.Toast;

public class SDKManager {

    private static SDKManager instance = new SDKManager();
    public static SDKManager getInstance(){
        return instance;
    }

    public void init(Context context){
        Toast.makeText(context, "初始化", Toast.LENGTH_SHORT).show();

    }

    public void login(Context context){
        Toast.makeText(context, "登录", Toast.LENGTH_SHORT).show();
    }

    public void pay(Context context){
        Toast.makeText(context, "充值", Toast.LENGTH_SHORT).show();
    }
}
