package com.example.deliveryapp;

import android.os.Bundle;

import androidx.preference.PreferenceFragmentCompat;

public class fragment_settings extends PreferenceFragmentCompat {

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.root_preferences, rootKey);
    }
}