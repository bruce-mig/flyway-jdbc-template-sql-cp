package com.github.bruce_mig.flyway_jdbc_template_sql_cp.movie;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

public class MovieRowMapper implements RowMapper<Movie> {

    @Override
    public Movie mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Movie(
                rs.getInt("id"),
                rs.getString("name"),
                List.of(),
                LocalDate.parse(rs.getString("release_date"))
        );
    }
}
