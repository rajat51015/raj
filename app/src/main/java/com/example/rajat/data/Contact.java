package com.example.rajat.data;

public class Contact {

    //private variables
    int _id;
    String _name;

    String _es;
    String _ed;

    // Empty constructor
    public Contact(int i, String string, String cursorString, String s){

    }
    // constructor
    public Contact(int id, String name, String _en,String _es,String _ed){
        this._id = id;
        this._name = name;

        this._es = _en;
        this._ed = _es;
    }

    // constructor
   /* public Contact(String name) {
        this._name = name;
    }*/

    // getting ID
    public int getID(){
        return this._id;
    }

    // setting id
    public void setID(int id){
        this._id = id;
    }

    // getting name
    public String getName(){
        return this._name;
    }

    // setting name
    public void setName(String name){
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
    public String getes()
    {
        return  this._es;
    }
    public void setes(String es)
    {
        this._es=es;

    }
 public String geted(){
 return  this._ed;
 }
public void steed(String ed)
{
    this._ed=ed;

}
}
