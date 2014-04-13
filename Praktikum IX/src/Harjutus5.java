
public class Harjutus5 {
	static boolean esimeseKymneSeas(Kuup�ev k){
		if(k.getMitmesp�ev()<11){
			return true;
		}
		return false;
	}
	static boolean reede13(Kuup�ev k){
		if(k.getMitmesp�ev()==13){
			if(k.getN�dalap�ev()=='R'){
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) throws Reede13Erind {
		Kuup�ev esmasp7aprill = new Kuup�ev(7, "aprill", 'E');
		Kuup�ev reede13veebruar = new Kuup�ev(13, "veebruar", 'R');
		System.out.println(esmasp7aprill+" on esimese k�mne seas "+esimeseKymneSeas(esmasp7aprill));
		System.out.println(reede13veebruar+" on esimese k�mne seas "+esimeseKymneSeas(reede13veebruar));
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
