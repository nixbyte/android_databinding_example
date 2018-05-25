package com.nixbyte.databindig_example;

import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayMap;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.nixbyte.databindig_example.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ObservableArrayMap<String, Object> car;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.action_bar);
        toolbar.setNavigationIcon(R.mipmap.ic_launcher);
        setSupportActionBar(toolbar);

        car = new ObservableArrayMap<>();

        binding.setCar(car);

        loadCar();

        RunInNewThread carChanger = new RunInNewThread(getApplicationContext(),car);

        new Thread(carChanger).start();
    }

    private void loadCar() {
        car.put("carDescription",getString(R.string.car_description));
        car.put("carImage",getDrawable(R.drawable.image));
        car.put("carSpeed",getString(R.string.car_speed));
        car.put("carAcceleration",getString(R.string.car_acceleration));
        car.put("carPower",getString(R.string.car_power));
        car.put("carDensityPower",getString(R.string.car_density_power));
        car.put("carCapacity",getString(R.string.car_capacity));
        car.put("carWeight",getString(R.string.car_weight));
    }
}
