package com.example.docbook.domain.controller;

import com.example.docbook.domain.model.Records;
import com.example.docbook.domain.service.BookingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RecordsController {
    private final BookingService bookingService;
    public RecordsController(BookingService bookingService) {
        this.bookingService = bookingService;
    }


    @PostMapping("/records")
    public Records saveRecords(@RequestBody Records records){
        return bookingService.saveRecords(records);
    }
    @GetMapping("/records")
    public List<Records> getAllRecords(){
        return bookingService.getAllRecords();
    }

}
