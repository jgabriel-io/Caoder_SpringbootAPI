package br.com.caoder.caoder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.caoder.caoder.model.Dog;

public interface DogsRepository extends JpaRepository<Dog, Long>{


}
