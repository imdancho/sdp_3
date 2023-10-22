class SDPCourseAdapter implements Course {
    private final SDPCourse sdpCourse;

    public SDPCourseAdapter(SDPCourse sdpCourse) {
        this.sdpCourse = sdpCourse;
    }

    @Override
    public void teach() {
        sdpCourse.teachSDP();
    }
}