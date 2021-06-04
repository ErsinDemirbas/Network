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

public class FragmentBus extends Fragment {

    @Nullable
    @Override //fragmentdemonun göstereceği xmli tanıttık burada
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View myFragmentView = inflater.inflate(R.layout.fragment_bus, container, false);

        TextView txt_bus = (TextView) myFragmentView.findViewById(R.id.txt_bus);
        String sb = "In local area networks using bus topology, each node is connected by interface connectors to a single central cable.\n"+
                " This is the 'bus', also referred to as the backbone, or trunk) – all data transmitted between nodes in the network"+
                " is transmitted over this common transmission medium and is able to be received by all nodes in the network simultaneously."+
                "A signal containing the address of the intended receiving machine travels from a source machine in both directions to all machines connected to the bus"+
                " until it finds the intended recipient, which then accepts the data. If the machine address does not match the intended address for the data, the data portion of the signal is ignored."+
                " Since the bus topology consists of only one wire it is less expensive to implement than other topologies, "+
                "but the savings are offset by the higher cost of managing the network. Additionally, since the network is dependent on the single cable, "+
                " it can be the single point of failure of the network. In this topology data being transferred may be accessed by any node.";
        txt_bus.setText(sb);
        return myFragmentView;
    }
}
