package com.example.docbook.domain.service.impl;

import com.example.docbook.domain.model.Record;
import com.example.docbook.domain.repo.*;
import com.example.docbook.domain.service.RecordsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecordsServiceImpl implements RecordsService {
    private final RecordsRepository recordsRepository;
    public RecordsServiceImpl(RecordsRepository recordsRepository) {
        this.recordsRepository=recordsRepository;
    }

    @Override
    public List<Record> getAllRecords() {
        return recordsRepository.findAll();
    }

    @Override
    public Record getRecord(long id) {
        return recordsRepository.getReferenceById(id);
    }

    @Override
    public Record saveRecords(Record record) {
        return recordsRepository.save(record);
    }

    @Override
    public Record updateRecords(Record record) {
        return recordsRepository.save(record);
    }

    @Override
    public void deleteRecords(long id) {
        recordsRepository.deleteById(id);
    }
}
