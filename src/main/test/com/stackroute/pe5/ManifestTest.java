package com.stackroute.pe5;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ManifestTest {

    public static Manifest manifest;

    @BeforeClass
    public static void setUp()
    {
        manifest = new Manifest();
    }

    @AfterClass
    public static void tearDown()
    {
        manifest = null;
    }

    @Test
    public void givenListShouldReturnSortedList()
    {
        Student student1 = new Student("000EC2", "Harika", 22);
        Student student2 = new Student("000FCA", "Srujana", 23);
        Student student3 = new Student("000EBF", "Poornima", 22);
        Student student4 = new Student("000982", "Premika", 21);
        Student student5 = new Student("000BCA", "Harika", 22);

        List<Student> studentList = new ArrayList<>();

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);

        List<Student> sortedList = new ArrayList<>();

        sortedList.add(student2);
        sortedList.add(student3);
        sortedList.add(student1);
        sortedList.add(student5);
        sortedList.add(student4);

        assertEquals(sortedList.toString(),manifest.sortStudents(studentList).toString());
    }

    @Test
    public void givenNullShouldReturnNull()
    {
        assertNull(manifest.sortStudents(null));
    }

    @Test
    public void givenListWithDuplicateElemenstShouldReturnSortedList()
    {
        Student student1 = new Student("000EC2", "Harika", 22);
        Student student2 = new Student("000FCA", "Srujana", 23);
        Student student3 = new Student("000EBF", "Poornima", 22);
        Student student4 = new Student("000982", "Premika", 21);
        Student student5 = new Student("000EC2", "Harika", 22);

        List<Student> studentList = new ArrayList<>();

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);

        List<Student> sortedList = new ArrayList<>();

        sortedList.add(student2);
        sortedList.add(student3);
        sortedList.add(student1);
        sortedList.add(student5);
        sortedList.add(student4);

        assertEquals(sortedList.toString(),manifest.sortStudents(studentList).toString());
    }

}