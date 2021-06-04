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

public class FragmentBridges extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View myFragmentView = inflater.inflate(R.layout.fragment_bridges,container,false);

        TextView txt_bridges = (TextView) myFragmentView.findViewById(R.id.txt_bridges);
        String sb = "A network bridge connects and filters traffic between two network segments at the data link layer (layer 2) of the OSI model to form a single network."+
                " This breaks the network's collision domain but maintains a unified broadcast domain. "+
                "Network segmentation breaks down a large, congested network into an aggregation of smaller, more efficient networks."+
                "Bridges come in three basic types:\n"+
                "\tLocal bridges: Directly connect LANs\n"+
                "\tRemote bridges: Can be used to create a WAN link between LANs. Remote bridges, where the connecting link is " +
                "slower than the end networks, largely have been replaced with routers.\n"+
                 "\tWireless bridges: Can be used to join LANs or connect remote devices to LANs.";
        txt_bridges.setText(sb);
        return myFragmentView;

    }
}
