package com.fiap.lojabrinquedos.repository;

import com.fiap.lojabrinquedos.model.Brinquedo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrinquedoRepository extends JpaRepository<Brinquedo, Long> {
}
