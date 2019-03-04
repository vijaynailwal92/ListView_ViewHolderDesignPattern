package com.example.listview_viewholderdesignpattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    AppUtility appUtility;

    ArrayAdapter<String> namesAdapter;
    ListAdapterPeople listAdapterPeople;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView)findViewById(R.id.listView);

        appUtility=AppUtility.getAppUtility(getApplicationContext());
        listAdapterPeople=new ListAdapterPeople(this,appUtility.getPeople());
        listView.setAdapter(listAdapterPeople);


    }
}
