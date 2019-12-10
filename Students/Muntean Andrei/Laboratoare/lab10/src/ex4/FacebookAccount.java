package ex4;

import java.util.ArrayList;
import java.util.List;

public class FacebookAccount {

	String nume;
	int varsta;
	String locatiaCurenta;
	List <FacebookAccount> listaPrieteni = new ArrayList<FacebookAccount>();

	public FacebookAccount() {

	}

	public FacebookAccount(String Nume, int Varsta, String LocatiaCurenta, List<FacebookAccount> ListaPrieteni) {
		this.nume = Nume;
		this.varsta = Varsta;
		this.locatiaCurenta = LocatiaCurenta;
		this.listaPrieteni = ListaPrieteni;
	}

	public  void addFriend(FacebookAccount newFriend) {
		this.listaPrieteni.add(newFriend);
	}

	public  void removeFriend(FacebookAccount friendToRemove) {
		this.listaPrieteni.remove(friendToRemove);
	}

	public String toString() {
		return nume + " " + varsta + " " + locatiaCurenta + " " + listaPrieteni;
	}
	
	public static void printFriends(FacebookAccount personalAccount) {
		for(FacebookAccount a : personalAccount.listaPrieteni) {
			System.out.println(a.getListaPrieteni());
		}
	}

	public void searchFriendsArroundCurrentLocation(FacebookAccount personalAccount, String currentLocation) {
		for(FacebookAccount a : personalAccount.listaPrieteni) {
			if(a.locatiaCurenta.equals(currentLocation))
			{
				System.out.println(a.nume);
			}
		}
	}
	
	public static void main(String[] args) {
		
		List <FacebookAccount> pp = new ArrayList<FacebookAccount>();
		List <FacebookAccount> pf = new ArrayList<FacebookAccount>();
		FacebookAccount a1 = new FacebookAccount("dhfhf Andrei",22, "Cluj",pf);
		FacebookAccount a2 = new FacebookAccount("dhfhf Aefefei",52, "Cluj",pf);
		FacebookAccount a3 = new FacebookAccount("dhfhf ei",102, "Cluj",pf);
		pp.add(a1);
		pp.add(a2);
		pp.add(a3);
		FacebookAccount personal = new FacebookAccount("Muntean Andrei",20, "Cluj",pp);
		printFriends(personal);
		personal.addFriend(a1);
		personal.addFriend(a3);
		personal.addFriend(a3);
		personal.removeFriend(a2);
		printFriends(personal);

	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public String getLocatiaCurenta() {
		return locatiaCurenta;
	}

	public void setLocatiaCurenta(String locatiaCurenta) {
		this.locatiaCurenta = locatiaCurenta;
	}

	public List<FacebookAccount> getListaPrieteni() {
		return listaPrieteni;
	}

	public void setListaPrieteni(List<FacebookAccount> listaPrieteni) {
		this.listaPrieteni = listaPrieteni;
	}

}
