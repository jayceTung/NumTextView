package com.joker.numtextview;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.TextView;

/**
 * Created by Joker on 2016/4/22.
 */
public class NumAnimView extends TextView
        implements IRiseNumber {
    private EndListener mEndListener = null;
    private float fromNumber;

    private long duration = 1500;

    public interface EndListener {
        public void onEndFinish();
    }

    public NumAnimView(Context context) {
        super(context);
    }

    public NumAnimView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public NumAnimView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void showNumberWithAnimation(float number) {
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(this, "number", fromNumber, number);
        this.fromNumber = number;
        objectAnimator.setDuration(duration);
        objectAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                if (animation.getAnimatedFraction() >= 1) {
                    if (mEndListener != null) {
                        mEndListener.onEndFinish();
                    }
                }
            }
        });
        objectAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        objectAnimator.start();
    }


    @Override
    public void setNumber(float number) {
        this.fromNumber = number;
        setText(String.valueOf(number));
    }

    @Override
    public void setNumber(int number) {
        this.fromNumber = (float) number;
        setText(String.valueOf(number));
    }

    @Override
    public void setDuration(long duration) {
        this.duration = duration;
    }

    @Override
    public void setOnEndListener(EndListener callback) {
        mEndListener = callback;
    }
}
