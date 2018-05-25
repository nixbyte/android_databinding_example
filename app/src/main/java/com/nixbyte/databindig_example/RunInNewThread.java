package com.nixbyte.databindig_example;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.Map;
import java.util.Random;

public class RunInNewThread implements Runnable {

    private static final String TAG = RunInNewThread.class.getSimpleName();
    private Map<String, Object> car;
    private TypedArray images;
    private String[]  descriptions;
    private Context context;
    private static Boolean rate = null;

    public RunInNewThread(Context context, Map car) {
        this.context = context;
        this.car = car;
        this.images = context.getResources().obtainTypedArray(R.array.images);
        this.descriptions = context.getResources().getStringArray(R.array.descriptions);
    }

    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {

                    Thread.sleep(3000);

                    if(rate == null)
                        rate = true;
                    else
                        rate = null;

                    car.put("carDescription",descriptions[new Random().nextInt(3)+1]);
                    car.put("carImage", context.getResources().getDrawable(images.getResourceId(new Random().nextInt(2)+1,R.drawable.image)));
                    car.put("carSpeed",new Random().nextInt(213) + 60);
                    car.put("carAcceleration",new Random().nextFloat());
                    car.put("carPower",new Random().nextInt(366) + 100);
                    car.put("carDensityPower",new Random().nextInt(230) + 100);
                    car.put("carCapacity",new Random().nextFloat());
                    car.put("carWeight",new Random().nextInt(1593) + 600);
                    car.put("carRate",rate);

            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
