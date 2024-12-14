package com.github.bruce_mig.flyway_jdbc_template_sql_cp.movie;

import java.util.List;
import java.util.Optional;

public interface MovieDao {
    List<Movie> selectMovies();
    int insertMovie(Movie movie);
    int deleteMovie(int id);
    Optional<Movie> selectMovieById(int id);
    // TODO: Update
}
