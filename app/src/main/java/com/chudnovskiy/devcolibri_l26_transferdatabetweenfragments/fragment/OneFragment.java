package com.chudnovskiy.devcolibri_l26_transferdatabetweenfragments.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.chudnovskiy.devcolibri_l26_transferdatabetweenfragments.R;

public class OneFragment extends Fragment {
    private final String LOG_TAG = "OneFragment";
    private Button buttonSendText;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.first_fragment_layout, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(LOG_TAG, "Fragment1 onStart");
        buttonSendText = (Button) getActivity().findViewById(R.id.button_send_text);
        buttonSendText.setOnClickListener(view -> {
            EditText editText = getActivity().findViewById(R.id.text_edit);
            TextView textView = getActivity().findViewById(R.id.text_view);
            textView.setText(editText.getText().toString());
        });
    }
}
