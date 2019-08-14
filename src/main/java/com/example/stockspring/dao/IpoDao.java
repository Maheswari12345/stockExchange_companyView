package com.example.stockspring.dao;
import com.example.stockspring.model.*;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IpoDao extends JpaRepository<Ipo_planned , Integer> {

}
