import java.util.Scanner;


public class Harjutus3 {
	public static void main(String[] args) throws LiigaPikaReaErind{
		Scanner sisend = new Scanner(System.in);
		System.out.println("Skänner töötab");
		while(true){
			String rida = sisend.next();
			try{
			if(rida.length()>10){
				throw new LiigaPikaReaErind("rida liialt pikk");
			}}
			catch(LiigaPikaReaErind e){
				System.out.println("liiga pikk rida, proovi uuesti");
			}
			System.out.print(rida+ ", pikkusega ");
			System.out.println(rida.length());
		}
	}
}
