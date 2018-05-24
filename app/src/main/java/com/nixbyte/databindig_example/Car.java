package com.nixbyte.databindig_example;

import android.databinding.Bindable;
import android.databinding.Observable;
import android.databinding.ObservableField;
import android.databinding.PropertyChangeRegistry;
import android.graphics.drawable.Drawable;


public class Car implements Observable {

    private ObservableField<Drawable> carImage;
    private ObservableField<String> carDescription;
    private ObservableField<String> carSpeed;
    private ObservableField<String> carAcceleration;
    private ObservableField<String> carPower;
    private ObservableField<String> carDensityPower;
    private ObservableField<String> carCapacity;
    private ObservableField<String> carWeight;
    private ObservableField<Boolean> carRate;

    private PropertyChangeRegistry pcr;

    public Car() {
        this.carImage = new ObservableField<Drawable>();
        this.carDescription = new ObservableField<String>();
        this.carSpeed = new ObservableField<String>();
        this.carAcceleration = new ObservableField<String>();
        this.carPower = new ObservableField<String>();
        this.carDensityPower = new ObservableField<String>();
        this.carCapacity = new ObservableField<String>();
        this.carWeight = new ObservableField<String>();
        this.carRate = new ObservableField<Boolean>();

        this.pcr = new PropertyChangeRegistry();
    }

    @Override
    public void addOnPropertyChangedCallback(OnPropertyChangedCallback callback) {
        pcr.add(callback);
    }
    @Override
    public void removeOnPropertyChangedCallback(OnPropertyChangedCallback callback) {
        pcr.remove(callback);
    }

    @Bindable
    public ObservableField<Drawable> getCarImage() {
        return carImage;
    }
    public void setCarImage(ObservableField<Drawable> carImage) {
        this.carImage = carImage;
        pcr.notifyChange(this,BR.carImage);
    }

    @Bindable
    public ObservableField<String> getCarDescription() {
        return carDescription;
    }
    public void setCarDescription(ObservableField<String> carDescription) {
        this.carDescription = carDescription;
        pcr.notifyChange(this,BR.carDescription);
    }

    @Bindable
    public ObservableField<String> getCarSpeed() {
        return carSpeed;
    }
    public void setCarSpeed(ObservableField<String> carSpeed) {
        this.carSpeed = carSpeed;
        pcr.notifyChange(this,BR.carSpeed);
    }

    @Bindable
    public ObservableField<String> getCarAcceleration() {
        return carAcceleration;
    }
    public void setCarAcceleration(ObservableField<String> carAcceleration) {
        this.carAcceleration = carAcceleration;
        pcr.notifyChange(this,BR.carAcceleration);
    }

    @Bindable
    public ObservableField<String> getCarPower() {
        return carPower;
    }
    public void setCarPower(ObservableField<String> carPower) {
        this.carPower = carPower;
        pcr.notifyChange(this,BR.carPower);
    }

    @Bindable
    public ObservableField<String> getCarDensityPower() {
        return carDensityPower;
    }
    public void setCarDensityPower(ObservableField<String> carDensityPower) {
        this.carDensityPower = carDensityPower;
        pcr.notifyChange(this,BR.carDensityPower);
    }

    @Bindable
    public ObservableField<String> getCarCapacity() {
        return carCapacity;
    }
    public void setCarCapacity(ObservableField<String> carCapacity) {
        this.carCapacity = carCapacity;
        pcr.notifyChange(this,BR.carCapacity);
    }

    @Bindable
    public ObservableField<String> getCarWeight() {
        return carWeight;
    }
    public void setCarWeight(ObservableField<String> carWeight) {
        this.carWeight = carWeight;
        pcr.notifyChange(this,BR.carWeight);
    }

    @Bindable
    public ObservableField<Boolean> getCarRate() {
        return carRate;
    }
    public void setRated(ObservableField<Boolean> carRate) {
        this.carRate = carRate;
        pcr.notifyChange(this,BR.carRate);
    }
}
