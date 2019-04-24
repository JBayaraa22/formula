package com.bayarjargal.me.formula;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * Created by User on 4/22/2019.
 */

public class FormulaListFragment extends Fragment implements View.OnClickListener {

    private String category_id;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.formula_list_fragment, container, false);
        Bundle bundle = this.getArguments();

        category_id = bundle.getString("cat_id");
        System.out.println(category_id);

        return root;
    }
    @Override
    public void onClick(View view) {

    }
}
