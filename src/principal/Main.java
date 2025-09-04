package principal;

import entities.MemoryRepository;
import entities.Numeros;
import entities.User;
import interfaces.Repository;

public class Main {
	
	public static void main(String[] args) {
		Repository<User> repo = new MemoryRepository<>();
		Repository<Numeros> repoNum = new MemoryRepository<>();

        repo.save(new User("Calebe"));
        repo.save(new User("Livia"));
        repo.save(new User("Julia"));
        
        repoNum.save(new Numeros(37));
        repoNum.save(new Numeros(40));
        repoNum.save(new Numeros(16));
        
        for (User u : repo.findAll()) {
            System.out.println(u);
        }
        
		for (Numeros n : repoNum.findAll()) {
			System.out.println(n.getNumero());
		}
        
        
    }}