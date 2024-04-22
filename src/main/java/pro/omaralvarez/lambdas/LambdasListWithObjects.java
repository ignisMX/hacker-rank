/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pro.omaralvarez.lambdas;

import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 *
 * @author ignis
 */
public class LambdasListWithObjects {

    public static void main(String[] args) {

        var studentOne = new Student("Omar", 18, 88L);
        var studentTwo = new Student("Gael", 4, 95L);
        var studentThree = new Student("Alexis", 11, 78L);
        var studentFour = new Student("Saurom", 24, 80L);
        var studentFive = new Student("Saurom", 12, 30L);

        var list = List.of(studentOne, studentTwo, studentThree, studentFour,studentFive);
        scoreAverage(list);
        sumScores(list);
        toMap(list);
        groupingIntoMap(list);
        
        Map<String, Student> mapOne = new HashMap();
        mapOne.put("Omar", studentOne);
        mapOne.put("Gael", studentTwo);
        mapOne.put("Saurom", studentFour);
        
        Map<String, Student> mapTwo = new HashMap();
        mapTwo.put("Alexis", studentThree);
        mapTwo.put("Saurom", studentFive);
        System.out.println("------->");
        var listMap = List.of(mapOne, mapTwo);
        groupingByName(listMap);
        
    }

    private static void scoreAverage(List<Student> list) {

        var stats = list.stream().mapToLong(Student::getScore).summaryStatistics();

        System.out.println("average: " + stats.getAverage());

    }

    private static void sumScores(List<Student> list) {
        var sum = list.stream().mapToLong(Student::getScore).sum();
        System.out.println("sum: " + sum);
    }
    
    private static void toMap(List<Student> list){
        Map<String, Integer> map = list.stream()
                .collect(Collectors
                        .toMap(Student::getName
                                , student -> student.getAge() + student.getScore().intValue()
                                ,(oldOne, newOne)-> newOne));
        
        map.entrySet().stream().forEach(System.out::println);
    }
    
    private static void groupingIntoMap(List<Student> list){
        
        Map<String, Long> map = list.stream()
                .collect(Collectors.groupingBy(Student::getName, 
                Collectors.summingLong(Student::getScore)));
        
        map.entrySet().stream().forEach(System.out::println);
        
    }
    
    private static void groupingByName(List<Map<String, Student>> list){
    
        Map<String, List<Student>> result = list.stream()
                .flatMap(map -> map.entrySet().stream())
                .collect(Collectors.groupingBy(entry -> entry.getKey(), 
                        Collectors.mapping(Map.Entry::getValue, Collectors.toList())));
        
        result.entrySet().stream().forEach(System.out::println);
    }

}

class Student {

    private String name;
    private int age;
    private Long score;

    public Student(String name, int age, Long score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Long getScore() {
        return score;
    }

    public void setScore(Long score) {
        this.score = score;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
    

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", age=" + age + ", score=" + score + '}';
    }

}
