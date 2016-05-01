package com.example.guilherme.demoappdress.Helper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.guilherme.demoappdress.DAO.ClassificacaoDAO;
import com.example.guilherme.demoappdress.DAO.ClimaDAO;
import com.example.guilherme.demoappdress.DAO.LojaDAO;
import com.example.guilherme.demoappdress.DAO.PecaDAO;

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
    public static ClassificacaoDAO mClassificacaoDAO;
    public static PecaDAO mPecaDAO;
    public static LojaDAO mLojaDAO;

    public Database open() throws SQLException {
        mDbHelper = new DatabaseHelper(mContext);
        SQLiteDatabase mDb = mDbHelper.getWritableDatabase();

        mClimaDAO = new ClimaDAO(mDb);
        mClassificacaoDAO = new ClassificacaoDAO(mDb);
        mPecaDAO = new PecaDAO(mDb);
        mLojaDAO = new LojaDAO(mDb);

        return this;
    }

    public void close() {
        mDbHelper.close();
    }

    public Database(Context context) {
        this.mContext = context;
    }
}
