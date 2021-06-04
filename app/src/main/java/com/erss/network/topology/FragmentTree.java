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

public class FragmentTree extends Fragment {

    @Nullable
    @Override //fragmentdemonun göstereceği xmli tanıttık burada
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View myFragmentView = inflater.inflate(R.layout.fragment_tree, container, false);

        TextView txt_tree = (TextView) myFragmentView.findViewById(R.id.txt_tree);
        String sb = "A tree network, or star-bus network, is a hybrid network topology in which star networks are interconnected via bus networks.\n"+
                "Tree networks are hierarchical, and each node can have an arbitrary number of child nodes.";
        txt_tree.setText(sb);
        return myFragmentView;
    }
}
