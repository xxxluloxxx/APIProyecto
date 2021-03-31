package com.avalith.servicio;

import com.avalith.factories.AlbumUsuariosFactory;
import com.avalith.modelo.AlbumUsuario;
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
class AlbumUsuarioServicioTest {

  @MockBean
  AlbumUsuarioServicio albumUsuarioServicio;

  private List<AlbumUsuario> albumUsuarios;

  @BeforeEach
  public void setUp() {
    albumUsuarios = AlbumUsuariosFactory.build();
  }

  @Test
  void listar() {
    Mockito.when(albumUsuarioServicio.listar()).thenReturn(albumUsuarios);
  }
}