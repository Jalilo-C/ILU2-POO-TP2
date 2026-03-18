package frontiere;

import controleur.ControlPrendreEtal;

public class BoundaryPrendreEtal {
	private ControlPrendreEtal controlPrendreEtal;

	public BoundaryPrendreEtal(ControlPrendreEtal controlChercherEtal) {
		this.controlPrendreEtal = controlChercherEtal;
	}

	public void prendreEtal(String nomVendeur) {
		
	}

	private void installerVendeur(String nomVendeur) {
		String produit = Clavier.entrerChaine("C'est parfait, il me reste un étal pour vous!\nil me faudrait quelques renseignements :\nQuel produit souhaitez-vous vendre ?");
		int nbProduit = Clavier.entrerEntier("Conbien souhaitez-vous vendre ?");
		controlPrendreEtal.prendreEtal(nomVendeur, produit, nbProduit);
		
	}
}
