package com.example.docbook.domain.service;

import com.example.docbook.domain.model.*;

import java.util.List;

public interface RecordsService {

    //Records
    List<Records> getAllRecords();
    Records getRecord(long id);
    Records saveRecords(Records records);
    Records updateRecords(Records records);
    void deleteRecords(long id);

}
