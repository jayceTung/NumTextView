package com.joker.numtextview;

/**
 * Created by Joker on 2016/4/22.
 */
public interface IRiseNumber {

    /**
     * 设置小数
     *
     * @param number
     * @return
     */
    public void setNumber(float number);

    /**
     * 设置整数
     *
     * @param number
     * @return
     */
    public void setNumber(int number);

    /**
     * 设置动画播放时长
     *
     * @param duration
     * @return
     */
    public void setDuration(long duration);

    /**
     * 设置动画结束监听器
     *
     * @param callback
     */
    public void setOnEndListener(NumAnimView.EndListener callback);
}
