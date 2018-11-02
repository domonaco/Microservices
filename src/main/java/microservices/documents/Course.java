package microservices.documents;

import java.math.BigInteger;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "courses")
public class Course {
    
    @Id
    private BigInteger id;
    
    private String courseName;
    private String courseResponsible;

    public BigInteger getId() {
        return id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseResponsible() {
        return courseResponsible;
    }

    public void setCourseResponsible(String courseResponsible) {
        this.courseResponsible = courseResponsible;
    }
    
    
    
}
