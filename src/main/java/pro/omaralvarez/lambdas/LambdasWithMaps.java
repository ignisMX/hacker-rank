/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pro.omaralvarez.lambdas;

import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 *
 * @author ignis
 */
public class LambdasWithMaps {
    
    public static void main(String[] args) {
        
        var studentOne = new Student("Omar", 18, 88L);
        var studentTwo = new Student("Gael", 4, 95L);
        var studentThree = new Student("Alexis", 11, 78L);
        var studentFour = new Student("Saurom", 24, 80L);
        var studentFive = new Student("Saurom", 12, 30L);
        
        Map<String, Student> mapOne = new HashMap();
        mapOne.put("Omar", studentOne);
        mapOne.put("Gael", studentTwo);
        mapOne.put("Saurom", studentFour);
        
        Map<String, Student> mapTwo = new HashMap();
        mapTwo.put("Alexis", studentThree);
        mapTwo.put("Saurom", studentFive);
        System.out.println("------->");
        var listMap = List.of(mapOne, mapTwo);
        sumOfAllScores(listMap);
        sumAllAgeGreater18(listMap);
        getListOfScoreGreater80(listMap);
        
        System.out.println("------->");
        filterMapAgeGreater18(listMap);
        System.out.println("------->");
        getDuplicatedStudents(listMap);
        
    }
    
    public static void sumOfAllScores(List<Map<String, Student>> list){
    
        Long sum  = list.stream().flatMap(map -> map.values().stream())
                .reduce(0L, 
                        (accumulator, current) -> accumulator + current.getScore(), 
                        Long::sum);
        System.out.println("sumatoria: "+sum);
    }
    
    public static void sumAllAgeGreater18(List<Map<String, Student>> list){
        
        int sum = list.stream()
                .flatMap(map -> map.values().stream())
                .filter(student -> student.getAge() > 17)
                .reduce(0, (accumulator, student)-> accumulator + student.getAge(), Integer::sum);
        
        System.out.println("sumatoria de las edades: "+sum);
    
    }
    
    public static void getListOfScoreGreater80(List<Map<String, Student>> list){
    
        List<Long> scores = list.stream()
                .flatMap(map -> map.values().stream())
                .filter(student -> student.getScore() > 79)
                .map(student -> student.getScore())
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        
        scores.forEach(System.out::println);
    }
    
    public static void filterMapAgeGreater18(List<Map<String, Student>> list){
        
        Map<String, Student> result = list.stream()
                .flatMap(map -> map.values().stream())
                .filter(student -> student.getAge() > 17)
                .collect(Collectors.toMap(Student::getName, Function.identity()));
        
        result.entrySet().forEach(System.out::println);
    }
    
    public static void getDuplicatedStudents(List<Map<String, Student>> list){
    
        Set<String> set = list.stream()
                .flatMap(map -> map.values().stream())
                .map(Student::getName)
                .collect(Collectors.toSet());
        
        Map<String, Student> result = list.stream()
                .flatMap(map -> map.values().stream())
                .filter((student) -> {
                    if(set.contains(student.getName())){
                        set.remove(student.getName());
                        return false;
                    }
                    
                    return true;
                })
                .collect(Collectors.toMap(Student::getName, Function.identity()));
        
        result.entrySet().forEach(System.out::println);
    }
}


