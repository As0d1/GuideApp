package com.dsu.guideapp

import android.content.Intent
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContentProviderCompat.requireContext
import kotlinx.android.synthetic.main.activity_andijan.*
import kotlinx.android.synthetic.main.xabar_layout.*
import softromeda.hadisisharif.FireXabar

class AndijanActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_andijan)

        btnCheckMenu.setOnClickListener {
            val intent = Intent(this, CheckMenu::class.java)
            intent.putExtra("menuData", getString(R.string.city_grill_menu))
            intent.putExtra("restName", "gumbaza")
            startActivity(intent)
        }
        btnCheckVerandaMenu.setOnClickListener {
            val intent = Intent(this, CheckMenu::class.java)
            intent.putExtra("menuData", getString(R.string.veranda))
            intent.putExtra("restName", "verando")
            startActivity(intent)
        }
        btnCheckGulshanMenu.setOnClickListener {
            val intent = Intent(this, CheckMenu::class.java)
            intent.putExtra("menuData", getString(R.string.city_grill_menu))
            intent.putExtra("restName", "gumbaza")
            startActivity(intent)
        }
        btnCheckUzbekistanMenu.setOnClickListener {
            val intent = Intent(this, CheckMenu::class.java)
            intent.putExtra("menuData", getString(R.string.city_grill_menu))
            intent.putExtra("restName", "gumbaza")
            startActivity(intent)
        }

        btnBookAndijan.setOnClickListener {
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
                    txtRestaurant.setAdapter(adapter)


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
            dlg.setNegativeButton("Bekor qilish", null)
            dlg.show()
        }
    }
}