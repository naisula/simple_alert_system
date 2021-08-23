package com.example.alertsystem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private val rootLayout: View = TODO()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun showAlertDialog(view: View){
        MaterialAlertDialogBuilder(this)
                .setTitle("Alert")
                .setMessage("Launching nuclear missile could lead to world war III.Do you want to continue?")
                .setNeutralButton("Remind me later"
                ){dialog, which-> showSnackbar("System cooled Down")
                }
                .setNegativeButton("No"){dialog, which->
                    showSnackbar("Declined")
                }
                .setPositiveButton("Yes"){dialog, which->
                    showSnackbar("Missile Launched")
                }
                .show()
    }




    private fun showSnackbar(msg: String){
        Snackbar.make(rootLayout, msg, Snackbar.LENGTH_SHORT).show()

    }
}