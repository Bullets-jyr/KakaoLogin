package kr.co.bullets.kakaologin;

import android.app.Application;

import com.kakao.sdk.common.KakaoSdk;
import com.kakao.sdk.common.util.Utility;

public class KakaoApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        KakaoSdk.init(this, "{NATIVE_APP_KEY}");
    }
}
