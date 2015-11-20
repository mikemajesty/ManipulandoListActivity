package com.example.mike.trabalhomarcelolistactivity;

import android.app.ListActivity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class ListaActivity extends ListActivity {

    private  List<Cores> cores = new ArrayList<Cores>();
    private String[] listaCores = {"Vermelho","Verde","Amarelo","Azul","Rosa"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        cores.add(new Cores("Red", Color.RED));
        cores.add(new Cores("Yellow", Color.YELLOW));
        cores.add(new Cores("Blue", Color.BLUE));
        cores.add(new Cores("Green", Color.GREEN));
        cores.add(new Cores("Pink", Color.rgb(255,105,180)));
        setListAdapter(new Adapter<Cores>(getBaseContext(),cores));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        startActivity(new Intent(this.getApplicationContext(), ExibirCorActivity.class).putExtra("cor",cores.get(position).getCor())
                .putExtra("nome",cores.get(position).getNome()));
    }
}
