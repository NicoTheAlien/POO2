
public class Principal {

	public static void main(String[] args) {
		Media m= new Media("Pepe", "Nico", 3);
		System.out.println("Nombre, autor y duación actual ="+m.getNom()+", "+m.getAutor()+", "+m.getDuradaSegons());
		m.setNom("Raul");
		m.setAutor("Nicolaso");
		m.setDuradaSegons(57);
		System.out.println("Nombre, autor y duación nuevos ="+m.getNom()+", "+m.getAutor()+", "+m.getDuradaSegons());
		m.setNom("Raul");

	}

}
