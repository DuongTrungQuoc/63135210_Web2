package thiGK.ntu63135210.models;

public class Student {
    private int code;
    private String name;
    private String className;
    private String department;
    private String university;

    public Student() {
        // Empty constructor required by Spring for model binding
    }

    public Student(int code, String name, String className, String department, String university) {
        this.code = code;
        this.name = name;
        this.className = className;
        this.department = department;
        this.university = university;
    }

    // Getters and setters
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }
}