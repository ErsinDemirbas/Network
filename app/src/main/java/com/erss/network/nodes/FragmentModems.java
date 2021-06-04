package com.erss.network.nodes;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.erss.network.R;

public class FragmentModems extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View myFragmentView = inflater.inflate(R.layout.fragment_modems,container,false);

        TextView txt_modems = (TextView) myFragmentView.findViewById(R.id.txt_modems);
        String sb = "Modems (MOdulator-DEModulator) are used to connect network nodes via wire not"+
                " originally designed for digital network traffic, or for wireless. To do this one or more "+
                "carrier signals are modulated by the digital signal to produce an analog signal that can be "+
                "tailored to give the required properties for transmission. Modems are "+
                "commonly used for telephone lines, using a digital subscriber line technology.";
        txt_modems.setText(sb);
        return myFragmentView;

    }
}
