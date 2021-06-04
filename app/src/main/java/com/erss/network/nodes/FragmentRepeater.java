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

public class FragmentRepeater extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View myFragmentView = inflater.inflate(R.layout.node_fragment_repeaters,container,false);

        TextView txt_repeater = (TextView) myFragmentView.findViewById(R.id.txt_repeater);
        String sb = "A repeater is an electronic device that receives a network signal, cleans it of unnecessary noise and regenerates it."+
                " The signal may be reformed or retransmitted at a higher power level, to the other side of an obstruction possibly "+
                "using a different transmission medium, so that the signal can cover longer distances without degradation."+
                " Commercial repeaters have extended RS-232 segments from 15 meters to over a kilometer. "+
                " In most twisted pair Ethernet configurations, repeaters are required for cable that runs longer than 100 meters. "+
                "With fiber optics, repeaters can be tens or even hundreds of kilometers apart.";
        txt_repeater.setText(sb);
        return myFragmentView;

    }
}
