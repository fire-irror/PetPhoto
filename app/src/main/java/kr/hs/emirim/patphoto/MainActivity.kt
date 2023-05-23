package kr.hs.emirim.patphoto

import android.annotation.SuppressLint
import android.location.GnssAntennaInfo.Listener
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.*

class MainActivity : AppCompatActivity() {
    lateinit var checkStart:CheckBox
    lateinit var rg:RadioGroup
    lateinit var linear:LinearLayout
    lateinit var btnDone:Button
    lateinit var imgv:ImageView
    lateinit var switchStart : Switch
    lateinit var btnexit : Button


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        switchStart = findViewById(R.id.switch_start)
        rg = findViewById(R.id.rg)
        linear = findViewById(R.id.linear)
        btnDone = findViewById(R.id.btn_done)
        imgv = findViewById(R.id.imgv)
        btnexit = findViewById(R.id.btn_exit)
        linear.visibility = View.INVISIBLE

        switchStart.setOnCheckedChangeListener { compoundButton, b ->
            if (switchStart.isChecked) {
                linear.visibility = View.VISIBLE
            } else {
                linear.visibility = View.INVISIBLE
            }
        }
        rg.setOnCheckedChangeListener{compoundButton, b->
            when(rg.checkedRadioButtonId){
                R.id.radio_dog -> imgv.setImageResource(R.drawable.dog)
                R.id.radio_rabbit -> imgv.setImageResource(R.drawable.rab)
                R.id.radio_cat -> imgv.setImageResource(R.drawable.cat)
            }
        }
        btnDone.setOnClickListener(btnListener)
        btnexit.setOnClickListener(btnListener)
    }


        var btnListener = OnClickListener{
            when(it.id){
                R.id.btn_done -> finish()
                R.id.btn_exit -> linear.visibility = View.INVISIBLE
            }
        }
    }