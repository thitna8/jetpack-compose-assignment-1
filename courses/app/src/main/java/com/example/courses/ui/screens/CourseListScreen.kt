import android.content.res.Configuration
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.courses.data.Course
import androidx.compose.foundation.lazy.items
import com.example.courses.ui.theme.CoursesTheme


@Composable
fun CourseListScreen(courses: List<Course>) {
    LazyColumn(modifier = Modifier.fillMaxSize() .safeDrawingPadding()) {
        items(courses) { course ->
            CourseCard(course)
        }
    }
}
val sampleCourses = listOf(
    Course(
        "Applied Mathematics", "AS101", 7,
        "Focuses on mathematical methods for engineering and scientific problems, including differential equations, optimization, and numerical analysis.",
        "None"
    ),
    Course(
        "Technical Drawing", "AS201", 6,
        "Fundamentals of engineering graphics and mechanical systems design using both traditional drafting techniques and CAD software.",
        "AS101"
    ),
    Course(
        "Operating Systems", "AS301", 4,
        "Explore concepts like memory management and scheduling.",
        "AS201"
    )
)
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable

fun CourseListPreview() {
    CoursesTheme {
        CourseListScreen(sampleCourses)
    }
}
