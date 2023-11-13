package de.simon.dankelmann.bluetoothlespam.ui.start

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class StartViewModel : ViewModel() {

    var appVersion = MutableLiveData<String>().apply {
        value = "0.0.0"
    }

    var androidVersion = MutableLiveData<String>().apply {
        value = "0"
    }

    var sdkVersion = MutableLiveData<String>().apply {
        value = "0"
    }

    var bluetoothSupport = MutableLiveData<String>().apply {
        value = "-"
    }

    var allPermissionsGranted = MutableLiveData<Boolean>().apply {
        value = false
    }

    var bluetoothAdapterIsReady = MutableLiveData<Boolean>().apply {
        value = false
    }

    var advertisementServiceIsReady = MutableLiveData<Boolean>().apply {
        value = false
    }

    var missingRequirements = MutableLiveData<MutableList<String>>().apply {
        value = mutableListOf()
    }


}