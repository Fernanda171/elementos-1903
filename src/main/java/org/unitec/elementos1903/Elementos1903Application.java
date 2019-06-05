package org.unitec.elementos1903;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Elementos1903Application implements CommandLineRunner{

    @Autowired
    RepoCliente repoCliente;
	public static void main(String[] args) {
		SpringApplication.run(Elementos1903Application.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
      //repoCliente.save(new Cliente(1,"María Fernanda", "fernanda171098@hotmail.com"));
       // repoCliente.save(new Cliente(2,"F", "wdff@hotmail.com"));
       
       //Buscar todos
       for(Cliente c: repoCliente.findAll()){
        System.out.println(c);
    }
       //Buscar por id
        System.out.println(repoCliente.findById(2));
        //Borramos el primero, después lo vuelve a insertar
      //  repoCliente.deleteById(2);
    }

}
