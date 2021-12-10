package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.MovieItem;

import static org.junit.jupiter.api.Assertions.*;

class PosterManagerTest {

    private MovieItem first = new MovieItem(1, "Bladshot", "Action");
    private MovieItem second = new MovieItem(2, "Forward", "Animated film");
    private MovieItem third = new MovieItem(3, "Hotel Belgrade", "Comedy");
    private MovieItem fourth = new MovieItem(4, "Gentlemen", "Action");
    private MovieItem fifth = new MovieItem(5, "The invisible man", "horrors");
    private MovieItem sixth = new MovieItem(6, "Trolls. world tour", "Animated film");
    private MovieItem seventh = new MovieItem(7, "Number one", "Comedy");
    private MovieItem eighth = new MovieItem(8, "Eighth", "Action");
    private MovieItem ninth = new MovieItem(9, "Ninth", "Animated film");
    private MovieItem tenth = new MovieItem(10, "Tenth", "Comedy");

    @Test
    public void get10Movies() {
        PosterManager manager = new PosterManager(10);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);

        MovieItem[] actual = manager.getMovies();
        MovieItem[] expected = new MovieItem[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void get6Movies() {
        PosterManager manager = new PosterManager(6);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);

        MovieItem[] actual = manager.getMovies();
        MovieItem[] expected = new MovieItem[]{tenth, ninth, eighth, seventh, sixth, fifth};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void get0Movies() {
        PosterManager manager = new PosterManager(0);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);

        MovieItem[] actual = manager.getMovies();
        MovieItem[] expected = new MovieItem[]{};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void get1Movies() {
        PosterManager manager = new PosterManager(1);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);

        MovieItem[] actual = manager.getMovies();
        MovieItem[] expected = new MovieItem[]{tenth};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void getMore10Movies() {
        PosterManager manager = new PosterManager(12);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);

        MovieItem[] actual = new MovieItem[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        MovieItem[] expected = new MovieItem[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }


    @Test
    public void getLess0Movies() {
        PosterManager manager = new PosterManager(-2);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);

        MovieItem[] actual = new MovieItem[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        MovieItem[] expected = new MovieItem[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }
}