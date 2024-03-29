package com.example.docbook.domain.service.impl;

import com.example.docbook.domain.model.Record;
import com.example.docbook.domain.model.Schedule;
import com.example.docbook.domain.repo.*;
import com.example.docbook.domain.service.RecordService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class RecordServiceImpl implements RecordService {
    private final RecordRepository recordRepository;
    public RecordServiceImpl(RecordRepository recordRepository) {
        this.recordRepository = recordRepository;
    }

    @Override
    public List<Record> getAllRecords() {
        return recordRepository.findAll();
    }

    @Override
    public List<Record> getRecordByScheduleId(long id) {
        return recordRepository.getRecordByScheduleId(id);
    }

    @Override
    public Record getRecord(long id) {
        return recordRepository.getReferenceById(id);
    }

    @Override
    public Record saveRecord(Record record) {
        return recordRepository.save(record);
    }

    @Override
    public Record updateRecord(Record record) {
        return recordRepository.save(record);
    }

    @Override
    public void deleteRecord(long id) {
        recordRepository.deleteById(id);
    }
}
