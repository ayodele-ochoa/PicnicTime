package com.ayoapps.picnictime.views.utils

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Build
import androidx.annotation.RequiresApi


class NetworkCheck
{
    val disconnectMessage = "You are not currently connected to the internet. Please check your Wifi and try again."
    @RequiresApi(Build.VERSION_CODES.M)
     fun isNetworkConnected(context: Context): Boolean
    {
        val connectivityManager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val activeNetwork = connectivityManager.activeNetwork
        val networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)
        return networkCapabilities != null &&
                networkCapabilities.hasCapability(NetworkCapabilities.NET_CAPABILITY_INTERNET)
    }

    fun disconnectMessage() = disconnectMessage
}