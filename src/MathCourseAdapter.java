class MathCourseAdapter implements Course {
    private final MathCourse mathCourse;

    public MathCourseAdapter(MathCourse mathCourse) {
        this.mathCourse = mathCourse;
    }

    @Override
    public void teach() {
        mathCourse.teachMath();
    }
}