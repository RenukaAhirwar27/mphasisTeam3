package com.mphasis.livingbeing.mammals;
import com.mphasis.livingbeing.mammals.organs.Eye;
public class Human {
    public HumanEye leftEye,rightEye;

    public Human(){
        leftEye=new HumanEye();
        rightEye=new HumanEye();
    }

    public class HumanEye extends Eye{
    }
}
