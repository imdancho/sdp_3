class ScienceCourseAdapter implements Course {
    private final ScienceCourse scienceCourse;

    public ScienceCourseAdapter(ScienceCourse scienceCourse) {
        this.scienceCourse = scienceCourse;
    }

    @Override
    public void teach() {
        scienceCourse.teachScience();
    }
}