package com.cadu.milagre.repository;

import com.cadu.milagre.model.MilagreModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MilagreRepository  extends JpaRepository<MilagreModel, Long> {
}
