/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classicmodels7b.dao;

import com.classicmodels7b.model.OfficesModel;
import java.util.ArrayList;

/**
 *
 * @author Davila Gil
 */
public interface OfficesDao {
    //recibe un objeto de tipo officesmodel y 
    //crea una nueva oficina en la base de datos
    public String createOffice(OfficesModel newOffice);
    
    //devuelve un listado de las oficinas
    //almacenadas en la tabla de Offices
    public ArrayList<OfficesModel> readOffices();
    
    //Recibe un objeto de tipo OfficeModel y
    //actualiza una oficina
    public String updateOffice(OfficesModel auxOffice);
    
    //Borra una oficina de la tabls  Offices
    //de acuerdo al ID recibido
    public String deleteOffice(String officeCode);
}

