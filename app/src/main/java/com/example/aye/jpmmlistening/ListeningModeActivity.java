package com.example.aye.jpmmlistening;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Aye on 2/16/2017.
 */

public class ListeningModeActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listeningmode);

    }

    public void language(View view){
        TextView textView = (TextView) findViewById(R.id.txt);
        switch (view.getId()){
            case R.id.english :
                textView.setText("   Hey, this is Steve.I want to talk you about the ad agent 's quote to the web banner but since you'r out.I will leave you a quick message.\n\n    From my stand point, the fee is a bit too large considering our internet budget for next quarter.\n\n    So instance of going for the bigger banner like they are suggesting how about the standard size which is 120*60 pixels?That, I belive is less than one third of the original cost.");
                break;
            case R.id.japan:
                textView.setText("ねえ、これはスティーブです。私は広告代理店のウェブバナーの引用について話したかったのですが、あなたが出ていないので、私はあなたに素早いメッセージを残します。\n\n   私の立場から言えば、料金は次の四半期のインターネット予算を考えると大きすぎます。\n\n   それで、120×60ピクセルの標準サイズはどうやって提案されているような大きなバナーに行くのでしょうか？それは私が信じているのは元のコストの3分の1未満です");
                break;
            case R.id.ichirann:
                textView.setText("quote:見積もリ\n\nsince:～だから、～なので\n\nfrom my standpoint:私の見方からすると、私的には\n\nquarter:四半期\n\ninstead of:～の代わりに\n\none third:3分の1\n\npricey:高額");
        }
    }
}
