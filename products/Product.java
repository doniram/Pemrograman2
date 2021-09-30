package products;

public class Product {
    String name;
    double price;
    private double subtotal, discount_amount, tax_amount, grandTotal;
    public Product(String name){
        this.name = name;
    }

    public void setPrice(double price){
        // set price of product
        this.price = price;
    }
    public void getProductListing(int qty, double tax, double discount){
        // contoh:
        //     qty = 4
        //     price = 100.000
        //     tax = 10
        //     discount = 25
        // maka:
        //     subtotal = 4 * 100.000 (400.000)
        //     discount_amount = 25/100 * 400.000 (100.000) = 300 rb
        //     tax_amount = 10/100 * (400.000 - 100.000) (30.000)

        //     grandTotal = subtotal - discount + tax
        subtotal = qty * price;
        discount_amount = discount/100 * subtotal;
        tax_amount = tax/100 * (subtotal - price);
        grandTotal = subtotal - discount_amount + tax_amount;

        
        System.out.println("==========ProductListing========");
        System.out.println("Nama Barang: "+ name);
        System.out.println(String.format("Harga satuan dalam Rupiah: Rp%,.2f", price));
        System.out.println("Jumlah Produk: "+ qty);
        System.out.println(String.format("Subtotal: Rp%,.2f", subtotal));
        System.out.println(String.format("potongan: Rp%,.2f", discount_amount));
        System.out.println(String.format("pajak: Rp%,.2f", tax_amount));
        System.out.println(String.format("grand total: Rp%,.2f", grandTotal));
        System.out.println("==================");
    }
}
