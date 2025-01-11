
public class Course {
	private int id;
    private String course_name;
    private String course_fees;
    private String course_duration;

    public Course() {}

    public Course(int id, String course_name,
                  String course_fees,
                  String course_duration)
    {
        this.id = id;
        this.course_name = course_name;
        this.course_fees = course_fees;
        this.course_duration = course_duration;
    }

    public int getId() {
      return id; 
    }

    public void setId(int id) {
      this.id = id; 
    }

    public String getCourse_name() {
      return course_name; 
    }

    public void setCourse_name(String course_name)
    {
        this.course_name = course_name;
    }

    public String getCourse_fees() {
      return course_fees; 
    }

    public void setCourse_fees(String course_fees)
    {
        this.course_fees = course_fees;
    }

    public String getCourse_duration()
    {
        return course_duration;
    }

    public void setCourse_duration(String course_duration)
    {
        this.course_duration = course_duration;
    }
}
