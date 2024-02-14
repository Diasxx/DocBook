package com.example.docbook.domain.repo;

import com.example.docbook.domain.model.Records;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordsRepository extends JpaRepository<Records,Long> {

}
