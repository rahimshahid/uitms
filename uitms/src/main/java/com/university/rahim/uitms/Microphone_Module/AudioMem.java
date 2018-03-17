package com.university.rahim.uitms.Microphone_Module;

import java.util.List;

/**
 * Created by rahim on 3/17/2018.
 */

public class AudioMem {
    public List<AudioValue> q;
    public int maxSize;

    public AudioMem(int maxSize){
        this.maxSize = maxSize;
        q =  new LimitedSizeQueue<>(maxSize);
    }

    public AudioMem(AudioMem that){
        this.maxSize = that.maxSize;
        q =  new LimitedSizeQueue<>(maxSize);
        this.q.addAll(that.q);
    }
}
