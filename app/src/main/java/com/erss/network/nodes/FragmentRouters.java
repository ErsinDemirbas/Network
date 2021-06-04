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

public class FragmentRouters extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View myFragmentView = inflater.inflate(R.layout.fragment_router,container,false);

        TextView txt_router = (TextView) myFragmentView.findViewById(R.id.txt_router);
        String sb = "A router is an internetworking device that forwards packets between networks by processing the routing information "+
                " included in the packet or datagram (Internet protocol information from layer 3)."+
                " The routing information is often processed in conjunction with the routing table (or forwarding table). " +
                "A router uses its routing table to determine "+
                "where to forward packets. A destination in a routing table can include a \"null\" interface,"+
                " also known as the \"black hole\" interface because data can go into it, however, no "+
                "further processing is done for said data, i.e. the packets are dropped.";
        txt_router.setText(sb);
        return myFragmentView;

    }
}
