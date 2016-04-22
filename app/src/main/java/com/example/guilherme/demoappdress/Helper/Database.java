package com.example.guilherme.demoappdress.Helper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.guilherme.demoappdress.DAO.ClimaDAO;

import java.sql.SQLException;

/**
 * Created by Guilherme on 21/04/2016.
 */
public class Database {
    private static final String TAG = "appdress";
    private static final String DATABASE_NAME = "appdress.db";
    private DatabaseHelper mDbHelper;
    private static final int DATABASE_VERSION = 1;
    private final Context mContext;
    public static ClimaDAO mClimaDAO;

    public Database open() throws SQLException {
        mDbHelper = new DatabaseHelper(mContext);
        SQLiteDatabase mDb = mDbHelper.getWritableDatabase();

        mClimaDAO = new ClimaDAO(mDb);

        return this;
    }

    public void close() {
        mDbHelper.close();
    }

    public Database(Context context) {
        this.mContext = context;
    }
}
