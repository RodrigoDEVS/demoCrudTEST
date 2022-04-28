package com.crud.democrud.RolTest;

import com.crud.democrud.models.UsuarioRolModel;
import com.crud.democrud.repositories.UsuarioRolRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class UsuarioRolRepositoryTest {
    @Autowired
    private UsuarioRolRepository repo;

    @Test
    public void testAddNew(){
        UsuarioRolModel rol = new UsuarioRolModel();
        rol.setIdUsuario(2L);
        rol.setRol("Esposa del Maestro");

        UsuarioRolModel savedRol = repo.save(rol);

        Assertions.assertThat(savedRol).isNotNull();
        Assertions.assertThat(savedRol.getIdRol());
    }
}
