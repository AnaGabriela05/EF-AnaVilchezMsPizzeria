package com.ana.mspizzeria.service;

import com.ana.mspizzeria.dto.request.PizzeriaDtoRequest;
import com.ana.mspizzeria.dto.response.PizzeriaDtoResponse;

import java.util.List;

public interface PizzeriaService {

    public void guardarPizzeria(PizzeriaDtoRequest pizzeria);
    public List<PizzeriaDtoResponse> listarPizzerias();
}
