package Practical;

public class Item {
   public int ItemId;
   public String Name;
   public String  Producer;
   public double Price;

    public  Item(int itemId,String name,String producer,double price){
            this.ItemId = itemId;
            this.Name = name;
            this.Producer = producer;
            this.Price = price;
    }
    public String toString(){
        String total;
        total = ItemId + " "+Name + " "+ Producer+ " "+Price;
        return total;
    }
}




