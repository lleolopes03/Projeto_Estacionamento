package com.park.demo_park.Repository;

import com.park.demo_park.entities.Vaga;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VagaRepository  extends JpaRepository<Vaga, Long>{
    Optional<Vaga> findByCodigo(String codigo);

    Optional<Vaga> findFirstByStatus(Vaga.StatusVaga statusVaga);

}
