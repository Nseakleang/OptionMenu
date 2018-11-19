package com.seakleang.optionmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
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
        //search view
        MenuItem searchItem = menu.findItem(R.id.search);
        SearchView searchView = (SearchView) searchItem.getActionView();
        //register event to searchView
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                MessageHelper.showMessage(MainActivity.this, s);
                return true;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                MessageHelper.showMessage(MainActivity.this, s);
                return true;
            }
        });



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
