package com.example.navigationodevi2

import android.os.Parcel
import android.os.Parcelable

data class PersonalInfo(
    val ad: String,
    val email: String,
    val telefon: String,
    val sehir: String,
    val kediSeviyor: Boolean,
    val kediAlerjisi: Boolean,
    val kediSahiplenir: Boolean
) :
    Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString() ?: "",
        parcel.readString() ?: "",
        parcel.readString() ?: "",
        parcel.readString() ?: "",
        parcel.readByte() != 0.toByte(),
        parcel.readByte() != 0.toByte(),
        parcel.readByte() != 0.toByte()
    )

    override fun describeContents(): Int {
        return 0
    }

    override fun writeToParcel(p0: Parcel, p1: Int) {
        p0.writeString(ad)
        p0.writeString(email)
        p0.writeString(telefon)
        p0.writeString(sehir)
    }

    companion object CREATOR : Parcelable.Creator<PersonalInfo> {
        override fun createFromParcel(parcel: Parcel): PersonalInfo {
            return PersonalInfo(parcel)
        }

        override fun newArray(size: Int): Array<PersonalInfo?> {
            return arrayOfNulls(size)
        }
    }
}

