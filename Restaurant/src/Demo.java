import com.restaurant.items.HotDrinks;
import com.restaurant.items.Item;
import com.restaurant.items.Juices;
import com.restaurant.items.container.Container;
import com.restaurant.items.nonvegitems.NonVegSandwich;
import com.restaurant.items.vegitems.VegSandwich;
import com.restaurant.menu.Menu;

public class Demo {
	public static void main(String[] args) {

		Item lqb = new NonVegSandwich("lqb s lutenica", 5, 5);
		Item snavish = new VegSandwich("Sandvich s krastavica", 8, 5);

		Menu list = new Menu();
		list.addItem(snavish);
		list.addItem(lqb);
		list.displayItems();
	}
}
