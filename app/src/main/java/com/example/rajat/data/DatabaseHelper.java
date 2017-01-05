package com.example.rajat.data;

import android.content.ContentValues;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.graphics.BitmapFactory;
import android.util.Log;

import java.sql.Blob;


// All Static variables
// Database Version
public class DatabaseHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;

    // Database Name
    private static final String DATABASE_NAME = "Sherlock";

    // Contacts table name
    private static final String TABLE_CONTACTS = "Sherlocked";

    // Contacts Table Columns names
    private static final String KEY_ID = "id";
    private static final String Episode_name = "Name";
    private static final String Episode_Summary = "Summary";
    private static final String Episode_Duration = "Duration";
    private static final String KEY_IMAGE = "image_data";
private static final String Rate="Rate";
    private static final String Web="Web";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    // Creating Tables
    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_CONTACTS_TABLE = "CREATE TABLE " + TABLE_CONTACTS + "("
                + KEY_ID + " INTEGER PRIMARY KEY,"
                + Episode_name + " TEXT,"
                + Episode_Summary + " TEXT,"
                + Episode_Duration + " TEXT,"
                +KEY_IMAGE + " BLOB,"
                + Rate + " TEXT,"
                +Web +" TEXT)";
        db.execSQL(CREATE_CONTACTS_TABLE);
    }

    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_CONTACTS);

        // Create tables again
        onCreate(db);
    }

    // Adding new contact
    void addContact(Contact contact) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();

        values.put(KEY_ID, contact.getID());
        values.put(Episode_name, contact.getName()); // Contact Name
        values.put(Episode_Summary, contact.getes());// Contact Phone
        values.put(Episode_Duration, contact.geted());
values.put(KEY_IMAGE,contact.getb());
values.put(Rate,contact.getr());
        values.put(Web,contact.getweb());
        // Inserting Row
        Log.d("KEY", contact.getID()+"");

        db.insert(TABLE_CONTACTS, null, values);
        db.close(); // Closing database connection
    }

    // Getting single contact
 /* Contact getContact(int id) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(TABLE_CONTACTS, new String[]{KEY_ID,
                        Episode_name, Episode_Summary, Episode_Duration,KEY_IMAGE}, KEY_ID + "1",
                new String[]{String.valueOf(id)}, null, null, null,null);
        if (cursor != null)
            cursor.moveToFirst();
        byte[] blob = cursor.getBlob(cursor.getColumnIndex(KEY_IMAGE));
        Contact contact = new Contact(Integer.parseInt(cursor.getString(0)),
                cursor.getString(1), cursor.getString(2), cursor.getString(3));
        // return contact
        return contact;


    }*//*public void addEntry( String name, byte[] image) throws SQLiteException {
        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues cv = new  ContentValues();
        cv.put(KEY_ID,    name);
        cv.put(KEY_IMAGE,   image);
        database.insert( TABLE_CONTACTS, null, cv );
    }
*/

    // Getting contacts Count
  /* public int getContactsCount() {
        String countQuery = "SELECT  * FROM " + TABLE_CONTACTS;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        cursor.close();

        // return count
        return cursor.getCount();
    }*/
    public Cursor getData(String a) {
        SQLiteDatabase db = this.getReadableDatabase();
        String q = " SELECT * FROM " + TABLE_CONTACTS + " WHERE id = '" + a + "'";
        Cursor c = db.rawQuery(q, null);

        return c;
    }
}
