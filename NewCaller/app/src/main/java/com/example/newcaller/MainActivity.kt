package com.example.newcaller

import android.Manifest
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.provider.CallLog
import android.telecom.PhoneAccountHandle
import android.widget.ListView
import android.widget.SimpleCursorAdapter
import android.widget.TextView
import androidx.core.app.ActivityCompat
import java.time.Duration
import java.util.*
import kotlin.time.Duration.Companion.minutes

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(ActivityCompat.checkSelfPermission(this, Manifest.permission.READ_CALL_LOG) != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.READ_CALL_LOG), 111)
        }
        else
            readLog()
    }

    private fun readLog() {
        var cols:Array<String> = arrayOf(CallLog.Calls._ID, CallLog.Calls.NUMBER, CallLog.Calls.TYPE, CallLog.Calls.DURATION, CallLog.Calls.DATE)
        var rs =contentResolver.query(CallLog.Calls.CONTENT_URI, cols, null, null, "${CallLog.Calls.LAST_MODIFIED} DESC")
        var from:Array<String> = arrayOf(CallLog.Calls.NUMBER, CallLog.Calls.DURATION)
        var adapter = SimpleCursorAdapter(this, android.R.layout.simple_expandable_list_item_2, rs, from, intArrayOf(android.R.id.text1, android.R.id.text2), 0)
        val ListView: ListView = findViewById(R.id.listview) as ListView
                ListView.adapter = (adapter)
    //        while(rs?.moveToNext() !!) {
//            var type = ""
//            when(rs.getString(2).toInt()){
//                1 -> type = "Incoming"
//                2 -> type = "Outgoing"
//                3 -> type = "Missed Call"
//                4 -> type = "Voicemail"
//                5 -> type = "Rejected"
//                6 -> type = "Blacklist Call"
//                else -> type = "Cannot Validate"
//        }
//            var data = "\n\nNumber = " + rs.getString(1)
//            data += " \n TYPE = " + type
//            data += "\n DURATION = " + rs.getString(3)
//            data += "\n DATE = " + Date(rs.getString(4).toLong())
//            val textView: TextView = findViewById(R.id.edText) as TextView
//                textView.text = (data)
//            }
        }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == 111 && grantResults[0]==PackageManager.PERMISSION_GRANTED){
            readLog()
        }
    }
}

