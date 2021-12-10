package ru.netology.manager;

import ru.netology.domain.MovieItem;

public class PosterManager {
    private int count = 10;
    private MovieItem[] movies = new MovieItem[count];

    public PosterManager(int count) {
        this.count = count;
    }

    public void add(MovieItem movie) {
        int length = movies.length + 1;
        MovieItem[] tmp = new MovieItem[length];

        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }

        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movies = tmp;
    }

    public MovieItem[] getMovies() {
        MovieItem[] result = new MovieItem[count];
        int counter = 0;
        for (int i = 0; i < count; i++) {
            int index = movies.length - i - 1;
            result[counter] = movies[index];
            counter++;
        }
        MovieItem[] finalResult = new MovieItem[counter];

        System.arraycopy(result, 0, finalResult, 0, counter);
        return finalResult;
    }

}

