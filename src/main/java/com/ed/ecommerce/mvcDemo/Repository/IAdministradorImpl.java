package com.ed.ecommerce.mvcDemo.Repository;

import com.ed.ecommerce.mvcDemo.Model.Administrador;
import com.ed.ecommerce.mvcDemo.Pattern.conexionBD;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class IAdministradorImpl implements IAdministrador {

    @Override
    public List<Administrador> obtenerTodos() {
        List<Administrador> lista = new ArrayList<>();
        String sql = "SELECT * FROM Administrador";

        try (Connection con = conexionBD.getConexion();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Administrador admin = new Administrador();
                admin.setIdAdmin(rs.getInt("idAdmin"));
                admin.setNombre(rs.getString("nombre"));
                admin.setApellido(rs.getString("apellido"));
                admin.setCorreo(rs.getString("correo"));
                admin.setContrasena(rs.getString("contrasena"));
                lista.add(admin);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }
}
