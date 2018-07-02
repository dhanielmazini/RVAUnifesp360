package com.google.vr.sdk.samples.simplepanowidget;

import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;

import java.util.ArrayList;

/**
 * Created by dhaniel on 02/07/18.
 */

public class OpcoesVR extends DialogFragment {

    public int opcao;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(R.string.pick_toppings)
                .setItems(R.array.toppings, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // 0 = 10s; 1 = 15s; 2 = 20s; 3 = 30s
                        opcao = which;
                    }
                });
        return builder.create();
    }

}
