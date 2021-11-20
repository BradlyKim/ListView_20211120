package com.nepplus.listview_20211120.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.nepplus.listview_20211120.datas.StudentData

class StudentAdapter(
    val mContext: Context,
    val resID: Int,
    val mList: ArrayList<StudentData>) : ArrayAdapter<StudentData>(mContext, resID, mList) {
}