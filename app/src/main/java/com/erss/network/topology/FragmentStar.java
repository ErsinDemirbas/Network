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


public class FragmentStar extends Fragment {

    @Nullable
    @Override //fragmentdemonun göstereceği xmli tanıttık burada
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View myFragmentView = inflater.inflate(R.layout.fragment_star, container, false);

        TextView txt_star = (TextView) myFragmentView.findViewById(R.id.txt_star);
        String sb = "In star topology, every peripheral node (computer workstation or any other peripheral)\n"+
                "is connected to a central node called a hub or switch. The hub is the server and the peripherals are the clients."+
                "The network does not necessarily have to resemble a star to be classified as a star network, but all of the peripheral nodes "+
                "on the network must be connected to one central hub. All traffic that traverses the network passes through the central hub,"+
                " which acts as a signal repeater."+
                "The star topology is considered the easiest topology to design and implement. One advantage of the star topology"+
                "is the simplicity of adding additional nodes. The primary disadvantage of the star topology is that the hub "+
                "represents a single point of failure. Also, since all peripheral communication must flow through the "+
                "central hub, the aggregate central bandwidth forms a network bottleneck for large clusters.";
        txt_star.setText(sb);
        return myFragmentView;

    }



}
