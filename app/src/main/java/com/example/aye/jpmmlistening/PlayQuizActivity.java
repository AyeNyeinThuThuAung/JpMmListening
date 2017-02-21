package com.example.aye.jpmmlistening;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


//プレーズ3択クイズ
public class PlayQuizActivity extends AppCompatActivity {
    Context context = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.playquiz);
    }

    //show dialog 正解数
    public void mark(View view){
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.checkmark);
        dialog.show();
    }

    //click メニューへ戻る
    public void returnEpisode(View view){
        Intent intent = new Intent(PlayQuizActivity.this,MainActivity.class);
        startActivity(intent);
    }

    //click もう一度挑戦
    public void tryAgain(View view){
        Intent intent = new Intent(PlayQuizActivity.this,QuizzModeActivity.class);
        startActivity(intent);
    }
}
