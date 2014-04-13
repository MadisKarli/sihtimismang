
public class Harjutus5 {
	static boolean esimeseKymneSeas(Kuupäev k){
		if(k.getMitmespäev()<11){
			return true;
		}
		return false;
	}
	static boolean reede13(Kuupäev k){
		if(k.getMitmespäev()==13){
			if(k.getNädalapäev()=='R'){
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) throws Reede13Erind {
		Kuupäev esmasp7aprill = new Kuupäev(7, "aprill", 'E');
		Kuupäev reede13veebruar = new Kuupäev(13, "veebruar", 'R');
		System.out.println(esmasp7aprill+" on esimese kümne seas "+esimeseKymneSeas(esmasp7aprill));
		System.out.println(reede13veebruar+" on esimese kümne seas "+esimeseKymneSeas(reede13veebruar));
		try{
			if(reede13(esmasp7aprill)){
				throw new Reede13Erind(esmasp7aprill.toString());
			}
			
			if(reede13(reede13veebruar)){
				throw new Reede13Erind(reede13veebruar.toString());
			}
		}
		catch(Reede13Erind e){
			System.out.println(e.getMessage()+"See on reede ja 13");
		}
		
	}
}
