package application;

public class PihtasaamiseKontroll {
	public static String getHit(int hiireX, int hiireY, int smX, int smY,
			int kastiSuurus) {
		if ((hiireX >= smX) && (hiireX <= (smX + kastiSuurus))) {
			if ((hiireY >= smY) && (hiireY <= (smY + kastiSuurus))) {
				return "pihtas";
			}
		}
		// et annaks kui palju �le ja kui palju m��da
		return "m��da";
	}

}
