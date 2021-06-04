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


public class FragmentFullyMesh extends Fragment {

    @Nullable
    @Override //fragmentdemonun göstereceği xmli tanıttık burada
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View myFragmentView = inflater.inflate(R.layout.fragment_fullymesh, container, false);

        TextView txt_mesh = (TextView) myFragmentView.findViewById(R.id.txt_fullymesh);
        String sb = "The value of fully meshed networks is proportional to the exponent of the number of subscribers,"+
                " assuming that communicating groups of any two endpoints, up to and including all the endpoints, is approximated by Reed's Law."+
                "Fully connected network\n"+
                "In a fully connected network, all nodes are interconnected. (In graph theory this is called a complete graph.) "+
                "The simplest fully connected network is a two-node network. A fully connected network doesn't need to use packet \n" +

                "switching or broadcasting. However, since the number of connections grows quadratically with the number of nodes:\n\n" +
                "c = n(n-1)/2\n\n"+
                "This makes it impractical for large networks. This kind of topology does not trip and affect other nodes in the network.";
        txt_mesh.setText(sb);
        return myFragmentView;

    }



}
