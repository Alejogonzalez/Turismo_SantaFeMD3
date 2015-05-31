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
//        int orientation = getResources().getConfiguration().orientation;
//
//        if(orientation == Configuration.ORIENTATION_LANDSCAPE ){
//            this.getFragmentManager().beginTransaction()
//                    .replace(android.R.id.content,null)
//                    .commit();
//        }
        return inflater.inflate(R.layout.fragment_lista, container, false);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        int orientation = getResources().getConfiguration().orientation;

        if(orientation == Configuration.ORIENTATION_LANDSCAPE ){


            switch(position){
                case 0:
                    hoteles Hoteles= new hoteles();
                    this.getFragmentManager().beginTransaction()
                            .replace(R.id.container, Hoteles)
                            .addToBackStack(null)
                            .commit();
                    break;

                case 1:

                    bares Bares= new bares();
                    this.getFragmentManager().beginTransaction()
                            .replace(R.id.container, Bares)
                            .addToBackStack(null)
                            .commit();
                    break;

                case 2:
                    turismo Turismo= new turismo();
                    this.getFragmentManager().beginTransaction()
                            .replace(R.id.container, Turismo)
                            .addToBackStack(null)
                            .commit();
                    break;

                case 3:
                    info Info= new info();
                    this.getFragmentManager().beginTransaction()
                            .replace(R.id.container, Info)
                            .addToBackStack(null)
                            .commit();
                    break;

                case 4:
                    about About= new about();
                    this.getFragmentManager().beginTransaction()
                            .replace(R.id.container, About)
                            .addToBackStack(null)
                            .commit();
                    break;

                case 5:
                    mapa pueblo= new mapa();
                    this.getFragmentManager().beginTransaction()
                            .replace(R.id.container, pueblo)
                            .addToBackStack(null)
                            .commit();
                    break;

            }

        }
        else{
            switch(position){
                case 0:
                    hoteles Hoteles= new hoteles();
                    this.getFragmentManager().beginTransaction()
                            .replace(android.R.id.content, Hoteles)
                            .addToBackStack(null)
                            .commit();
                    break;

                case 1:

                    bares Bares= new bares();
                    this.getFragmentManager().beginTransaction()
                            .replace(android.R.id.content, Bares)
                            .addToBackStack(null)
                            .commit();
                    break;

                case 2:
                    turismo Turismo= new turismo();
                    this.getFragmentManager().beginTransaction()
                            .replace(android.R.id.content, Turismo)
                            .addToBackStack(null)
                            .commit();
                    break;

                case 3:
                    info Info= new info();
                    this.getFragmentManager().beginTransaction()
                            .replace(android.R.id.content, Info)
                            .addToBackStack(null)
                            .commit();
                    break;

                case 4:
                    about About= new about();
                    this.getFragmentManager().beginTransaction()
                            .replace(android.R.id.content, About)
                            .addToBackStack(null)
                            .commit();
                    break;

                case 5:
                    mapa pueblo = new mapa();
                    this.getFragmentManager().beginTransaction()
                            .replace(android.R.id.content, pueblo)
                            .addToBackStack(null)
                            .commit();
                    break;
            }
        }

    }
}
