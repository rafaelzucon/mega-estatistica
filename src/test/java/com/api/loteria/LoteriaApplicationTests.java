package com.api.loteria;

import com.api.loteria.models.LoteriaModel;
import com.api.loteria.repositories.LoteriaRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class LoteriaApplicationTests {

	@Autowired private LoteriaRepository repo;
	@Test
	void testListNro() {
//		List<LoteriaModel> loteria = repo.findNro1();
//		//loteria.forEach(System.out::println);
//
//		for(LoteriaModel item : loteria){
//			System.out.println(item.getNro1()+" , "+item.getNro2());
//		}
	}
}
