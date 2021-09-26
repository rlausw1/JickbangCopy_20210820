package com.neppplus.jickbangcopy_20210820

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.jickbangcopy_20210820.adapters.RoomAdapter
import com.neppplus.jickbangcopy_20210820.datas.RoomData
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList


class MainActivity : AppCompatActivity() {

    val mRoomList = ArrayList<RoomData>()
    lateinit var mRoomAdapter : RoomAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mRoomList.add(RoomData(7600, "서울시 동대문구", 5, "1번째 방입니다"))
        mRoomList.add(RoomData(250000, "서울시 동대문구", 1, "2번째 방입니다"))
        mRoomList.add(RoomData(30000, "서울시 서대문구", 0, "3번째 방입니다"))
        mRoomList.add(RoomData(8600, "서울시 동작구", 4, "4번째 방입니다"))
        mRoomList.add(RoomData(500, "서울시 동작구", 2, "5번째 방입니다"))
        mRoomList.add(RoomData(12000, "서울시 서대문구", -1, "6번째 방입니다"))
        mRoomList.add(RoomData(9000, "서울시 동작문구", 2, "7번째 방입니다"))


        mRoomAdapter = RoomAdapter( this, R.layout.room_list_item, mRoomList )
        roomListView.adapter = mRoomAdapter

        roomListView.setOnItemClickListener { adapterView, view, position, l ->

            val clickedRoom = mRoomList[ position ]

            val myIntent = Intent(this, ViewRoomDeatailActivity::class.java)

            myIntent.putExtra("roomData", clickedRoom)

            startActivity(myIntent)

        }


    }
}