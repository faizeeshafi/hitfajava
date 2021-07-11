package Hid.day16;

abstract class Item{
	public abstract int cost();
}
abstract class Cream extends Item{
}
abstract class Ingredients extends Item{
	
}
class Vanila extends Cream{
	Item item;
	public Vanila() {
}
	public Vanila(Item item) {
		this.item=item;
	}
	public int cost() {
		if(item==null) {
			return 10;
		}else {
			return 10+item.cost();
		}
	}
}
class ButterScotch extends Cream{
	Item item;
	public ButterScotch() {
	}
	public ButterScotch(Item item) {
		this.item=item;
	}
		public int cost() {
			if(item==null) {
				return 15;
			
		}
			else {
				return 15+item.cost();
			}
	}
}
class Nuts extends Ingredients{
	Item item;
	public Nuts() {
		
	}
	public Nuts(Item item) {
		this.item=item;
	}
	public int cost() {
		if(item==null){
			return 5;
		}else {
			return 5+item.cost();
		}
	}
}
class DryFruit extends Ingredients{
	Item item;
	public DryFruit() {
	}
	public DryFruit(Item item) {
		this.item=item;
	}
	public int cost() {
		if(item==null) {
			return 10;
		}
		else {
			return 10+item.cost();
		}
	}
}
public class AbstractDemo {
	public static void main(String[] args) {
		Item iceCream=new Vanila(new Nuts(new ButterScotch(new DryFruit(new Vanila()))));
		System.out.println("One Vanila cup..+Nuts.+ButterScotch:"+iceCream.cost());
	}

}
