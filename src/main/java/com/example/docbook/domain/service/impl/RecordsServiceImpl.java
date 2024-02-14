package com.example.docbook.domain.service.impl;

import com.example.docbook.domain.model.*;
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
    public List<Records> getAllRecords() {
        return recordsRepository.findAll();
    }

    @Override
    public Records getRecord(long id) {
        return recordsRepository.getReferenceById(id);
    }

    @Override
    public Records saveRecords(Records records) {
        return recordsRepository.save(records);
    }

    @Override
    public Records updateRecords(Records records) {
        return recordsRepository.save(records);
    }

    @Override
    public void deleteRecords(long id) {
        recordsRepository.deleteById(id);
    }
}
