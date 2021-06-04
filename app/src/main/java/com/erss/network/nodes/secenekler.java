package com.erss.network.nodes;

import android.annotation.SuppressLint;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.erss.network.MainActivity;
import com.erss.network.R;

public class secenekler extends AppCompatActivity {

    @SuppressLint("MissingPermission")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secenekler);





        Button btn_topologies = (Button)findViewById(R.id.btn_topologies);
        btn_topologies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });


        Button btn_nodes = (Button)findViewById(R.id.btn_nodes);
        btn_nodes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Nodes.class);
                startActivity(intent);
            }
        });
    }
}
