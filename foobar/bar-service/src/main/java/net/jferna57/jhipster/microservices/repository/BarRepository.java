package net.jferna57.jhipster.microservices.repository;

import net.jferna57.jhipster.microservices.domain.Bar;

import org.springframework.data.jpa.repository.*;

import java.util.List;

/**
 * Spring Data JPA repository for the Bar entity.
 */
@SuppressWarnings("unused")
public interface BarRepository extends JpaRepository<Bar,Long> {

}
