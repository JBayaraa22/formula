package com.bayarjargal.me.formula;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

public class MainMenuFragment extends Fragment implements View.OnClickListener {

    private Bundle bundle;
    private Fragment formulaListFragment;
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;
    private ImageView m1 , m2 , m3 , m4 , m5 , m6 , m7 ,m8 , m9;
    private static class Category{
        final public static String CONSTANT                 = "F100";
        final public static String ARITHMETIC               = "F101";
        final public static String ALGEBRA_ANALYSIS         = "F102";
        final public static String GEOMETER                 = "F103";
        final public static String TRIGONOMETER             = "F104";
        final public static String ANAYLYTIC_GEOMETER       = "F105";
        final public static String MATHEMATIC_ANALYSIS      = "F106";
        final public static String DIFFERENTIAL_CALCULATION = "F107";
        final public static String INTEGRAL_CALCULATION     = "F108";
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.main_menu,container,false);
        fragmentManager = getFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();

        m1 = (ImageView) root.findViewById(R.id.constants);
        m2 = (ImageView) root.findViewById(R.id.arithmetic);
        m3 = (ImageView)  root.findViewById(R.id.algebra_analysis);
        m4 = (ImageView)  root.findViewById(R.id.geometr);
        m5 = (ImageView)  root.findViewById(R.id.trigonometer);
        m6 = (ImageView)  root.findViewById(R.id.analytic_geometer);
        m7 = (ImageView)  root.findViewById(R.id.math_analysis);
        m8 = (ImageView)  root.findViewById(R.id.diff_calculation);
        m9 = (ImageView)  root.findViewById(R.id.integral_calculation);

        m1.setOnClickListener(this);
        m2.setOnClickListener(this);
        m3.setOnClickListener(this);
        m4.setOnClickListener(this);
        m5.setOnClickListener(this);
        m6.setOnClickListener(this);
        m7.setOnClickListener(this);
        m8.setOnClickListener(this);
        m9.setOnClickListener(this);

        return root;
    }

    @Override
    public void onClick(View view) {
        formulaListFragment = new FormulaListFragment();
        switch (view.getId()){
            case R.id.constants:
                bundle = new Bundle();
                bundle.putString("cat_id" , Category.CONSTANT);
                break;
            case R.id.arithmetic:
                bundle = new Bundle();
                bundle.putString("cat_id" , Category.ARITHMETIC);
                break;
            case R.id.algebra_analysis:
                bundle = new Bundle();
                bundle.putString("cat_id" , Category.ALGEBRA_ANALYSIS);
                break;
            case R.id.geometr:
                bundle = new Bundle();
                bundle.putString("cat_id" , Category.GEOMETER);
                break;
            case R.id.trigonometer:
                bundle = new Bundle();
                bundle.putString("cat_id" , Category.TRIGONOMETER);
                break;
            case R.id.analytic_geometer:
                bundle = new Bundle();
                bundle.putString("cat_id" , Category.ANAYLYTIC_GEOMETER);
                break;
            case R.id.math_analysis:
                bundle = new Bundle();
                bundle.putString("cat_id" , Category.MATHEMATIC_ANALYSIS);
                break;
            case R.id.diff_calculation:
                bundle = new Bundle();
                bundle.putString("cat_id" , Category.DIFFERENTIAL_CALCULATION);
                break;
            case R.id.integral_calculation:
                bundle = new Bundle();
                bundle.putString("cat_id" , Category.INTEGRAL_CALCULATION);
                break;
            default:
                Toast.makeText(getContext() , "Алдаа гарлаа" , Toast.LENGTH_LONG).show();
                return;
        }
        System.out.println("WTF");
        formulaListFragment.setArguments(bundle);
        fragmentTransaction.replace(R.id.fragment_container , formulaListFragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}
