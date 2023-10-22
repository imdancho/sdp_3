public class Main {
    public static void main(String[] args) {
        MathCourse mathCourse = new MathCourse();
        ScienceCourse scienceCourse = new ScienceCourse();
        SDPCourse sdpCourse = new SDPCourse();

        Course mathCourseAdapter = new MathCourseAdapter(mathCourse);
        Course scienceCourseAdapter = new ScienceCourseAdapter(scienceCourse);
        Course SDPCourseAdapter = new SDPCourseAdapter(sdpCourse);

        mathCourseAdapter.teach();
        scienceCourseAdapter.teach();
        SDPCourseAdapter.teach();
    }
}