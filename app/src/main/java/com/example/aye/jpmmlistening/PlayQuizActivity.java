package com.example.aye.jpmmlistening;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Aye on 2/17/2017.
 */

public class PlayQuizActivity extends Activity {
    Context context = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.playquiz);
    }

    public void mark(View view){
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.checkmark);
        dialog.show();
    }
}
