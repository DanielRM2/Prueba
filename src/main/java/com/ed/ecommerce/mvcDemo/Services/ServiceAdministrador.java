package com.ed.ecommerce.mvcDemo.Services;

import com.ed.ecommerce.mvcDemo.Model.Administrador;
import com.ed.ecommerce.mvcDemo.Repository.IAdministrador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceAdministrador {

    @Autowired
    private IAdministrador repo;

    public List<Administrador> listar() {
        return repo.obtenerTodos();
    }
}
