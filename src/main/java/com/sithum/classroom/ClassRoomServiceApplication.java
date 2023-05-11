package com.sithum.classroom;

import com.sithum.classroom.model.ClassRoom;
import com.sithum.classroom.repository.ClassRoomRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClassRoomServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClassRoomServiceApplication.class, args);
	}


	public CommandLineRunner loadData(ClassRoomRepository classRoomRepository){
		return args -> {
			ClassRoom classRoom = new ClassRoom();
			classRoom.setSkuCode("iPhone_14");
			classRoom.setQuantity(20);

			ClassRoom classRoom1 = new ClassRoom();
			classRoom1.setSkuCode("iPhone_12");
			classRoom1.setQuantity(0);

			classRoomRepository.save(classRoom);
			classRoomRepository.save(classRoom1);
		};
	}
}
