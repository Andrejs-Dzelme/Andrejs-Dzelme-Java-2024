package Service;

import Model.PostType;
import Model.user.GuestUser;
import Model.user.PrivateUser;

public class MainService {
	
	public static void main(String[] args) {
		
		GuestUser	gU1	= new GuestUser();
		PrivateUser	pU1 = new PrivateUser("Krišjānis", "Kariņš", "OneForAll");
		try {
			pU1.publishPost("Mana jaunākā atziņa", "Jāsāk domāt par to, kā sākt sarunas par to, kā sākt kaut ko darīt.\nPar to, ko nepaspēji uzsākt domāt šodien, var pamēģināt sākt domāt rītdien.\nDari, ko darīdams, pa reizītei padomā... pēc tam...", PostType.publicPost);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(gU1);
		System.out.println(pU1);
		
		System.out.println(pU1.getPublicPosts());
	}

}
