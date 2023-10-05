package com.desarrollo.tpApiRest.services;

import com.desarrollo.tpApiRest.entities.Autor;
import com.desarrollo.tpApiRest.repositories.AutorRepository;
import com.desarrollo.tpApiRest.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor,Long> implements AutorService {

    @Autowired
    private AutorRepository autorRepository;

    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository) {
        super(baseRepository);
    }
}
