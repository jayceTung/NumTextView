package com.joker.numtextview;

/**
 * Created by Joker on 2016/4/22.
 */
public interface IRiseNumber {


    public void setNumber(float number);


    public void setNumber(int number);


    public void setDuration(long duration);


    public void setOnEndListener(NumAnimView.EndListener callback);
}
