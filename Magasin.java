public class Magasin {
    private int identifiant;
    private String adresse;
    private int capaciteMax;
    private Produit[] produits;
    private int nombreProduits;


    public Magasin(int identifiant, String adresse, int capaciteMax) {
        this.identifiant = identifiant;
        this.adresse = adresse;
        this.capaciteMax = capaciteMax;
        this.produits = new Produit[capaciteMax]; // Utilisation de la capacité maximale
        this.nombreProduits = 0;
    }


    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getCapaciteMax() {
        return capaciteMax;
    }

    public void setCapaciteMax(int capaciteMax) {
        this.capaciteMax = capaciteMax;
    }

    public Produit[] getProduits() {
        return produits;
    }

    public int getNombreProduits() {
        return nombreProduits;
    }


    public void ajouter(Produit p) {
        if (nombreProduits < capaciteMax) {
            produits[nombreProduits] = p;
            nombreProduits++;
            System.out.println("Produit ajouté avec succès !");
        } else {
            System.out.println("Impossible d'ajouter le produit. Capacité maximale atteinte.");
        }
    }


    public void afficherMagasin() {
        System.out.println("Magasin ID: " + identifiant + ", Adresse: " + adresse + ", Capacité: " + capaciteMax);
        System.out.println("Produits dans le magasin :");
        for (int i = 0; i < nombreProduits; i++) {
            Produit p = produits[i];
            System.out.println("- " + p.getLib() + " (Marque: " + p.getMarque() + ", Prix: " + p.getPrice() + ")");
        }
    }
}
