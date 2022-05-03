package com.crud.democrud.ControllerServiceTest;

import com.crud.democrud.models.UsuarioModel;
import com.crud.democrud.repositories.UsuarioRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class UsuarioRepositoryJunitTest {
    @Autowired
    UsuarioRepository repo;


    @Test
    public void testAddNew(){
        UsuarioModel usuario = new UsuarioModel();
        usuario.setNombre("Pepito Perez");
        usuario.setEmail("pepito.perez@gmail.com");
        usuario.setPrioridad(5);

        UsuarioModel savedUser = repo.save(usuario);

        Assertions.assertThat(savedUser).isNotNull();
        Assertions.assertThat(savedUser.getId()).isGreaterThan(0);
    }
}
