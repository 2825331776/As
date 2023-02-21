package com.example.as_jin1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.as_jin1.Jin.age
import com.example.as_jin1.Jin.changage
import com.example.as_jin1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Example of a call to a native method
        binding.sampleText.text = stringFromJNI()
        var a= Jin();

        System.out.println("name 修改前是 ："+a.name);
        a.changname()
        System.out.println("name 修改后是 ："+a.name);

        System.out.println("age 修改前是 ："+ age);
        changage()
        System.out.println("age 修改后是 ："+ age);

        System.out.println("number 修改前是 ："+ a.number);
        a.changnumber()
        System.out.println("number 修改后是 ："+ a.number);

        a.calladdmathod()


    }


    /**
     * A native method that is implemented by the 'as_jin1' native library,
     * which is packaged with this application.
     */
    external fun stringFromJNI(): String

    companion object {
        // Used to load the 'as_jin1' library on application startup.
        init {
            System.loadLibrary("as_jin1")
        }
    }

}