package id.my.okisulton.functionandclasses

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var age: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        makeSimpsopn()
    }

    fun helloWorld(view: View) {
        textView.text = "Hello World!"
    }
//
//    fun makeSimpsopn(){
//        val homer = Simpson("Oki", 22, "Mobile Progremmer")
//        homer.age = homer.age+1
//        println(homer.age)
//    }

    fun maksSimpson(view: View) {

        val name = etName.text.toString()
        if (!etAge.text.toString().equals("")){
            age = etAge.text.toString().toInt()
        }
        val job = etJob.text.toString()
        val simpson = Simpson(name, age, job)
        textView.setText("Name : "+ simpson.name + ", Age : " + simpson.age + ", Job : " + simpson.jobs)
    }
}