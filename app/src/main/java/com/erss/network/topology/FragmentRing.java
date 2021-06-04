package com.erss.network.topology;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.erss.network.R;


public class FragmentRing extends Fragment {

    @Nullable
    @Override //fragmentdemonun göstereceği xmli tanıttık burada
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View myFragmentView = inflater.inflate(R.layout.fragment_ring, container, false);

        TextView txt_ring = (TextView) myFragmentView.findViewById(R.id.txt_ring);
        String sb = "A ring topology is a bus topology in a closed loop. Data travels around the ring in one direction. \n"+
                "When one node sends data to another, the data passes through each intermediate node on the ring until it reaches its destination."+
                " The intermediate nodes repeat (re transmit) the data to keep the signal strong. Every node is a peer;"+
                " there is no hierarchical relationship of clients and servers. If one node is unable to re transmit data,"+
                " it severs communication between the nodes before and after it in the bus.\n" +

                "Advantages:\n" +
                "When the load on the network increases, its performance is better than bus topology."+
                "There is no need of network server to control the connectivity between workstations.\n"+
                "Disadvantages:\n" +
                "Aggregate network bandwidth is bottlenecked by the weakest link between two nodes.";
        txt_ring.setText(sb);
        return myFragmentView;

    }



}
