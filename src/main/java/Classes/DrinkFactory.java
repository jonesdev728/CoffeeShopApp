package Classes;

import java.util.HashMap;

public class DrinkFactory {
        private HashMap<String, Class> drinks = new HashMap();
        public DrinkFactory()
        {
            drinks.put("Drip Coffee", DripCoffee.class);
            drinks.put("Latte", Latte.class);

        }
        public Drink createDrink(String type) {
            Drink d = null;
            try {
                d = (Drink)drinks.get(type).getConstructor().newInstance();
            }
            catch(Exception e){ System.out.println(e +"I knew it");}

            return d;
        }

        public void addNewDrink(String type)
        {
            try {
                String pizzaClassName = type.substring(0,1).toUpperCase()+type.substring(1)+"Coffee";
                drinks.put(type, Class.forName(pizzaClassName));
            } catch (ClassNotFoundException e) {System.out.println(e);}
        }
    }


