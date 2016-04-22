package com.example.guilherme.demoappdress.Helper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.guilherme.demoappdress.DAO.CreateDbDAO;

/**
 * Created by Guilherme on 16/04/2016.
 */
public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DB_NAME = "appdress.db";
    private static final int DB_VERSION = 1;
    private final Context mContext;

    public DatabaseHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
        mContext = context;
    }


    @Override
    public void onCreate(SQLiteDatabase db) {

        CreateDbDAO dao = new CreateDbDAO(db);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
