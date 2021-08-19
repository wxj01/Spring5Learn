package com.wxj.lesson001.demo5;

/**
 * @author wxj
 * @version 1.0
 * @description: TODO
 * @date 2021/8/19 0019 17:25
 */
public class PersonModel {
    private UserModel userModel;
    private CarModel carModel;

    public PersonModel() {
    }

    public PersonModel(UserModel userModel, CarModel carModel) {
        this.userModel = userModel;
        this.carModel = carModel;
    }

    public UserModel getUserModel() {
        return userModel;
    }

    public void setUserModel(UserModel userModel) {
        this.userModel = userModel;
    }

    public CarModel getCarModel() {
        return carModel;
    }

    public void setCarModel(CarModel carModel) {
        this.carModel = carModel;
    }

    @Override
    public String toString() {
        return "PersonModel{" +
                "userModel=" + userModel +
                ", carModel=" + carModel +
                '}';
    }
}