package com.example.newactivity

import android.app.Service
import android.content.Intent
import android.os.IBinder

class MyService : Service() {
override fun onBind(intent: Intent): IBinder? {
return null
}
override fun onStartCommand(intent: Intent, flags: Int, startId: Int): Int {
return START_STICKY
}
override fun onDestroy() {
super.onDestroy()

}
}