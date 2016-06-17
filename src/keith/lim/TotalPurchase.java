package keith.lim;


//Try to make a total PO receipt.
public class TotalPurchase {
    Item[] basket = new Item[] {new Item(1, "Chihuahua", "Dog", 5000, 5, "Crates")
        , new Item(2, "Shark", "Fish", 10000, 3, "Aquariums")
            , new Item(3, "Gerbil", "Expensive Rodent", 50000, 10, "Packs")};

    for(int z=0; z<basket.length ; z++){
        int totprice[n] = Item[n].getQty * Item[n].getPrice;
        System.out.println(totprice[n]);
    }
}
