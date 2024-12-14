package com.github.bruce_mig.flyway_jdbc_template_sql_cp.movie;



import com.github.bruce_mig.flyway_jdbc_template_sql_cp.actor.Actor;

import java.time.LocalDate;
import java.util.List;

public record Movie(Integer id,
                    String name,
                    List<Actor> actors,
                    LocalDate releaseDate) {
}
