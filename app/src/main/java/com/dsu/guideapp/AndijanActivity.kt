package com.dsu.guideapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_andijan.*

class AndijanActivity : AppCompatActivity() {
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
                    val dlgPhone: EditText = dialogView.findViewById(R.id.editPhone)
                    val dlgRest: EditText = dialogView.findViewById(R.id.txtRestaurant)
                    val dlgDate: EditText = dialogView.findViewById(R.id.txtDate)
                    val dlgTime: EditText = dialogView.findViewById(R.id.txtTime)
                    val dlgPeople: EditText = dialogView.findViewById(R.id.txtPeople)

                    val city = hashMapOf(
                        "name" to dlgName.text.toString(),
                        "email" to dlgEmail.text.toString(),
                        "phone" to dlgPhone.text.toString(),
                        "restaurant" to dlgRest.text.toString(),
                        "date" to dlgDate.text.toString(),
                        "time" to dlgTime.text.toString(),
                        "people" to dlgPeople.text.toString()
                    )

                    Firebase.firestore.collection("restaurant_bookings").document()
                        .set(city)
                        .addOnSuccessListener {
                            Toast.makeText(
                                this,
                                "You have successfully booked a table!",
                                Toast.LENGTH_SHORT
                            ).show()
                        }
                }
            }
            dlg.setNegativeButton("Cancel", null)
            dlg.show()
        }
    }
}