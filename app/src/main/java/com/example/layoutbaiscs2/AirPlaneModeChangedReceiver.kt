package com.example.layoutbaiscs2

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class AirPlaneModeChangedReceiver: BroadcastReceiver() {

    //The ?: check if something is null return the function
    override fun onReceive(context: Context?, intent: Intent?) {
        val isAirPlaneModeEnabled = intent?.getBooleanExtra("state",false) ?: return
        if (isAirPlaneModeEnabled){
            Toast.makeText(context, "Airplane Mode Enabled", Toast.LENGTH_LONG).show()
        }else{
            Toast.makeText(context, "Airplane Mode Disabled", Toast.LENGTH_LONG).show()
        }
    }
}