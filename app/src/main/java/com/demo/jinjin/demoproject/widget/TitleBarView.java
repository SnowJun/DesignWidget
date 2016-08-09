package com.demo.jinjin.demoproject.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.demo.jinjin.demoproject.R;


/**
 * @author Administrator
 * @version $Revision: 17870 $ $Date: 2015-06-24 12:09:08 +0800 (周三, 2015-06-24) $
 * @ClassName: TitleBarView
 * @Description: title
 * @history
 */
public class TitleBarView extends RelativeLayout {

    private static final String TAG = "TitleBarView";

    private Context mContext;

    private TextView imageBtnLeft;

    private TextView btnLeft;

    private TextView btnRight;

    private TextView imgButtonRight;

    private TextView tv_center;

    private TextView conrerText;

    public TitleBarView(Context context) {
        super(context);
        mContext = context;
        initView();
    }

    public TitleBarView(Context context, AttributeSet attrs) {
        super(context, attrs);
        mContext = context;
        initView();
    }

    private void initView() {
        LayoutInflater.from(mContext).inflate(R.layout.layout_title_bar, this);
        imageBtnLeft = (TextView) findViewById(R.id.title_imgbtn_left);
        btnLeft = (TextView) findViewById(R.id.title_btn_left);
        btnRight = (TextView) findViewById(R.id.title_btn_right);
        imgButtonRight = (TextView) findViewById(R.id.title_imgbtn_right);
        tv_center = (TextView) findViewById(R.id.title_txt);
        conrerText = (TextView) findViewById(R.id.title_corner_text);

    }

    public void showCornerText(int Visibility) {

        if (Visibility == View.GONE) {

            conrerText.setVisibility(View.VISIBLE);

            conrerText.setVisibility(View.GONE);

        } else {

            conrerText.setVisibility(View.GONE);

            conrerText.setVisibility(View.VISIBLE);

        }

    }

    public void setCornerText(String str) {

        conrerText.setText(str);

    }

    public void setCommonTitle(int LeftImgBtnVisibility, int LeftVisibility, int centerVisibility,
                               int center1Visibilter, int rightVisibility, int rightImgBtnVisibility) {

        if (LeftImgBtnVisibility == View.GONE || LeftImgBtnVisibility == View.INVISIBLE) {

            imageBtnLeft.setVisibility(View.GONE);
        } else {

            imageBtnLeft.setVisibility(View.VISIBLE);
        }

        if (LeftVisibility == View.GONE || LeftVisibility == View.INVISIBLE) {

            btnLeft.setVisibility(View.GONE);
        } else {

            btnLeft.setVisibility(View.VISIBLE);
        }

        if (centerVisibility == View.GONE || centerVisibility == View.INVISIBLE) {

            tv_center.setVisibility(View.GONE);
        } else {

            tv_center.setVisibility(View.VISIBLE);
        }

        if (rightVisibility == View.GONE || rightVisibility == View.INVISIBLE) {

            btnRight.setVisibility(View.GONE);
        } else {

            btnRight.setVisibility(View.VISIBLE);
        }

        if (rightImgBtnVisibility == View.GONE || rightImgBtnVisibility == View.INVISIBLE) {
            imgButtonRight.setVisibility(View.GONE);
        } else {
            imgButtonRight.setVisibility(View.VISIBLE);
        }

    }

    public void setBtnLeft(int txtRes) {
        btnLeft.setText(txtRes);
    }

    public void setimageBtnLeft(int icon) {
        imageBtnLeft.setBackgroundResource(icon);
    }

    public void setBtnRight(int txtRes) {
        btnRight.setText(txtRes);
    }

    public void setImgBtnRight(int icon) {
        imgButtonRight.setBackgroundResource(icon);
    }

    public void setTitleText(int txtRes) {
        tv_center.setText(txtRes);
    }

    public void setTitleText(String text) {
        tv_center.setText(text);
    }

    public void setImgBtnLeftOnclickListener(OnClickListener listener) {
        imageBtnLeft.setOnClickListener(listener);
    }

    public void setBtnLeftOnclickListener(OnClickListener listener) {
        btnLeft.setOnClickListener(listener);
    }

    public void setBtnRightOnclickListener(OnClickListener listener) {
        btnRight.setOnClickListener(listener);
    }

    public void setImgBtnRightOnclickListener(OnClickListener listener) {
        imgButtonRight.setOnClickListener(listener);
    }

    public void destoryView() {
        btnLeft.setText(null);
        btnRight.setText(null);
        tv_center.setText(null);
    }

}
