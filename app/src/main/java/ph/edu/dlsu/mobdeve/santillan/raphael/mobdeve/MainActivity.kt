package ph.edu.dlsu.mobdeve.santillan.raphael.mobdeve

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var et_username:EditText? = null
    var et_password:EditText? = null
    var btn_submit: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        et_username = findViewById(R.id.et_username)
        et_password = findViewById(R.id.et_password)
        btn_submit = findViewById(R.id.btn_submit)

        btn_submit!!.setOnClickListener{
            Log.i("MainActivity","Name: ${et_username?.text} pass: ${et_password?.text}")

            Toast.makeText(applicationContext,"Name: ${et_username?.text} pass: ${et_password?.text}",Toast.LENGTH_SHORT).show()

            var gotoHomeActivity = Intent(applicationContext,HomeActivity::class.java)
            var bundle = Bundle()
            bundle.putString("username_bundle",et_username!!.text.toString())

            gotoHomeActivity.putExtras(bundle)
            gotoHomeActivity.putExtra("username_extra",et_username!!.text.toString())
            startActivity(gotoHomeActivity)
            finish()



        }


    }
}