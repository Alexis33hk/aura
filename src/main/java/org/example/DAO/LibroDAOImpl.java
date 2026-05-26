package org.example.DAO;

import org.example.MODEL.libro;
import org.example.UTIL.conexionBD;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class LibroDAOImpl implements libroDAO {

    @Override
    public void insertarlibro(libro libro) {

        String sql =
                "INSERT INTO libros(titulo, genero, autor_id) VALUES (?, ?, ?)";

        try {

            Connection con = conexionBD.conectar();

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, libro.getTitulo());
            ps.setString(2, libro.getGenero());
            ps.setInt(3, libro.getAutorId());

            ps.executeUpdate();

            System.out.println("Libro insertado");

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        }
    }
}
