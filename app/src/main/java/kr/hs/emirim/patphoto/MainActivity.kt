package kr.hs.emirim.patphoto

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RadioGroup

class MainActivity : AppCompatActivity() {
    lateinit var checkStart:CheckBox
    lateinit var rg:RadioGroup
    lateinit var linear:LinearLayout
    lateinit var btnDone:Button
    lateinit var imgv:ImageView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        checkStart = findViewById(R.id.check_start)
        rg = findViewById(R.id.rg)
        linear = findViewById(R.id.linear)
        btnDone = findViewById(R.id.btn_done)
        imgv = findViewById(R.id.imgv)
        linear.visibility = View.INVISIBLE

        checkStart.setOnCheckedChangeListener{compoundButton, b ->
            if(checkStart.isChecked){
                linear.visibility = View.VISIBLE
            }else{
                linear.visibility = View.INVISIBLE
            }

        }
    }
}