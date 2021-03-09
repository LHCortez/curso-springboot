package com.luizcortez.cursomc.services;

import com.luizcortez.cursomc.domain.Categoria;
import com.luizcortez.cursomc.domain.Cliente;
import com.luizcortez.cursomc.repositories.ClienteRepository;
import com.luizcortez.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository repo;

    public Cliente find(Integer id) {
        Optional<Cliente> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
    }
}
