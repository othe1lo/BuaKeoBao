package com.example.buakeobao




import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast.LENGTH_LONG
import android.widget.Toast.makeText
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import kotlin.random.Random



class MainActivity : AppCompatActivity() {

    var random = kotlin.random.Random
    val list = listOf(1, 2, 3)
    var number : Int = list.random()
    //var begin : Int = 1
    //var end : Int = 3


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
           // Get random value

    }


    fun onKeo(view: View) {
        // Người dùng chọn Kéo => Kéo = 1
       // number = Random.nextInt(end - begin) + begin
        number = list.random()
        val btnBao: ImageButton = findViewById<View>(R.id.btnBao) as ImageButton
        val btnBua: ImageButton = findViewById<View>(R.id.btnBua) as ImageButton
        val btnKeo: ImageButton = findViewById<View>(R.id.btnKeo) as ImageButton
        val btnKetqua : ImageButton = findViewById<View>(R.id.btnKetqua) as ImageButton
        val textView = findViewById<TextView>(R.id.textView)
        btnKeo.setImageResource(R.drawable.keo)
        btnBua.setVisibility(View.GONE)
        btnBao.setVisibility(View.GONE)
        btnKeo.setEnabled(false)

        if (number ==3) { // Ứng dụng chọn Bao
            btnKetqua.setImageResource(R.drawable.bao)
            btnKetqua.setBackgroundResource(0)
            textView.text = "Wow! Bạn thắng rồi!"
           // makeText(applicationContext, "Wow! Bạn thắng rồi!", LENGTH_LONG).show()

        } else if (number == 1) { // Ứng dụng chọn Kéo
            btnKetqua.setImageResource(R.drawable.keo)
            btnKetqua.setBackgroundResource(0)
            textView.text = "Yup! Hòa rồi!"
            //makeText(applicationContext, "Yup! Hòa rồi!", LENGTH_LONG).show()

        } else if (number == 2) { // Ứng dụng chọn Búa
            btnKetqua.setImageResource(R.drawable.bua)
            btnKetqua.setBackgroundResource(0)
            textView.text = "Bạn đã thua!"
           // makeText(applicationContext, "Bạn đã thua!", LENGTH_LONG).show()

        }
    }

    fun onBua(view: View) {
        // Người dùng chọn Búa => Búa = 2
       // number = Random.nextInt(end - begin) + begin
        number = list.random()
        val btnBao: ImageButton = findViewById<View>(R.id.btnBao) as ImageButton
        val btnBua: ImageButton = findViewById<View>(R.id.btnBua) as ImageButton
        val btnKeo: ImageButton = findViewById<View>(R.id.btnKeo) as ImageButton
        val btnKetqua : ImageButton = findViewById<View>(R.id.btnKetqua) as ImageButton
        val textView = findViewById<TextView>(R.id.textView)
        btnBua.setImageResource(R.drawable.bua)
        //btnKeo.setBackgroundResource(R.drawable.keo)
        //btnBao.setBackgroundResource(R.drawable.bao)
        btnKeo.setVisibility(View.GONE)
        btnBao.setVisibility(View.GONE)
        btnBua.setEnabled(false)

        if (number ==3) { // Ứng dụng chọn Bao
            btnKetqua.setImageResource(R.drawable.bao)
            btnKetqua.setBackgroundResource(0)
            textView.text = "Bạn đã thua!"
            //makeText(applicationContext, "Bạn đã thua!", LENGTH_LONG).show()

        } else if (number == 1) { // Ứng dụng chọn Kéo
            textView.text = "Wow! Bạn thắng rồi!"
            btnKetqua.setImageResource(R.drawable.keo)
            btnKetqua.setBackgroundResource(0)
            //makeText(applicationContext, "Wow! Bạn thắng rồi!", LENGTH_LONG).show()

        } else if (number == 2) { // Ứng dụng chọn Búa
            btnKetqua.setImageResource(R.drawable.bua)
            btnKetqua.setBackgroundResource(0)
            textView.text = "Yup! Hòa rồi!"
           // makeText(applicationContext, "Yup! Hòa rồi!", LENGTH_LONG).show()

        }
    }

    fun onBao(view: View) {
        // Người dùng chọn Bao => Bao = 3
        //number = Random.nextInt(end - begin) + begin
        number = list.random()
        val btnBao: ImageButton = findViewById<View>(R.id.btnBao) as ImageButton
        val btnBua: ImageButton = findViewById<View>(R.id.btnBua) as ImageButton
        val btnKeo: ImageButton = findViewById<View>(R.id.btnKeo) as ImageButton
        val btnKetqua : ImageButton = findViewById<View>(R.id.btnKetqua) as ImageButton
        val textView = findViewById<TextView>(R.id.textView)
        btnBao.setImageResource(R.drawable.bao)
        //btnKeo.setBackgroundResource(R.drawable.keo)
        //btnBua.setBackgroundResource(R.drawable.bua)
        btnKeo.setVisibility(View.GONE)
        btnBua.setVisibility(View.GONE)
        btnBao.setEnabled(false)

        if (number ==3) { // Ứng dụng chọn Bao
            btnKetqua.setImageResource(R.drawable.bao)
            btnKetqua.setBackgroundResource(0)
            textView.text = "Yup! Hòa rồi!"
            //makeText(applicationContext, "Yup! Hòa rồi!", LENGTH_LONG).show()

        } else if (number == 1) { // Ứng dụng chọn Kéo
            btnKetqua.setImageResource(R.drawable.keo)
            btnKetqua.setBackgroundResource(0)
            textView.text = "Bạn đã thua! Chơi lại!"
            //makeText(applicationContext, "Bạn đã thua!", LENGTH_LONG).show()

        } else if (number == 2) { // Ứng dụng chọn Búa
            btnKetqua.setImageResource(R.drawable.bua)
            btnKetqua.setBackgroundResource(0)
            textView.text = "Bạn thắng rồi!"

            //makeText(applicationContext, "Wow! Bạn thắng rồi!", LENGTH_LONG).show()

        }
    }

    fun onAgain(view: View) {
        val btnBao: ImageButton = findViewById<View>(R.id.btnBao) as ImageButton
        val btnBua: ImageButton = findViewById<View>(R.id.btnBua) as ImageButton
        val btnKeo: ImageButton = findViewById<View>(R.id.btnKeo) as ImageButton
        val btnKetqua : ImageButton = findViewById<View>(R.id.btnKetqua) as ImageButton
        val textView = findViewById<TextView>(R.id.textView)
        btnBua.setVisibility(View.VISIBLE)
        btnKeo.setVisibility(View.VISIBLE)
        btnBao.setVisibility(View.VISIBLE)
        btnBua.setEnabled(true)
        btnKeo.setEnabled(true)
        btnBao.setEnabled(true)

        btnBua.setImageResource(R.drawable.bua)
        btnKeo.setImageResource(R.drawable.keo)
        btnBao.setImageResource(R.drawable.bao)
        btnKetqua.setImageResource(R.drawable.question)
        textView.text ="Oản Tù Xì ra cái gì?"
        //number  = random.nextInt(end - begin) + begin
        number = list.random()

    }

    fun exitApp(view: View){
        System.exit(0)
    }

}
