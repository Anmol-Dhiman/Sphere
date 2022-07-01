package com.example.sphere.Helper

import android.app.Activity
import android.app.AlertDialog

import android.content.Context

import androidx.appcompat.app.AppCompatActivity


class ClassHelpers {

    companion object {
        fun showAlertDialog(context: Context) {
            AlertDialog.Builder(context).setTitle("Do you want to exit?")
                .setPositiveButton("No") { dialog, which ->
                    dialog.dismiss()
                }
                .setNegativeButton("Yes") { dialog, which ->

                    val preferences =
                        context.getSharedPreferences("Starter", AppCompatActivity.MODE_PRIVATE)
                    var editor = preferences.edit()
                    editor.putString("firstTimeOpening", "yes").apply()
                    (context as Activity).finish()
                }.create().show()
        }
    }

}