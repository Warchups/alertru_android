package com.gnommostudios.alertru.alertru_android.util;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;

import com.gnommostudios.alertru.alertru_android.R;

public class SearchDialog extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        final View context = inflater.inflate(R.layout.search_dialog, null);

        builder.setView(context);

        AlertDialog dialog = builder.create();

        return dialog;
    }
}