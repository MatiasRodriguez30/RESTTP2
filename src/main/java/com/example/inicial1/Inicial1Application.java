package com.example.inicial1;

import com.example.inicial1.entities.audit.Domicilio;
import com.example.inicial1.entities.audit.Localidad;
import com.example.inicial1.entities.audit.Persona;
import com.example.inicial1.repositories.LocalidadRepository;
import com.example.inicial1.repositories.PersonaRepository;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cglib.core.Local;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class Inicial1Application {
	private static final Logger logger = LoggerFactory.getLogger(Inicial1Application.class);

	@Autowired
	private PersonaRepository personaRepository;
	public static void main(String[] args) {
		SpringApplication.run(Inicial1Application.class, args);

		//System.out.println("funcionando");
	}




	@Bean
	@Transactional
	CommandLineRunner init(PersonaRepository personaRepository) {
		return args -> {
	// Creo un objeto persona
//Persona per1 = Persona.builder().
//		nombre("Alberto").apellido("Cortez").
//		build();

//Localidad loc1 = Localidad.builder().
//		denominacion("Guaymallen") .
//		build()
//		;


//Domicilio dom1 = Domicilio.builder().
//		calle("Suipacha").
//		numero(239).localidad(loc1)
//		.build();
//dom1.setLocalidad(loc1);


//per1.setDomicilio(dom1);

//			personaRepository.save(per1);

// Creo otra persona
//			Persona per2 = Persona.builder().
//					nombre("Alicia").apellido("Calderon").
//					build();

//			Domicilio dom2 = Domicilio.builder().
//					calle("Lulunta").
//					numero(339).localidad(loc1)
//					.build();
//			Localidad loc2 = Localidad.builder().
//					denominacion("Godoy Cruz") .
//					build()
//					;


//			per2.setDomicilio(dom2);
//

			// Lo grabo a través del repositorio de Spring
//			personaRepository.save(per2);
//			List<Persona> recuperadas = personaRepository.findAll();
//			System.out.println(recuperadas);

//			logger.info("Detalles de la persona: {}", recuperadas);




//			Optional<Persona> recuperada = personaRepository.findById(1L);
//			System.out.println(recuperada);

//			logger.info("Detalles de la persona: {}", recuperada);


//			dom1.setCalle("Rodriguezaaaa");

//			personaRepository.save(per1);




		};

		};




}
