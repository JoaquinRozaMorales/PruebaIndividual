package com.example.prueba.services;

import com.example.prueba.entity.Base;

import java.io.Serializable;
import java.util.List;

public interface BaseService <E extends Base, ID extends Serializable>{
    //lista de las entidades que esten en base de datos
    public List<E> findAll() throws Exception;
    //Trae una persona segun su id
    public E findById(ID id) throws Exception;
    //Crea una nueva entidad
    public E save(E entity) throws Exception;
    //Actualiza
    public E update(ID id, E entity) throws Exception;
    //Borra un registro
    public boolean delete(ID id) throws Exception;
}
