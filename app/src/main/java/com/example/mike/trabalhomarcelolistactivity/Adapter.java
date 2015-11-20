package com.example.mike.trabalhomarcelolistactivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by mike on 06/11/15.
 */
public class Adapter<T> extends BaseAdapter {

    private  Context _ctx;
    private  List<T> _list;
    @Override
    public int getCount() {
        return _list.size();
    }

    public Adapter(Context ctx, List<T> list)
    {
        this._ctx = ctx;
        this._list = list;
    }
    @Override
    public Object getItem(int i) {
        return _list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View contenView, ViewGroup parent) {
        Cores cor =  (Cores)this.getItem(position);
        LayoutInflater layout = (LayoutInflater)_ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View _view = layout.inflate(R.layout.activity_main, null);
        TextView txtCor = (TextView)_view.findViewById(R.id.txvCor);
        txtCor.setText(cor.getNome());
        txtCor.setBackgroundColor(cor.getCor());
        return  _view;
    }
}
