package com.crud.democrud.RolTest;

import com.crud.democrud.models.UsuarioRolModel;
import com.crud.democrud.repositories.UsuarioRolRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.Optional;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
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

    @Test
    public void testListAll(){
        Iterable<UsuarioRolModel> rol = repo.findAll();
        Assertions.assertThat(rol).hasSizeGreaterThan(0);

        for (UsuarioRolModel roles : rol){
            System.out.println(roles);
        }
    }

    @Test
    public void testDelete(){
        Long idRol = 7L;
        repo.deleteById(idRol);

        Optional<UsuarioRolModel> optionalRol = repo.findById(idRol);
        Assertions.assertThat(optionalRol).isNotPresent();
    }
}
