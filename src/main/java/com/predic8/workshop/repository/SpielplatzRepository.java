package com.predic8.workshop.repository;

import com.predic8.workshop.domain.Spielplatz;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Oliver Weiler (weiler@predic8.de)
 */
public interface SpielplatzRepository extends CrudRepository<Spielplatz, Long> {
}
