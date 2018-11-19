package com.seakleang.optionmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.share:
                MessageHelper.showMessage(this, "Share");
                return true;
            case R.id.upload:
                MessageHelper.showMessage(this, "Upload");
                return true;
            case R.id.download:
                MessageHelper.showMessage(this, "Download");
                return true;
            case R.id.print:
                MessageHelper.showMessage(this, "Print");
                return true;
            default: return false;
        }
    }


}
