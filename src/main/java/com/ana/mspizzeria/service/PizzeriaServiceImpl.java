package com.ana.mspizzeria.service;

import com.ana.mspizzeria.dto.request.PizzeriaDtoRequest;
import com.ana.mspizzeria.dto.response.PizzeriaDtoResponse;
import com.ana.mspizzeria.model.Pizzeria;
import com.ana.mspizzeria.repository.PizzeriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PizzeriaServiceImpl implements PizzeriaService {

    @Autowired
    private PizzeriaRepository pizzeriaRepository;


    @Override
    public void guardarPizzeria(PizzeriaDtoRequest pizzeria) {
        Pizzeria pizzeriaModel = new Pizzeria();
        pizzeriaModel.setDireccion(pizzeria.getDireccionDto());
        pizzeriaModel.setSede(pizzeria.getSedeDto());

        pizzeriaRepository.save(pizzeriaModel);

    }

    @Override
    public List<PizzeriaDtoResponse> listarPizzerias() {
        List<PizzeriaDtoResponse> lista = new ArrayList<PizzeriaDtoResponse>(0);
        PizzeriaDtoResponse p = null;

        for(Pizzeria pizzeria :pizzeriaRepository.findAll()){
            p = new PizzeriaDtoResponse();
            p.setIdPizzeriaDto(pizzeria.getIdPizzeria());
            p.setDireccionDto(pizzeria.getDireccion());
            p.setSedeDto(pizzeria.getSede());
            lista.add(p);
        }
        return lista;
    }
}
