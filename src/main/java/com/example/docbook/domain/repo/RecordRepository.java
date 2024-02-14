package com.example.docbook.domain.repo;

import com.example.docbook.domain.model.Record;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordRepository extends JpaRepository<Record,Long> {

}
