package com.nicootech.mvvmloginsimple.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.nicootech.mvvmloginsimple.R
import com.nicootech.mvvmloginsimple.databinding.ActivityLoginBinding
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity(), LoginListener {

    lateinit var binding :ActivityLoginBinding
    lateinit var viewModel: LoginViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_login)
        viewModel= ViewModelProvider(this).get(LoginViewModel::class.java)
        binding.viewmodel = viewModel
        viewModel.loginListener=this

    }
    override fun onStarted() {

        Toast.makeText(this,"Login Started",Toast.LENGTH_SHORT).show()

    }

    override fun onSuccess() {

        Toast.makeText(this,"Login Success",Toast.LENGTH_SHORT).show()
    }

    override fun onFailure() {
        Toast.makeText(this,"Invalid email or password",Toast.LENGTH_SHORT).show()


    }

}
