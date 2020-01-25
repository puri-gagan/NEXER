package com.example.myapplication;


import android.content.DialogInterface;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentProfile extends Fragment {
    View view;
    ChipGroup chipGroup;
    Chip chip;


    public FragmentProfile() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         view= inflater.inflate(R.layout.fragment_fragment_profile, container, false);
        chipGroup=view.findViewById(R.id.chipgroup);

        final Button buttonsearch = (Button) view.findViewById(R.id.searchDilog);



        buttonsearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                AlertDialog.Builder alertdialog = new AlertDialog.Builder(getActivity());
                view  = getLayoutInflater().inflate(R.layout.search, null);
                alertdialog.setTitle("Advanced Search");
                final Spinner searchSpiner = view.findViewById(R.id.spinercategory);

                final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.Category_options));
                arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                searchSpiner.setAdapter(arrayAdapter);

                alertdialog.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        if (!searchSpiner.getSelectedItem().toString().equalsIgnoreCase("Choose a category…")) {
                            String[] tags =searchSpiner.getSelectedItem().toString().split(",,");

                            LayoutInflater layoutInflater=LayoutInflater.from(getActivity());


                            for (String text:tags){

                                chip =(Chip)layoutInflater.inflate(R.layout.chip_items,null,false);
                                chip.setChipText(text);
                                chip.setSingleLine();

                                chip.setOnCloseIconClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        chipGroup.removeView(view);
                                    }

                                });

                            }
                            chipGroup.addView(chip);

                            dialog.dismiss();

                        }

                    }



                });
                alertdialog.setNegativeButton("Dismiss", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        dialog.dismiss();

                    }

                });

                alertdialog.setView(view);
                AlertDialog dialog = alertdialog.create();
                dialog.show();

            }
        });
        return  view;
    }

}
