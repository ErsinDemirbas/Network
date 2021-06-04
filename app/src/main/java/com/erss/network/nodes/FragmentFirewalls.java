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

public class FragmentFirewalls extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View myFragmentView = inflater.inflate(R.layout.frament_firewalls,container,false);

        TextView txt_firewalls = (TextView) myFragmentView.findViewById(R.id.txt_firewalls);
        String sb = "A firewall is a network device for controlling network security and access rules."+
                " Firewalls are typically configured to reject access requests from unrecognized sources while allowing actions from recognized "+
                "ones. The vital role firewalls play in network security grows in parallel with the constant increase in cyber attacks.";
        txt_firewalls.setText(sb);
        return myFragmentView;

    }
}
