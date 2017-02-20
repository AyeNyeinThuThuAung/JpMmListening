package com.example.aye.jpmmlistening;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.media.Rating;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.List;


public class DownloadActivity extends Activity {

    Context context = this;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //show download page
        setContentView(R.layout.download);
        //AsynTask execute
        new ProgressActivity().execute(0, 0, 0);
    }

    class ProgressActivity extends AsyncTask<Integer, Integer, Integer> {

        @Override
        protected Integer doInBackground(Integer... params) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Integer integer) {
            super.onPostExecute(integer);
            Dialog dialog = new Dialog(context);
            dialog.setContentView(R.layout.modechoice);
            dialog.show();
        }
    }

    public void selectmode(View view) {
        switch (view.getId()) {
            case R.id.listening:
                Intent intent = new Intent(DownloadActivity.this, ListeningModeActivity.class);
                startActivity(intent);
                break;
            case R.id.quezz:
                Intent intent1 = new Intent(DownloadActivity.this, QuizzModeActivity.class);
                startActivity(intent1);
                break;
            case R.id.repating:
                Intent intent2 = new Intent(DownloadActivity.this, JapanActivity.class);
                startActivity(intent2);
        }
    }

}