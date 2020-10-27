package com.victorze.tacos.data;

import org.springframework.data.repository.CrudRepository;

import com.victorze.tacos.Taco;

public interface TacoRepository extends CrudRepository<Taco, Long> {
}