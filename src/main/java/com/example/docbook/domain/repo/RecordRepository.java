package com.example.docbook.domain.repo;

import com.example.docbook.domain.model.Record;
import com.example.docbook.domain.model.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface RecordRepository extends JpaRepository<Record,Long> {
    List<Record> getRecordByScheduleId(long id);

}
