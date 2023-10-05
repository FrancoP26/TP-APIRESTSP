package com.desarrollo.tpApiRest.services;


import com.desarrollo.tpApiRest.entities.Localidad;
import com.desarrollo.tpApiRest.repositories.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService{

    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository) {
        super(baseRepository);
    }
}

