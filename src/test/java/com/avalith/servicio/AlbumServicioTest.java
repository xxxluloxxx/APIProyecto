package com.avalith.servicio;

import com.avalith.factories.AlbumsFactory;
import com.avalith.factories.UsuariosFactory;
import com.avalith.modelo.Album;
import com.avalith.modelo.Usuario;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
class AlbumServicioTest {

  @MockBean
  UsuarioServicio albumServicio;

  private List<Usuario> usuarios;

  @BeforeEach
  public void setUp() {
    usuarios = UsuariosFactory.build();
  }

  @Test
  void listar() {
    Mockito.when(albumServicio.listar()).thenReturn(usuarios);
  }
}