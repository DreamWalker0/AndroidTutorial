package com.example.layoutbaiscs2

import android.app.IntentService
import android.content.Intent
import android.util.Log

class MyIntentService : IntentService("MyIntentService") {

    init {
        instance = this
    }

    companion object{
        private lateinit var instance: MyIntentService
        //To check if the service is running
        var isRunning = false

        //function for stopping service
        fun stopService(){
            Log.d("MyIntentService", "Service is stopping...")
            isRunning = false
            instance.stopSelf()
        }

    }

    override fun onHandleIntent(intent: Intent?) {
        try {
            isRunning = true
            while (isRunning){
                Log.d("MyIntentService","Service is running!...")
                //sleep one min
                Thread.sleep(1000)
            }
        }catch (e:InterruptedException){
            Thread.currentThread().interrupt()
        }

    }
}