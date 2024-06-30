package singletonPattern;
// public enum Student {

import java.io.Serializable;

public class Student implements Serializable, Cloneable {

    // INSTANCE;

    private static Student student = new Student();

    private Student() {
        // if (student != null) {
        //     throw new RuntimeException("Cannot create instance. Please use createStudentmethod");
        // }
    }

    public static Student createStudent() {
        return student;
    }

    public Object readResolve() {
        return student;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return student;
    }

    

}
