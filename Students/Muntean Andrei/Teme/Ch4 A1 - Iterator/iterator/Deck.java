package iterator;
import java.util.*;

public class Deck implements Iterable<Card>{

	
	private final Card[] cards;
	private int vf;

	public Deck()
	{
		cards= new Card[13];
	}
	
	
	public Iterator <Card> iterator()
	{
		return new Iterator<Card>()
		{
			private int i=vf;

			@Override
			public boolean hasNext() {
				if(i>=0)
					return true;
				return false;
			}

			@Override
			public Card next() {
				if(hasNext())
					return cards[i--];
				throw new NoSuchElementException();
			}
		};
	}

	public void print()
	{
		for(Card c: this)
			System.out.println(" " + c);
	}
	
	public static void main(String[] args) {
	
		Deck d= new Deck();
		int n=0;
		for(int i=2;i<=15;i++)
		{
			if(i>10)
			{
				if(i==11)//A
					d.cards[n++]= new Card('A');
				if(i==12)//J
					d.cards[n++]= new Card('J');
				if(i==13)//Q
					d.cards[n++]= new Card('Q');
				if(i==14)//K
					d.cards[n++]= new Card('K');
			}
			else
				d.cards[n++]= new Card(i);
		}
		
		
		d.print();
		
		
		
	}
}


