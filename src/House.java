
public class House {

	public static void main(String[] args) {
		// The Song
		System.out.println("\"The House That Jack Built.\"");
		empty();
		para1();
		para2();
		para3();
		para4();
		para5();
		para6();
		para7();
	}
	public static void empty() {
		System.out.println();
	}
	public static void begin() {
		System.out.print("This is the ");
	}
	public static void  jackHouse() {
		System.out.println("house that Jack built.");
	}
	
//verbs
	
	public static void thatLay() {
		System.out.print("That lay in the ");
	}
	public static void thatMalt() {
		System.out.println("That ate the malt");
	}
	public static void thatRat() {
		System.out.println("That killed the rat,");
	}
	public static void thatCat() {
		System.out.println("That worried the cat,");
	}
	public static void thatDog() {
		System.out.println("That tossed the dog,");
	}
	public static void thatCow() {
		System.out.println("That milked the cow with the crumped horn,");
	}
	
	//subjects
	public static void cat() {
		System.out.println("cat,");
	}
	public static void rat() {
		System.out.println("rat,");
	}
	public static void dog() {
		System.out.println("dog,");
	}
	public static void cow() {
		System.out.println("cow with the crumpled horn,");
	}
	public static void malt() {
		System.out.println("malt");
	}
	public static void maiden() {
		System.out.println("maiden all forlorn");
	}
	
	//para
	
	public static void para1() {
		begin();
		jackHouse();
		empty();
	}
	public static void para2() {
		begin();
		malt();
		thatLay();
		jackHouse();
		empty();
	}
	public static void para3() {
		begin();
		rat();
		thatMalt();
		thatLay();
		jackHouse();
		empty();
	}
	public static void para4() {
		begin();
		cat();
		thatRat();
		thatMalt();
		thatLay();
		jackHouse();
		empty();
	}
	public static void para5() {
		begin();
		dog();
		thatCat();
		thatRat();
		thatMalt();
		thatLay();
		jackHouse();
		empty();
	}
	public static void para6() {
		begin();
		cow();
		thatDog();
		thatCat();
		thatRat();
		thatMalt();
		thatLay();
		jackHouse();
		empty();
	}
	public static void para7() {
		begin();
		maiden();
		thatCow();
		thatDog();
		thatCat();
		thatRat();
		thatMalt();
		thatLay();
		jackHouse();
	}
}
