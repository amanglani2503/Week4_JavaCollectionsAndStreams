package day1_JavaGenerics.resumescreening;

public class Resume<T extends JobRole> {
    private T jobRole;

    public Resume(T jobRole) {
        this.jobRole = jobRole;
    }

    public T getJobRole() {
        return jobRole;
    }

    @Override
    public String toString() {
        return "Resume of " + jobRole.getCandidateName() + " for " + jobRole.getClass().getSimpleName() + "\n" + jobRole.requiredSkills();
    }
}