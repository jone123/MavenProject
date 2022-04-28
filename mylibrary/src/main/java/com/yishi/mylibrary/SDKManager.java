package com.yishi.mylibrary;

import android.content.Context;
import android.widget.Toast;

import com.yishi.mylibrary2.ToastUtil;

public class SDKManager {

    private static SDKManager instance = new SDKManager();
    public static SDKManager getInstance(){
        return instance;
    }

    public void init(Context context){
//        Toast.makeText(context, "初始化", Toast.LENGTH_SHORT).show();
        ToastUtil.showToast(context,"插件初始化");
    }

    public void login(Context context){
        ToastUtil.showToast(context,"登录");
    }

}
