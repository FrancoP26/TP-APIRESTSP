package com.desarrollo.tpApiRest.controllers;


import com.desarrollo.tpApiRest.entities.Persona;
import com.desarrollo.tpApiRest.services.PersonaServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/personas")
public class PersonaController extends BaseControllerImpl<Persona,PersonaServiceImpl>{
}