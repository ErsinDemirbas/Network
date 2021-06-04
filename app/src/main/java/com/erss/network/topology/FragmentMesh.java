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


public class FragmentMesh extends Fragment {

    @Nullable
    @Override //fragmentdemonun göstereceği xmli tanıttık burada
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View myFragmentView = inflater.inflate(R.layout.fragment_mesh, container, false);

        TextView txt_mesh = (TextView) myFragmentView.findViewById(R.id.txt_mesh);
        String sb = "In a partially connected network, certain nodes are connected to exactly one other node; "+
                "but some nodes are connected to two or more other nodes with a point-to-point link. "+
                "This makes it possible to make use of some of the redundancy of mesh topology that is physically fully connected, "+
                "without the expense and complexity required for a connection between every node in the network.";
        txt_mesh.setText(sb);
        return myFragmentView;

    }



}
