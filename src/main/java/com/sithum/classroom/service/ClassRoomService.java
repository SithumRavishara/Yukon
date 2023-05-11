package com.sithum.classroom.service;

import com.sithum.classroom.repository.ClassRoomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ClassRoomService {

    private final ClassRoomRepository classRoomRepository;

    @Transactional(readOnly = true)
    public boolean isInStock(String skuCode){
       return classRoomRepository.findBySkuCode().isPresent();
    }
}
