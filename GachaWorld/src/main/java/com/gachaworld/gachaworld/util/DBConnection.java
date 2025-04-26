package com.gachaworld.gachaworld.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.net.URL;
import java.io.File;

public class DBConnection {
    private static final String URL;

    static {
        // Load từ resources
        URL dbUrl = DBConnection.class.getClassLoader().getResource("database/gachaworld.db");
        if (dbUrl == null) {
            throw new RuntimeException("Database not found in resources!");
        }
        URL = "jdbc:sqlite:" + new File(dbUrl.getFile()).getAbsolutePath();
    }

    public static Connection getConnection() {
        try {
            Connection conn = DriverManager.getConnection(URL);
            conn.createStatement().execute("PRAGMA foreign_keys=ON;");
            return conn;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
