package day1_JavaGenerics.mealplangenerator;

public class HighProteinMeal implements MealPlan{
    private int proteinGrams;

    public HighProteinMeal(int proteinGrams) {
        this.proteinGrams = proteinGrams;
    }

    @Override
    public String getMealDetails() {
        return "High-Protein meal with " + proteinGrams + "g of protein";
    }
}
