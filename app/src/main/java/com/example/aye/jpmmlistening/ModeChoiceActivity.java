package com.example.aye.jpmmlistening;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class ModeChoiceActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modechoice);
    }

//    public void selectmode(View view) {
//        switch (view.getId()) {
//            case R.id.listening:
//                Intent intent = new Intent(this, ListeningModeActivity.class);
//                startActivity(intent);
//                break;
//
//            case R.id.repating:
//               Intent intent1 = new Intent(this, JapanActivity.class);
//                startActivity(intent1);
//                break;
//
//            case R.id.quezz:
//                Intent intent2 = new Intent(this, QuizzModeActivity.class);
//                startActivity(intent2);
//        }
//    }
//

}
