package com.nicootech.mvvmloginsimple.ui

import android.view.View
import androidx.lifecycle.ViewModel

class LoginViewModel :ViewModel() {
    val email :String? = null
    val password :String? = null

    var loginListener:LoginListener?=null

    fun onLoginResponse(view:View){
        loginListener?.onStarted()
        if(email.isNullOrEmpty()|| password.isNullOrEmpty()){
            loginListener?.onFailure()
            return

        }
        loginListener?.onSuccess()

    }
}