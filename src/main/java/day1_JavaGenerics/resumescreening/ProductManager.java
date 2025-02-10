package day1_JavaGenerics.resumescreening;

public class ProductManager extends JobRole {
    public ProductManager(String candidateName, int experienceYears) {
        super(candidateName, experienceYears);
    }

    @Override
    public String requiredSkills() {
        return "Required Skills: Market Research, Agile, UX, Business Strategy";
    }
}