import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        productservice ser=new productservice();
        ser.addproduct(new product("Type C", "Cable", "Black Drawer", 2024));
        ser.addproduct(new product("Mac Studio", "Computer", "White Table", 2025));
        ser.addproduct(new product("Focusrite Mixer", "Audio System", "White Table", 2025));
        ser.addproduct(new product("Asus Vivobook", "Laptop", "Brown Drawer", 2021));
        ser.addproduct(new product("Asus Rog", "Laptop", "Black Table", 2021));
        ser.addproduct(new product("Macbook pro", "Laptop", "Brown Drawer", 2022));
        ser.addproduct(new product("Wacom Pad", "Writing Pad", "Black Drawer", 2020));
        ser.addproduct(new product("Apple Keyboard", "Keyboard", "White Table", 2022));
        ser.addproduct(new product("Logitech Keyboard", "Keyboard", "Black Table", 2024));
        ser.addproduct(new product("Hdmi cable", "Cable", "Black Drawer", 2024));
        ser.addproduct(new product("Java Black Book", "Cable", "Shelf", 2024));
        ser.addproduct(new product("Logi Mouse", "Mouse", "Black Table", 2022));
        ser.addproduct(new product("Apple Mouse", "Mouse", "White Table", 2022));
        ser.addproduct(new product("Lenovo Mouse", "Mouse", "Black Drawer", 2022));
        ser.addproduct(new product("BlackBeast", "Computer", "White Table", 2020));


        ser.deleteproduct("Lenovo Mouse");
        System.out.println(ser.getsingle("Type C"));
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        List<product> ps=ser.getProducts();
        for(product x:ps){
            System.out.println(x);
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        List<product> lap=ser.getspecific("Laptop");
        for (product x:lap
             ) {
            System.out.println(x);
        }

        //get expired
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        List<product> exp=ser.expired(2023);
        for (product x:exp
             ) {
            System.out.println(x);
        }


    }
}