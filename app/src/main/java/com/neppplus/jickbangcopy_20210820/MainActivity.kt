package com.neppplus.jickbangcopy_20210820

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.jickbangcopy_20210820.datas.RoomData
import java.util.ArrayList


class MainActivity : AppCompatActivity() {

    val mRoomList = ArrayList<RoomData>()

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
    }
}