package com.example.shiva.realmdata;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import io.realm.Realm;
import io.realm.RealmResults;

public class MainActivity extends AppCompatActivity {
    private Realm mRealm;
    EditText e1,e2;
    Button b1,b2;
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = (EditText)findViewById(R.id.editText);
        e2 = (EditText)findViewById(R.id.editText2);
        b1 = (Button)findViewById(R.id.button);
        b2 = (Button)findViewById(R.id.button2);
        t= (TextView)findViewById(R.id.text);
        mRealm = Realm.getDefaultInstance();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mRealm.beginTransaction();
                String s = e1.getText().toString();
                User user1 = mRealm.createObject(User.class);
                user1.setAge(137);
                user1.setName(s);
                mRealm.commitTransaction();
            }
        });

b2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Toast.makeText(MainActivity.this, "...", Toast.LENGTH_SHORT).show();
    }
});

    }
    public void onDestroy() {
        super.onDestroy();
        mRealm.close();
    }
}
