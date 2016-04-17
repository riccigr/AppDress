package com.example.guilherme.demoappdress.Handler;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.example.guilherme.demoappdress.DAO.CreateDbDAO;

/**
 * Created by Guilherme on 16/04/2016.
 */
public class DatabaseHandler extends SQLiteOpenHelper {

    private static final String DB_NAME = "appdress.db";
    private static final int DB_VERSION = 1;
    public DatabaseHandler(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        Log.i("bd", "before create");



        Log.i("bd", "before insert");

        CreateDbDAO dao = new CreateDbDAO(db);

        Log.i("bd", "end");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
