package com.neppplus.gudocin_android.datas

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class StoreData(

    var id: Int,
    var name: String,
    @SerializedName("logo_url")
    var logoUrl: String,

) : Serializable {
}