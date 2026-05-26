package org.example.DAO;

import org.example.MODEL.autor;
import org.example.UTIL.conexionBD;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class autorDAOImpl implements autorDAO {

    @Override
    public void insertarautor(autor autor) {

        String sql =
                "INSERT INTO autores(nombre, apellido, nacionalidad) VALUES (?, ?, ?)";

        try {

            Connection con = conexionBD.conectar();

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, autor.getNombre());
            ps.setString(2, autor.getApellido());
            ps.setString(3, autor.getNacionalidad());

            ps.executeUpdate();

            System.out.println("Autor insertado");

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        }
    }
}
