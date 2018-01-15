package com.crud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.crud.model.Developer;

public interface DeveloperRepository extends JpaRepository<Developer,Integer> {
    @Query(value = "SELECT * FROM developersdetails t WHERE t.pid = (:pid)",
            nativeQuery=true
    )
    public List<Developer> findByPid(@Param("pid") Integer pid);
}
