package atelier05;

public class Carafe {
	private int contenu_;   // Contenu actuel de la carafe (en litres)
	private int capacite_;  // Capacité totale de la carafe (en litres)

	/** 
     * Constructeur pour créer une carafe vide avec une capacité donnée.
     * @param capacite La capacité de la carafe (en litres)
     */
	public Carafe(int capacite) {
		this.capacite_ = capacite;
		this.contenu_ = 0; // La carafe est initialisée vide (contenu à 0)
	}

	// Remplir la carafe à sa capacité maximale
	public void remplir() {
		this.contenu_ = this.capacite_;
	}

	// Vider complètement la carafe
	public void vider() {
		this.contenu_ = 0;
	}

	/**
     * Retourne le contenu actuel de la carafe.
     * @return Le contenu de la carafe en litres
     */
	public int contenu() {
		return this.contenu_;
	}

	/**
     * Retourne la capacité de la carafe.
     * @return La capacité de la carafe en litres
     */
	public int capacite() {
		return this.capacite_;
	}

	/**
     * Transvase l'eau d'une carafe dans une autre.
     * Cette méthode transfère une quantité d'eau de la carafe courante 
     * vers une autre carafe, en fonction de la capacité restante de cette dernière.
     * @param autreCarafe La carafe dans laquelle on va verser l'eau
     */
	public void Transvaser(Carafe c) {
		
			int reste = this.capacite_ - this.contenu_;
			if (c.Contenu() < reste) { // on va pouvoir vider la carafe c
					this.Contenu(Contenu() + c.Contenu());
					c.Vider();
			}
			else {
					c.Contenu(c.Contenu() - reste);
					this.Remplir();
	}
}
}
