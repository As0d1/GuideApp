package com.dsu.guideapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_andijan.*
import kotlinx.android.synthetic.main.activity_bukhara_restaurant.*
import kotlinx.android.synthetic.main.xabar_layout.*
import kotlinx.android.synthetic.main.xabar_layout.view.*

class Bukhara_restaurant : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bukhara_restaurant)

        btnBookBukhara.setOnClickListener {
            val dialogView: View = View.inflate(this, R.layout.xabar_layout, null)
            val dlg = AlertDialog.Builder(this)
            dlg.setTitle("Book a table in these restaurants")
            dlg.setView(dialogView)
            dlg.setPositiveButton("Reserve") { dialog, which ->
                run {
                    val dlgName: EditText = dialogView.findViewById(R.id.editIsm)
                    val dlgEmail: EditText = dialogView.findViewById(R.id.editEmail)
                    val dlgXabar: EditText = dialogView.findViewById(R.id.txtXabar)

                    val items = listOf(
                        "Uzbekistan",
                        "Turkmenistan",
                        "Kazakhstan",
                        "Kyrgyzstan",
                        "Tajikistan",
                        "Afghanistan"
                    )
                    val adapter = ArrayAdapter(this, android.R.layout.list_content, items)
                    dialogView.txtRestaurant.setAdapter(adapter)


                    if (dlgName.text.isNullOrEmpty()) {
                        val toast = Toast.makeText(this, "Ismingizni kiriting!", Toast.LENGTH_LONG)
                        toast.setGravity(Gravity.CENTER,0,0)
                        toast.show()
                    } else if (dlgEmail.text.isNullOrEmpty()) {
                        val toast = Toast.makeText(this, "Email addresingizni kiriting!", Toast.LENGTH_LONG)
                        toast.setGravity(Gravity.CENTER,0,0)
                        toast.show()
                    } else if (dlgXabar.text.isNullOrEmpty()) {
                        val toast = Toast.makeText(this, "Xabaringizni kiriting!", Toast.LENGTH_LONG)
                        toast.setGravity(Gravity.CENTER,0,0)
                        toast.show()
                    } else {
                        val dlName = dlgName.text.toString()
                        val dlEmail = dlgEmail.text.toString()
                        val dlXabar = dlgXabar.text.toString()

//                        val ref = FirebaseDatabase.getInstance().getReference("xabarlar")
//                        val xabarId = ref.push().key
//                        val xabar = xabarId?.let { FireXabar(it, dlName, dlEmail, dlXabar, dlRating) }
//                        if (xabarId != null) {
//                            ref.child(xabarId).setValue(xabar).addOnCompleteListener {
//                                Toast.makeText(this, "", Toast.LENGTH_LONG).show()
//                            }
//                        }
                    }
                }
            }
            dlg.setNegativeButton("Cancel", null)
            dlg.show()
        }
    }
}