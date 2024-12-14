package com.github.bruce_mig.flyway_jdbc_template_sql_cp.movie;

import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mock;

class MovieControllerTest {

    @Mock
    private MovieService movieService;

    private MovieController underTest;

    @BeforeEach
    void setUp() {
        underTest = new MovieController(movieService);
    }
}