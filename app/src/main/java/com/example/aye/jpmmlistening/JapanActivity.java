package com.example.aye.jpmmlistening;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Aye on 2/16/2017.
 */

public class JapanActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nihon);
    }

    public void language(View view) {
        TextView textView = (TextView) findViewById(R.id.txt);
        switch (view.getId()) {
            case R.id.japan:
                textView.setText("もしもし、机の上にある資料を持って/\nHello,lease bring the material on the table and/\n\n明日の朝、御徒町駅に来てください。/\ncome to the okachimachi station tommorrow morning./");
                break;
            case R.id.repeat:
                textView.setText("もしもし、机の上にある資料を持って/明日の朝、御徒町駅に来てください。/");
                break;
            case R.id.shado:
                textView.setText("もしもし、机の上にある資料を持って、明日の朝、御徒町駅に来てください。");
        }
    }
}
