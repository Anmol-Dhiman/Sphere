package com.example.sphere.Helper

import android.app.Activity
import android.app.AlertDialog
import android.app.Dialog
import android.content.Context
import android.content.DialogInterface


class ClassHelpers {

    companion object {
        fun showAlertDialog(context: Context) {
            AlertDialog.Builder(context).setTitle("Do you want to exit?")
                .setPositiveButton("No") { dialog, which ->
                    dialog.dismiss()
                }
                .setNegativeButton("Yes") { dialog, which ->

                    (context as Activity).finish()
                }.create().show()
        }
    }

}