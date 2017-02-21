package com.example.aye.jpmmlistening;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class RepatingActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.repatingmode);
    }

    public void language(View view) {
        // view.setSelected(view.isSelected());
        TextView txt = (TextView) findViewById(R.id.kaiwa);
        switch (view.getId()) {
            case R.id.nihonn:
                txt.setText("もしもし、机の上にある資料を持って/\nHello,please bring material from the table/\n\n明日の朝御徒町駅に来てください。/\ncome to the okachimachi station tommorrow morning./");
                break;
            case R.id.repeat:
                txt.setText("もしもし、机の上にある資料を持って/明日の朝御徒町駅に来てください。/");
                break;
            case R.id.shado:
                txt.setText("もしもし、机の上にある資料を持って、明日の朝御徒町駅に来てください。");
        }
    }
}
