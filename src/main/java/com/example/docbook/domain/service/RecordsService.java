package com.example.docbook.domain.service;

import com.example.docbook.domain.model.Record;

import java.util.List;

public interface RecordsService {

    //Record
    List<Record> getAllRecords();
    Record getRecord(long id);
    Record saveRecords(Record record);
    Record updateRecords(Record record);
    void deleteRecords(long id);

}
