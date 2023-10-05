package com.desarrollo.tpApiRest.repositories;

import com.desarrollo.tpApiRest.entities.Persona;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long> {
}
