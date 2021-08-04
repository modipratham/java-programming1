
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    public void addMeal(String meal) {
        if (meals.contains(meal)) {
            
        }else{
            meals.add(meal);
        }

        // implement the required methods here
    }

    public void printMeals() {
        for(String meal: meals){
            System.out.println(meal);
        }
    
            

    }

    public void clearMenu() {
        meals.clear();

    }
}
