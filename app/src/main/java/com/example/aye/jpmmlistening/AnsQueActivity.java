package com.example.aye.jpmmlistening;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Aye on 2/16/2017.
 */

public class AnsQueActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question);
    }

    public void answer(View view){
        Intent intent = new Intent(this,PlayQuizActivity.class);
        startActivity(intent);
    }
}
