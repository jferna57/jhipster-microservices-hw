package net.jferna57.jhipster.microservices.repository;

import net.jferna57.jhipster.microservices.domain.Foo;

import org.springframework.data.jpa.repository.*;

import java.util.List;

/**
 * Spring Data JPA repository for the Foo entity.
 */
@SuppressWarnings("unused")
public interface FooRepository extends JpaRepository<Foo,Long> {

}
