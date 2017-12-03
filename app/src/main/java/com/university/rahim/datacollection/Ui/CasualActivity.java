package com.university.rahim.datacollection.Ui;

import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.university.rahim.datacollection.R;

import org.reactivestreams.Subscription;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subscribers.DisposableSubscriber;

public class CasualActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_casual);

        /*
        final Observable<Integer> serverDownloadObservable = Observable.create(emitter -> {
            SystemClock.sleep(1000);
            emitter.onNext(5);
            SystemClock.sleep(1000);
            emitter.onNext(10);
            SystemClock.sleep(1000);
            emitter.onNext(15);
            SystemClock.sleep(1000);
            emitter.onNext(20);
        });

        serverDownloadObservable.observeOn(AndroidSchedulers.mainThread()).subscribeOn(Schedulers.io())
                .subscribe(integer -> ((TextView)this.findViewById(R.id.textView)).setText("" + integer));
                */

        //Single.create(emitter -> emitter.onSuccess(new Integer(76))).subscribe(Object -> ((TextView)this.findViewById(R.id.textView)).setText("" + (Integer)Object));


        Flowable.create(emitter -> {
            Integer x = 5;
            while (x < 10){
                emitter.onNext(x++);
                SystemClock.sleep(1000);
            }
            emitter.onError(new Exception("ERROR"));
            emitter.onComplete();
        }, BackpressureStrategy.BUFFER).observeOn(AndroidSchedulers.mainThread()).subscribeOn(Schedulers.io())
                .subscribe(Integer -> ((TextView)this.findViewById(R.id.textView)).setText(Integer.toString()),
                        Exception -> ((TextView)this.findViewById(R.id.textView)).setText(Exception.getMessage()));



    }
}
