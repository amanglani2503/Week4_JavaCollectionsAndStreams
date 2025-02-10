package day1_JavaGenerics.coursemanagement;

public class ResearchCourse extends CourseType{
    private String researchField;

    public ResearchCourse(String courseName, String instructor, String researchField) {
        super(courseName, instructor);
        this.researchField = researchField;
    }

    @Override
    public <T> T getCourseDetail() {
        return (T)("Research Field : " + researchField);
    }
}
