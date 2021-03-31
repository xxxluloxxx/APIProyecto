package com.avalith.cliente;

import com.avalith.factories.AlbumsFactory;
import com.avalith.modelo.Album;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
class LlamadaServicioRestAlbumTest {

  @MockBean
  LlamadaServicioRestAlbum llamadaServicioRestAlbum;

  private Album album;

  @BeforeEach
  public void setUp() {
    album = AlbumsFactory.buildOne();
  }

  @Test
  void llamadaAlbum() {
    String id="0";
    Mockito.when(llamadaServicioRestAlbum.llamadaAlbum(id)).thenReturn(album);
    Assertions.assertEquals(Integer.parseInt(id),llamadaServicioRestAlbum.llamadaAlbum(id).getId());
  }

}