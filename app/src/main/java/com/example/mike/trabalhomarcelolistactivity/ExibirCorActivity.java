package com.example.mike.trabalhomarcelolistactivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by mike on 06/11/15.
 */
public class ExibirCorActivity extends Activity {

    private Button btnSair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        setContentView(R.layout.exibircor);
        this.findViewById(android.R.id.content).setBackgroundColor(intent.getIntExtra("cor", Color.WHITE));
        TextView txv = (TextView)this.findViewById(android.R.id.content).findViewById(R.id.txvNomeCor);
        txv.setText(intent.getStringExtra("nome"));
        findViewById(R.id.btnSair).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }


}
