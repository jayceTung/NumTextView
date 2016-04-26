package com.joker.numtextview;

/**
 * Created by Joker on 2016/4/22.
 */
public interface IRiseNumber {

    /**
     *
     * @param number
     * @return
     */
    public void setNumber(float number);

    /**
     *
     * @param number
     * @return
     */
    public void setNumber(int number);

    /**
     *
     * @param duration
     * @return
     */
    public void setDuration(long duration);

    /**
     *
     * @param callback
     */
    public void setOnEndListener(NumAnimView.EndListener callback);
}
