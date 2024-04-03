package com.unifametro.apirestful.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unifametro.apirestful.entites.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
