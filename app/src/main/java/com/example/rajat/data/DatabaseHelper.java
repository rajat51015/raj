package com.example.rajat.data;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Environment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.nio.channels.FileChannel;

public class DatabaseHelper extends SQLiteOpenHelper{

    //The Android's default system path of your application database.
    private static String DB_PATH = "/data/data/"+MainActivity.p+"/databases/";

    private static String DB_NAME = "Sherlocked.db";

    private SQLiteDatabase myDataBase;

  //  private final Context myContext;

    /**
     * Constructor
     * Takes and keeps a reference of the passed context in order to access to the application assets and resources.
     * @param context
     */
    public DatabaseHelper(Context context) {

        super(context, DB_NAME, null, 1);
       // this.myContext = context;
        myDataBase=this.getWritableDatabase();
    }



    @Override
    public void onCreate(SQLiteDatabase db) {

db.execSQL("create table"+DB_NAME+"(Id Integer Primary key Autoincrement,epsidesumm Text,epdur Integer,Eprev Text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
myDataBase.execSQL("drop table if exists "+DB_NAME);
        onCreate(myDataBase);
    }}
/*public Cursor getData(String Id)
{
myDataBase=this.getReadableDatabase();
    String q="select from"+DB_NAME+"where Field 1='"+Id+"'";


            Cursor c=myDataBase.rawQuery(q,null);
    return c;


}
}*/