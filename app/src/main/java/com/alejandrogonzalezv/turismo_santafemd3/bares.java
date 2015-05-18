package com.alejandrogonzalezv.turismo_santafemd3;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class bares extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_bares, container,
                false);
        final Spinner listah = (Spinner) rootView.findViewById(R.id.listabares);
        final ImageView img1 = (ImageView) rootView.findViewById(R.id.img1);
        final ImageView img2 = (ImageView) rootView.findViewById(R.id.img2);
        final ImageView titulo = (ImageView)rootView.findViewById(R.id.imgtitulo);
        final TextView info = (TextView) rootView.findViewById(R.id.txinfo);


        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this.getActivity(),
                R.array.bares_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        listah.setAdapter(adapter);
        listah.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String hotel = String.valueOf(listah.getSelectedItem());

                if(position == 0){
                    titulo.setImageResource(R.drawable.bar1titulo);
                    img1.setImageResource(R.drawable.bar1img1);
                    img2.setImageResource(R.drawable.bar1img2);
                    info.setText(getResources().getString(R.string.bar1));
                }
                if(position==1){
                    titulo.setImageResource(R.drawable.bar2titulo);
                    img1.setImageResource(R.drawable.bar2img1);
                    img2.setImageResource(R.drawable.bar2img2);
                    info.setText(getResources().getString(R.string.bar2));
                }
                if(position==2){
                    titulo.setImageResource(R.drawable.bar3titulo);
                    img1.setImageResource(R.drawable.bar3img1);
                    img2.setImageResource(R.drawable.bar3img2);
                    info.setText(getResources().getString(R.string.bar3));
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        return rootView;
    }


}
