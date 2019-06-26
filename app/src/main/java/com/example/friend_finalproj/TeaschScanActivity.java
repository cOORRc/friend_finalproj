package com.example.friend_finalproj;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.zxing.Result;
import me.dm7.barcodescanner.zxing.ZXingScannerView;


public class TeaschScanActivity extends AppCompatActivity
        implements ZXingScannerView.ResultHandler {

    public static final int REQUEST_QR_SCAN = 4;
    private Button btnScan;
    private TextView txtResult;

    private ZXingScannerView mScannerView;
    private static final int REQUEST_CAMERA = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teasch_scan);


        mScannerView = new ZXingScannerView(getApplicationContext());
        setContentView(mScannerView);
        mScannerView.setResultHandler(TeaschScanActivity.this);
        mScannerView.startCamera();



    }

    @Override
    public void handleResult(Result result) {
        mScannerView.stopCamera();
        Toast.makeText(this, result.getText(), Toast.LENGTH_SHORT).show();

        String a = result.getText();
        finish();
    }
    @Override
    protected void onPause() {
        super.onPause();

        finish();
    }
}
