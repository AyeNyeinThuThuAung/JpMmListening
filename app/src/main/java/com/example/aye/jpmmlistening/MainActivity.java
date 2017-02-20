package com.example.aye.jpmmlistening;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    Context context = this;
    ListView listMain;

    String[] itemname = {
            "同僚の留守電を聞く",
            "CDショップでの会話",
            "クライアントへの...",
            "電話で修理の依頼",
            "サプライズパ-ティ-...",
            "FTPの説明",
            "出産を控えた同僚...",
            "レポートの内容を上司に報告",
            "電器店での会話",
            " 注文内容の確認と手配",
            "受付での会話",
            "新プロジェクトについての説明"
    };

    Integer[] imgId = {
            R.drawable.download,
            R.drawable.download,
            R.drawable.download,
            R.drawable.download,
            R.drawable.download,
            R.drawable.download,
            R.drawable.download,
            R.drawable.download,
            R.drawable.download,
            R.drawable.download,
            R.drawable.download,
            R.drawable.download

    };

    Integer[] imgId1 = {
            R.drawable.chair,
            R.drawable.radio,
            R.drawable.profile,
            R.drawable.handshake,
            R.drawable.message,
            R.drawable.print,
            R.drawable.message,
            R.drawable.print,
            R.drawable.airport,
            R.drawable.handshake,
            R.drawable.profile,
            R.drawable.document
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final CustomListAdapter adapter = new CustomListAdapter(this, itemname, imgId, imgId1);
        listMain = (ListView) findViewById(R.id.list);
        listMain.setAdapter(adapter);

        listMain.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //show dialog for download
                Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.dialog);
                dialog.show();
            }

        });
    }

    //go to download page press download(download in dialog.xml)
    public void download(View view) {
        Intent intent = new Intent(MainActivity.this, DownloadActivity.class);
        startActivity(intent);
    }

}
