package com.gnommostudios.alertru.alertru_android.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.gnommostudios.alertru.alertru_android.R;
import com.gnommostudios.alertru.alertru_android.model.Alert;

import java.util.ArrayList;

public class AdapterAlertList extends ArrayAdapter<Alert> {

    Activity context;
    ArrayList<Alert> elements;
    SharedPreferences prefs;

    public AdapterAlertList(@NonNull Fragment context, ArrayList<Alert> elements) {
        super(context.getActivity(), R.layout.element_list, elements);
        this.context = context.getActivity();
        this.elements = elements;
        prefs = getContext().getSharedPreferences("user", Context.MODE_PRIVATE);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        convertView = inflater.inflate(R.layout.element_list, null);

        LinearLayout background = (LinearLayout) convertView.findViewById(R.id.background_element);
        ImageView imagePadlock = (ImageView) convertView.findViewById(R.id.imagePadlock);
        TextView affairTxt = (TextView) convertView.findViewById(R.id.affairTxt);
        TextView descriptionTxt = (TextView) convertView.findViewById(R.id.descriptionTxt);
        TextView dateTxt = (TextView) convertView.findViewById(R.id.dateTxt);
        ImageView ownerImage = (ImageView) convertView.findViewById(R.id.ownerImage);
        ImageView finishedImage = (ImageView) convertView.findViewById(R.id.finishedImage);

        affairTxt.setText(elements.get(position).getAffair());
        dateTxt.setText(elements.get(position).getDate());
        descriptionTxt.setText(elements.get(position).getDescription());

        //if (position == 0)
        //    convertView.setPadding(48, 20, 48, 35);

        if (elements.get(position).isAssigned()) {
            imagePadlock.setImageResource(R.drawable.icono_candado4);
            background.setBackground(getContext().getResources().getDrawable(R.drawable.degraded_elements_assigned));

            if (elements.get(position).getIdTechnician().equals(prefs.getString("id", ""))) {
                ownerImage.setVisibility(View.VISIBLE);
                if (elements.get(position).getState().equals("finished")) {
                    finishedImage.setVisibility(View.VISIBLE);
                }
            } else {
                ownerImage.setVisibility(View.GONE);
            }
        } else {
            imagePadlock.setImageResource(R.drawable.candado_cerrado4);
            background.setBackground(getContext().getResources().getDrawable(R.drawable.degraded_elements_unassigned));
        }

        return convertView;
    }

}
