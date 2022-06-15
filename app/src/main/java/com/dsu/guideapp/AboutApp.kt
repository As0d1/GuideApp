package com.dsu.guideapp

import android.os.Bundle
import android.view.Gravity
import androidx.appcompat.app.AppCompatActivity
import mehdi.sakout.aboutpage.AboutPage
import mehdi.sakout.aboutpage.Element
import java.lang.String
import java.util.*


class AboutApp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_app)

        title = "About App"

        val aboutPage = AboutPage(this)
            .isRTL(false)
            .setDescription(getString(R.string.app_description))
            .setImage(R.drawable.uzbekistan_flag)
            .addItem(Element().setTitle("Version 1.0"))
            .addGroup("Connect with us")
            .addEmail("rustamovasadbeey@gmail.com")
            .addFacebook("rustamov.asadbek.5")
            .addPlayStore("com.ideashower.readitlater.pro")
            .addInstagram("medyo80")
            .addGitHub("as0d1")
            .addItem(getCopyRightsElement())
            .create()

        setContentView(aboutPage)
    }

    fun getCopyRightsElement(): Element? {
        val copyRightsElement = Element()
        val copyrights =
            String.format(getString(R.string.copy_right), Calendar.getInstance().get(Calendar.YEAR))
        copyRightsElement.setTitle(copyrights)
        copyRightsElement.setIconDrawable(R.drawable.about_icon_copy_right)
        copyRightsElement.autoApplyIconTint = true
        copyRightsElement.setIconTint(mehdi.sakout.aboutpage.R.color.about_item_icon_color)
        copyRightsElement.iconNightTint = android.R.color.white
        copyRightsElement.gravity = Gravity.CENTER
        return copyRightsElement
    }
}