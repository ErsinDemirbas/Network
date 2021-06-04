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

public class FragmentLine extends Fragment {

    @Nullable
    @Override //fragmentdemonun göstereceği xmli tanıttık burada
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View myFragmentView = inflater.inflate(R.layout.fragment_line, container, false);

        TextView txt_linear = (TextView) myFragmentView.findViewById(R.id.txt_linear);
        String sb = "In a line topology the host communicates directly with " +
                "all nodes through one bus line. A standard Ethernet device or switch can be added to the end of the chain " +
                "if desired and used as normal. Be aware that these devices will compete for network bandwidth with the " +
                "FieldDAQ device. Reliable system design requires awareness of the bandwidth consumed by each device " +
                "during operations. This topology offers no redundant links.";
        txt_linear.setText(sb);
        return myFragmentView;
    }
}
