package ro.ubb.dp1819.panaite.dorinel.ex1;

import java.util.List;

public interface CoffeeDataInterpreter {
    List<BaseCoffeeIngredients> getCoffee(String filePath) throws CoffeeDataInterpreterException;
    BaseCoffeeIngredients getIngredientsFromLine(String line) throws CoffeeDataInterpreterException;
}