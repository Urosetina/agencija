package metode;

import java.util.List;
import model.Zaposleni;

public class Racunovodstvo {

	public static double racunajTroskoveZarade(List<Zaposleni> listaZaposlenih) {
		
		double zbirPlata = 0;
		
		for(Zaposleni z : listaZaposlenih) {
			zbirPlata += z.getPlata();
			
		}
	return zbirPlata;	
	}
	
	public static double racunajBonuse(List<Zaposleni> listaZaposlenih) {
		
		double zbirBonusa = 0;
		// prodji kroz listu zaposlenih
			for(Zaposleni z : listaZaposlenih){
				//pitaj da li zaposleni ima bonus
				if(z.isBonus()) {
					// ako ima dodaj 30% plate
					zbirBonusa += (z.getPlata() * 30/100);
				}
			}
		return zbirBonusa;
	}
	
	public static double racunajPDV (double zarade, double bonusi) {
		double pdv = 0;
		
		pdv = (zarade + bonusi) * 20 / 100;
		
		// ili samo return (zarade + bonusi) * 20 / 100;
		
		return pdv;
		
	}
	
	
	
}
