package com.example.lab5;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

public  class CarAdapter extends BaseAdapter {
    ArrayList<Car> cars;
    Activity context;
    public CarAdapter(Activity context) {
        this.context = context;
        cars = new ArrayList<>();

    }

    public void addCar(String nameCar, int resource){
        Car car = new Car();
        car.name = nameCar;
        car.imgResource = resource;
        cars.add(car);
        this.notifyDataSetChanged();
    }

   public int getCount () {
        return cars.size();

    }
    public Object getItem(int i ){
        return cars.get(i);
    }
    public View getView(int i, View view, ViewGroup viewGroup){
        View element;


        //in cursul 4 avem mentionat ca ,creearea de obiecte nu este eficienta (folosim mai multa memorie for the same task)
        // asa ca mai bine bolosim Buffers sau Liste
        // Reciclam datele pe care le avem deja,nu ramanem fara memorie si va merge mult mai repede
        if(view == null){
            LayoutInflater layoutInflater = context.getLayoutInflater();
            element = layoutInflater.inflate(R.layout.list_item, null);
            TagCar car = new TagCar();
            car.name = element.findViewById(R.id.tv_name_element);
            car.image = element.findViewById(R.id.iv_image_element);
            element.setTag(car);
        }else{
            element = view;
        }

        TagCar tag = (TagCar) element.getTag();
        tag.name.setText(cars.get(i).name);
        tag.image.setImageResource(cars.get(i).imgResource);
        return element;
    }

    public long getItemId(int i) {
        return 0;
    }
}
