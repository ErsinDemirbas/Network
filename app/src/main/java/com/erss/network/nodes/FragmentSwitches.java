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

public class FragmentSwitches extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View myFragmentView = inflater.inflate(R.layout.fragment_switches,container,false);

        TextView txt_switches = (TextView) myFragmentView.findViewById(R.id.txt_switches);
        String sb = "A network switch is a device that forwards and filters OSI layer 2 datagrams (frames) between ports "+
                "based on the destination MAC address in each frame. A switch is distinct from a hub in that it only"+
                " forwards the frames to the physical ports involved in the communication rather than "+
                " all ports connected. It can be thought of as a multi-port bridge. It learns to associate physical ports"+
                " to MAC addresses by examining the source addresses of received frames."+
                " If an unknown destination is targeted, the switch broadcasts to all ports but the source. Switches normally" +
                " have numerous ports, facilitating a star topology for devices, and cascading additional switches.\n" +
                "\n" +
                "Multi-layer switches are capable of routing based on layer 3 addressing or additional logical levels. " +
                "The term switch is often used loosely to include devices such as routers and bridges, as well as devices that " +
                "may distribute traffic based on load or based on application content (e.g., a Web URL identifier).";
        txt_switches.setText(sb);
        return myFragmentView;

    }
}
