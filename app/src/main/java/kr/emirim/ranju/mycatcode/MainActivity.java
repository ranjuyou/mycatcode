package kr.emirim.ranju.mycatcode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //System.out.println("onCreated가 실행됨");
        Log.v("메인액티비티", "onCreated가 실행됨");
        Log.v("메인액티비티", "Log.v 실행:모두출력");
        Log.i("메인액티비티", "Log.i 실행:정보출력");
        Log.d("메인액티비티", "Log.d 실행:정보출력");
        Log.w("메인액티비티", "Log.w 실행:정보출력");
        Log.e("메인액티비티", "Log.e 실행:정보출력");
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}
