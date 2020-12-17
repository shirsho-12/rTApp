package com.x.rtapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class live_chat extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_live_chat, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

//        try {
//            intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://page/" + pageId));
//        } catch (Exception e) {
//            intent =  new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/" + pageId));
//        }
    }
}