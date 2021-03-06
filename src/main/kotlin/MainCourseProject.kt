class MainCourseProject {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val courseProject = CourseProject()
            courseProject.getSplineCoeffs(
                10,
                listOf(0.0, 1.0, 1.5, 2.5, 4.0, 4.5, 5.5, 6.0, 8.0, 10.0),
                listOf(10.0, 8.0, 5.0, 4.0, 3.5, 3.4, 6.0, 7.1, 8.0, 8.5),
                listOf(4.0, 4.0, 6.0, 12.0, 12.0, 0.0, 1.0, 4.0, 1.0),
                -1.0,
                0.5
            )
        }
    }
}