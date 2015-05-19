package com.alejandrogonzalezv.turismo_santafemd3;

import android.app.Activity;
import android.app.ListFragment;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class lista extends ListFragment {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ArrayAdapter<CharSequence> adapter =
                ArrayAdapter.createFromResource(this.getActivity(),
                R.array.list_array, android.R.layout.simple_list_item_1);
        setListAdapter(adapter);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lista, container, false);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        int orientation = getResources().getConfiguration().orientation;

        if(orientation == Configuration.ORIENTATION_LANDSCAPE ){

            switch(position){
                case 0:
                    hoteles nextHoteles= new hoteles();
                    this.getFragmentManager().beginTransaction()
                            .replace(R.id.container, nextHoteles)
                            .addToBackStack(null)
                            .commit();
                    break;

                case 1:

                    bares nextBares= new bares();
                    this.getFragmentManager().beginTransaction()
                            .replace(R.id.container, nextBares)
                            .addToBackStack(null)
                            .commit();
                    break;

                case 2:
                    turismo nextTurismo= new turismo();
                    this.getFragmentManager().beginTransaction()
                            .replace(R.id.container, nextTurismo)
                            .addToBackStack(null)
                            .commit();
                    break;

                case 3:
                    info nextInfo= new info();
                    this.getFragmentManager().beginTransaction()
                            .replace(R.id.container, nextInfo)
                            .addToBackStack(null)
                            .commit();
                    break;


            }

        }
        else{
            switch(position){
                case 0:
                    hoteles nextHoteles= new hoteles();
                    this.getFragmentManager().beginTransaction()
                            .replace(android.R.id.content, nextHoteles)
                            .addToBackStack(null)
                            .commit();
                    break;

                case 1:

                    bares nextBares= new bares();
                    this.getFragmentManager().beginTransaction()
                            .replace(android.R.id.content, nextBares)
                            .addToBackStack(null)
                            .commit();
                    break;

                case 2:
                    turismo nextTurismo= new turismo();
                    this.getFragmentManager().beginTransaction()
                            .replace(android.R.id.content, nextTurismo)
                            .addToBackStack(null)
                            .commit();
                    break;

                case 3:
                    info nextInfo= new info();
                    this.getFragmentManager().beginTransaction()
                            .replace(android.R.id.content, nextInfo)
                            .addToBackStack(null)
                            .commit();
                    break;


            }
        }

    }
}
