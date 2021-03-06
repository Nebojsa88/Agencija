package com.aad.agencijazanekretnine.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Movie;

import com.aad.agencijazanekretnine.db.model.Nekretnina;
import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.sql.SQLException;

public class ORMLightHelper extends OrmLiteSqliteOpenHelper {

    private static final String DATABASE_NAME    = "agencija.db";
    private static final int    DATABASE_VERSION = 1;

    private Dao<Nekretnina, Integer> mNekretninaDao = null;


    public ORMLightHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase database, ConnectionSource connectionSource) {
        try {
            TableUtils.createTable(connectionSource, Nekretnina.class);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase database, ConnectionSource connectionSource, int oldVersion, int newVersion) {
        try {
            TableUtils.dropTable(connectionSource, Nekretnina.class, true);

            onCreate(database, connectionSource);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Dao<Nekretnina, Integer> getNekretninaDao() throws SQLException {
        if (mNekretninaDao == null) {
            mNekretninaDao = getDao(Movie.class);
        }

        return mNekretninaDao;
    }



    //obavezno prilikom zatvarnaj rada sa bazom osloboditi resurse
    @Override
    public void close() {
        mNekretninaDao = null;

        super.close();
    }
}
