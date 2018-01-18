package org.yczbj.ycvideoplayer.ui.me.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.yczbj.ycvideoplayer.R;
import org.yczbj.ycvideoplayer.base.BaseFragment;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Description:
 * Update:
 * CreatedTime:2017/12/29
 * Author:MysteryCode
 */

public class MeFragment extends BaseFragment implements View.OnClickListener {

    @Bind(R.id.tv_1)
    TextView tv1;
    @Bind(R.id.tv_2)
    TextView tv2;

    @Override
    public int getContentView() {
        return R.layout.fragment_me;
    }

    @Override
    public void initView() {

    }

    @Override
    public void initListener() {
        tv1.setOnClickListener(this);
        tv2.setOnClickListener(this);
    }

    @Override
    public void initData() {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tv_1:

                break;
            case R.id.tv_2:

                break;
            default:
                break;
        }
    }
}
