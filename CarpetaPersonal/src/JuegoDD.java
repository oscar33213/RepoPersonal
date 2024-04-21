import java.util.Scanner;
public class JuegoDD {

	public static void main(String[] args) {
		int vida_personaje = 100;
		double ataque_personaje = 1;
		
		
		Scanner decision_personaje = new Scanner (System.in);
		
		int vida_enemigo_1 = 20;
		int vida_enemigo_2 = 35;
		int vida_enemigo_3 = 60;
		int vida_enemigo_4 = 80;
		int vida_enemigo_5 = 100;
		boolean continuar = true;
		double dinero = 0;
		
		
		System.out.println("Despiertas en una oscura cueva, no sabes muy bien donde estas, frente a ti se encuentra un caldero burbujeante ¿Te acercas? (INDICA 1: SI // INDICA 2: NO");
		
		while (continuar) {
			System.out.println("Elige una opción");
			System.out.println("1. SI");
			System.out.println("2. NO");
			
			
		
		
		int opcion1 = decision_personaje.nextInt();
		
		switch (opcion1) {
		case 1:
			System.out.println("Te acercas al caldero");
			continuar = false;
			break;
		case 2:
				System.out.println("Te quedas quieto");
				
				break;
				
		default:
			System.out.println("Opcion no correcta");
			break;
			
		}
		}
		
		
		System.out.println("El caldero empieza a burbujear y aparecen unas letras que rezan: ¿Cual es tu nombre?");
		
		String nombre_personaje = decision_personaje.next();
		
		System.out.println("Hola " + nombre_personaje + " mi nombre es Azahel, no te asustes es solo un caldero lo que estas viendo");
		System.out.println("Al parecer te has caido dentro de esta inmensa cueva ¿asustado? Jjaja ya meparecia a mi, pero tranquilo " + nombre_personaje + " te ayudare" );
		System.out.println("Al lado del caldero hay una pequeña arma, una espada si no recuerdo mal, esta un poco oxidada pero es mejor eso que nada");
		
		 continuar = true;
		
		while (continuar) {
			System.out.println("¿Coges la espada?");
			System.out.println("1. SI");
			System.out.println("2. NO");
			
			
			int opcion2 = decision_personaje.nextInt();
			
			switch (opcion2) {
			case 1:
				System.out.println("Coges la espada");
				ataque_personaje+= 2;
				System.out.println("Tu ataque a aaumentado a " + ataque_personaje);
				continuar = false;
				break;
			case 2:
				System.out.println("No coges la espada");
				continuar = false;
				break;
			case 3:
				System.out.println("Opcion no valida");
				
			}
			
			

	}
		
		System.out.println("Bien, es tu decisión, te explicare como salir de aqui");
		System.out.println("Delante tuya tienes 3 puertas, nadie sabe lo que hay delante de ellas, solo tienes que abrirlas y a la aventura");
		System.out.println("Puede que hayan miles y miles de tesoros o un montruo terrorifico dispuesto a matarte, auqnue estos monstruos suelen cusodiar tesoros "
				+ "¿quien sabe?");
		System.out.println("Bueno ¿cual eliges? Tranquilo, yo te acompaño");
		
		continuar = true;
		
		while(continuar) {
			System.out.println("1. PUERTA 1");
			System.out.println("2. PUERTA 2");
			System.out.println("3. PUERTA 3");
			
			
			
			int opcion3 = decision_personaje.nextInt();
			
			
			switch(opcion3) {
			case 1:
				System.out.println("Caes a un agujero");
				vida_personaje -= 100;
				System.out.println("Has muerto");
				decision_personaje.close();
				System.exit(0);
				continuar = false;
				break;
				
			case 2:
				System.out.println("¡UNA RATA! Encuentras una rata que te mira fijamente");
				
				while(continuar) {
					System.out.println("1. Atacas a la rata");
					System.out.println("2. Aguantas");
					
					int opcionrata = decision_personaje.nextInt();
					
					switch (opcionrata) {
					
					case 1:
						System.out.println("Atacas a la rata");
						
						 vida_enemigo_1 = (int) (vida_enemigo_1 - ataque_personaje);
						 
						 
						 System.out.println("La rata tiene " + vida_enemigo_1 + " PS");
						 
						 System.out.println("La rata te ataca");
						 vida_personaje -= 10;
						 System.out.println("Tienes " + vida_personaje + " PS");
						 
						 break;
					case 2:
						
						System.out.println("Te quedas quieto");
						System.out.println("La rata te ataca");
						
						vida_personaje -= 10;
						
						System.out.println("Has perdido 1 punto de vida");
						System.out.println("Tienes " + vida_personaje + " PS");
						break;
						
					default:
						System.out.println("Opcion no valida");
						break; 
						 
						
						
							
						
						
								
							 }
					
					if (vida_enemigo_1 <= 0) {
						System.out.println("Has matado a la rata");
						System.out.println("La rata a dejado caer 3 monedas");
						System.out.println("Tienes " + dinero + " monedas");
						dinero += 3;
						vida_personaje += 15;
						System.out.println("Recuperas 15 PS");
						System.out.println("Tienes " + vida_personaje + " PS");
						continuar = false;
						break;
					} else {
						System.out.println("La rata sigue viva");
					}
					
					if (vida_personaje <= 0) {
						System.out.println("Has muerto");
						decision_personaje.close();
						System.exit(0);
						
					} else {
						
					}
					
					
						 }
				
			case 3:
				System.out.println("Encuentars un tesoro, parece que esta todo despejado");
				System.out.println("Obtienes un arma");
				ataque_personaje += 2;
				System.out.println("Tienes " + ataque_personaje + " PA");
				continuar = false;
				break;
			
					}
			
			
		
					
				}
		
		System.out.println("Avanzas por la cueva");
		System.out.println("Hola de nuevo viejo amigo, sabes, puedo venderte lo que quieras");
		System.out.println("La primera decision corre a cuenta de la casa");
		
		continuar = true;
		
		while (continuar) {
			System.out.println("1. Un martillo / + 10 PA");
			System.out.println("2. Una coraza / + 3 PS");
			System.out.println ("3. Nada");
			
			
		int opciontienda = decision_personaje.nextInt();
		
		
		switch(opciontienda) {
		
		case 1: 
			System.out.println("Sabia eleccion");
			System.out.println("Has obtenido un martillo");
			ataque_personaje += 10;
			System.out.println("Tienes " + ataque_personaje + " PA");
			continuar = false;
			break;
		case 2:
			System.out.println("Sabia eleccion");
			System.out.println("Has obtenido una coraza");
			vida_personaje += 3;
			System.out.println("Tienes " + vida_personaje + " PS");
			continuar = false;
			break;
			
		case 3:
			System.out.println("Veo que te gustan los retos");
			continuar = false;
			break;
		}
		}
		
		System.out.println("Esta vez a sido gratis, mas adelante empezare a cobrarte. EL CAPITALISMO, AMIGO");
		System.out.println("Avanzas por la cueva");
		System.out.println("Frente a ti el camino se divide en 2 ¿por donde vas?");
		
		continuar = true;
		
		while (continuar) {
			System.out.println("1. DERECHA");
			System.out.println("2. IZQUIERDA");
			
			
			int opcion4 = decision_personaje.nextInt();
			
			switch(opcion4) {
			
			case 1: 
				System.out.println ("Una bandada de murcielagos te corta el paso");
				while (continuar) {
					System.out.println("¿Atacas?");
					System.out.println("1. SI");
					System.out.println("2. NO");
					
					int opcionmurcielago = decision_personaje.nextInt();
					
					switch (opcionmurcielago) {
					case 1: 
						System.out.println("Atacas");
						
						vida_enemigo_2 = (int) (vida_enemigo_2 - ataque_personaje);
						System.out.println("El murcielago tiene " + vida_enemigo_2 + " PS");
						System.out.println("El murcielago te ataca");
						vida_personaje -= 15;
						System.out.println("Tienes " + vida_personaje + " PS");
						break;
						
					case 2: 
						System.out.println("No atacas");
						System.out.println("El murcielago te ataca");
						vida_personaje -= 15;
						System.out.println("Tienes " + vida_personaje + " PS");
						break;
						
					default:
						System.out.println("Opcion no valida");
						break;
					}
					
					if (vida_enemigo_2 <= 0) {
						System.out.println("Has matado al murcielago");
						System.out.println("Los demas murcielagos has huido dejando caer dinero");
						dinero += 3;
						System.out.println("Objtienes 3 monedas");
						System.out.println("Un murcielago ha dejado caer una pequeña daga, la coges");
						ataque_personaje += 0.5;
						System.out.println("Tienes " + ataque_personaje + " PA");
						continuar = false;
					} else {
						System.out.println("El murcielago sigue vivo");
					}
					
					if (vida_personaje <= 0) {
						System.out.println("Has muerto");
						decision_personaje.close();
						System.exit(0);
						
					} else {
						
					}
					
					
					
					
				}
			}
		}
		
	
				
			}
			
		
		
		

}
	

