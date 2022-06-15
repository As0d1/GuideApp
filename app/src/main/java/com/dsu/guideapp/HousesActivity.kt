package com.dsu.guideapp

import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.FirebaseApp
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.about_hotel.view.*
import kotlinx.android.synthetic.main.activity_houses.*

class HousesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_houses)

        title = "Rent a House"

        imgBtnAboutHouse1.setOnClickListener {
            bookHotel()
        }
        imgBtnAboutHouse2.setOnClickListener {
            bookHotel()
        }
        imgBtnAboutHouse3.setOnClickListener {
            bookHotel()
        }
        imgBtnAboutHouse4.setOnClickListener {
            bookHotel()
        }
    }

    private fun bookHotel() {
        val dialogView: View = View.inflate(this, R.layout.about_house, null)
        val dlg = AlertDialog.Builder(this)

        dialogView.btnReserveHotel.setOnClickListener {
            val dialogView: View = View.inflate(this, R.layout.reserve_hotel_form, null)
            val dlg = AlertDialog.Builder(this)
            dlg.setTitle("Book a House")
            dlg.setView(dialogView)
            dlg.setPositiveButton("Book") { dialog, which ->
                run {
                    val dlgName: EditText = dialogView.findViewById(R.id.txtName)
                    val dlgEmail: EditText = dialogView.findViewById(R.id.txtEmail)
                    val dlgPhone: EditText = dialogView.findViewById(R.id.txtPhone)
                    val dlgDate: EditText = dialogView.findViewById(R.id.txtDate)
                    val dlgTime: EditText = dialogView.findViewById(R.id.txtTime)
                    val dlgPeople: EditText = dialogView.findViewById(R.id.txtPeople)

                    if (dlgName.text.isNullOrEmpty()) {
                        val toast = Toast.makeText(this, "Enter your name.", Toast.LENGTH_LONG)
                        toast.setGravity(Gravity.CENTER, 0, 0)
                        toast.show()
                    } else if (dlgEmail.text.isNullOrEmpty()) {
                        val toast = Toast.makeText(this, "Enter your email.", Toast.LENGTH_LONG)
                        toast.setGravity(Gravity.CENTER, 0, 0)
                        toast.show()
                    } else if (dlgPhone.text.isNullOrEmpty()) {
                        val toast = Toast.makeText(this, "Enter your phone.", Toast.LENGTH_LONG)
                        toast.setGravity(Gravity.CENTER, 0, 0)
                        toast.show()
                    } else if (dlgDate.text.isNullOrEmpty()) {
                        val toast = Toast.makeText(this, "Enter date.", Toast.LENGTH_LONG)
                        toast.setGravity(Gravity.CENTER, 0, 0)
                        toast.show()
                    } else if (dlgTime.text.isNullOrEmpty()) {
                        val toast = Toast.makeText(this, "Enter time.", Toast.LENGTH_LONG)
                        toast.setGravity(Gravity.CENTER, 0, 0)
                        toast.show()
                    } else if (dlgPeople.text.isNullOrEmpty()) {
                        val toast =
                            Toast.makeText(this, "Enter number of people.", Toast.LENGTH_LONG)
                        toast.setGravity(Gravity.CENTER, 0, 0)
                        toast.show()
                    } else {
                        val data = hashMapOf(
                            "name" to dlgName.text.toString(),
                            "email" to dlgEmail.text.toString(),
                            "phone" to dlgPhone.text.toString(),
                            "date" to dlgDate.text.toString(),
                            "time" to dlgTime.text.toString(),
                            "people" to dlgPeople.text.toString()
                        )
                        FirebaseApp.initializeApp(this);
                        val db = Firebase.firestore
                        db.collection("house_bookings")
                            .add(data)
                            .addOnSuccessListener { documentReference ->
                                Toast.makeText(
                                    this,
                                    "You have booked for this house successfully!",
                                    Toast.LENGTH_SHORT
                                ).show()
                            }

                    }
                }
            }
            dlg.setNegativeButton("Cancel", null)
            dlg.show()
        }

        dlg.setTitle("About House")
        dlg.setView(dialogView)
        dlg.setPositiveButton("OK") { dialog, which ->
        }
        dlg.show()
    }
}