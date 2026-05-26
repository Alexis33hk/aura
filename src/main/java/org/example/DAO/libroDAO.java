package org.example.DAO;

import org.example.MODEL.libro;
import org.example.UTIL.conexionBD;

import java.sql.Connection;
import java.sql.PreparedStatement;

public interface libroDAO {

    void insertarlibro(libro libro);

}
