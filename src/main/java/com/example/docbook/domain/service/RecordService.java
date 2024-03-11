package com.example.docbook.domain.service;

import com.example.docbook.domain.model.Record;
import com.example.docbook.domain.model.Schedule;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface RecordService {

    //Record
    List<Record> getAllRecords();
    List<Record> getRecordByScheduleId(long id);
    Record getRecord(long id);
    Record saveRecord(Record record);
    Record updateRecord(Record record);
    void deleteRecord(long id);

}
