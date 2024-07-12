package com.example.descuentos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.descuentos.entity.Descuento;

public interface DescuentoRepository extends JpaRepository<Descuento, Long> {
    public Descuento findByMarcaName(String name);
}
