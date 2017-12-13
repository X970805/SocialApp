package code.xp.social_app.view.myFirstShow;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import code.xp.social_app.R;

/**
 * Created by 徐宏福 on 2017/12/13.
 */

public class myFragment04 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = View.inflate(getContext(), R.layout.shoufragment, null);
        return view;

    }
}
