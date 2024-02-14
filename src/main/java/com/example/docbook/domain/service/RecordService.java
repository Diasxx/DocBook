package com.example.docbook.domain.service;

import com.example.docbook.domain.model.Record;

import java.util.List;

public interface RecordService {

    //Record
    List<Record> getAllRecords();
    Record getRecord(long id);
    Record saveRecord(Record record);
    Record updateRecord(Record record);
    void deleteRecord(long id);

}
