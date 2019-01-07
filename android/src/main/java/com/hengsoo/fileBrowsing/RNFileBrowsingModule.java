
package com.hengsoo.fileBrowsing;

import android.Manifest;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

import pub.devrel.easypermissions.EasyPermissions;

public class RNFileBrowsingModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNFileBrowsingModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNFileBrowsing";
  }

  @ReactMethod
  public void show(String path,String fileName){
    String[] perms = new String[]{Manifest.permission.READ_EXTERNAL_STORAGE,
            Manifest.permission.WRITE_EXTERNAL_STORAGE};
    if (!EasyPermissions.hasPermissions(reactContext.getCurrentActivity(), perms)) {
      EasyPermissions.requestPermissions(reactContext.getCurrentActivity(), "需要访问手机存储权限！", 10086, perms);
    } else {
      FileDisplayActivity.show(reactContext.getCurrentActivity(), path);
    }
  }
}