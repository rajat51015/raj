package com.example.rajat.data;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.ByteArrayOutputStream;

public class Contact {

    //private variables
    private int _id;
    private String _name;
    private String _es;
    private String _ed;
    Bitmap _d;

    // constructor
    public Contact(int id, String name, String _en, String _es,Bitmap d) {
        this._id = id;
        this._name = name;

        this._es = _en;
        this._ed = _es;
this._d=d;
    }

    // constructor
   /* public Contact(String name) {
        this._name = name;
    }*/

    // getting ID
    public int getID() {
        return this._id;
    }

    // setting id
    public void setID(int id) {
        this._id = id;
    }

    // getting name
    public String getName() {
        return this._name;
    }

    // setting name
    public void setName(String name) {
        this._name = name;
    }

    // getting phone number
 /*   public String getPhoneNumber(){
        return this._en;
    }*/

    // setting phone number
  /*  public void setPhoneNumber(String en){
        this. _en = en;
    }*/
    public String getes() {
        return this._es;
    }

    public void setes(String es) {
        this._es = es;

    }

    public String geted() {
        return this._ed;
    }

    public void steed(String ed) {
        this._ed = ed;

    }
    public void setb(Bitmap b)
    {
        this._d=b;
    }
        public byte[] getb(){

            ByteArrayOutputStream stream = new ByteArrayOutputStream();
            this._d.compress(Bitmap.CompressFormat.PNG, 0, stream);
            return stream.toByteArray();


            }





    // convert from byte array to bitmap
    public static Bitmap getImage(byte[] image) {
        return BitmapFactory.decodeByteArray(image, 0, image.length);
    }
}