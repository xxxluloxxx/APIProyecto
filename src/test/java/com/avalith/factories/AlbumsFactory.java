package com.avalith.factories;

import com.avalith.modelo.Album;
import java.util.Arrays;
import java.util.List;

public class AlbumsFactory {

    public static List<Album> build() {
        return Arrays.asList(
            Album.builder().id(0).title("0").build(),
            Album.builder().id(1).title("1").build(),
            Album.builder().id(2).title("2").build()
        );
    }

    public static Album buildOne() {
        return Album.builder().id(0).title("0").build();
    }
}
