package com.nicootech.mvvmloginsimple.ui

interface LoginListener {
    fun onStarted()
    fun onSuccess()
    fun onFailure()
}