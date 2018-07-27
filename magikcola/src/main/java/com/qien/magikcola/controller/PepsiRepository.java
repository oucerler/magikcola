package com.qien.magikcola.controller;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.qien.magikcola.domein.Pepsi;

@Component
public interface PepsiRepository extends CrudRepository<Pepsi, Long> {

}
