/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pro.omaralvarez.lambdas;

import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.Optional;
import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 *
 * @author ignis
 */
public class VisitCounter {

    public static void main(String[] args) {
        VisitCounter visitCounter = new VisitCounter();
        
        Map<String, VisitCounter.UserStats> visitMap = new HashMap<>();
        VisitCounter.UserStats userStats1 = new VisitCounter().new UserStats();
        userStats1.setVisitCount(5L);
        visitMap.put("123", userStats1);
        
        Map<String, VisitCounter.UserStats> visitMap2 = new HashMap<>();
        VisitCounter.UserStats userStats2 = new VisitCounter().new UserStats();
        userStats2.setVisitCount(10L);
        visitMap2.put("456", userStats2);
        
        Map<String, VisitCounter.UserStats> visitMap3 = new HashMap<>();
        VisitCounter.UserStats userStats3 = new VisitCounter().new UserStats();
        userStats3.setVisitCount(10L);
        visitMap3.put("omar", userStats3);
        
        Map<String, VisitCounter.UserStats> visitMap4 = new HashMap<>();
        VisitCounter.UserStats userStats4 = new VisitCounter().new UserStats();
        //userStats4.setVisitCount(null);
        visitMap4.put("12", userStats4);
        
        Map<String, VisitCounter.UserStats> visitMap5 = new HashMap<>();
        VisitCounter.UserStats userStats5 = new VisitCounter().new UserStats();
        userStats5.setVisitCount(25L);
        visitMap5.put("123", userStats5);
        
        Map<Long, Long> result = visitCounter.count(visitMap, visitMap2, visitMap3, visitMap4, visitMap5);
        result.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));

    }

    Map<Long, Long> count(Map<String, UserStats>... visits) {
        List<Map<String, UserStats>> list = new ArrayList<>();
        for (Map<String, UserStats> visit : visits) {
            list.add(visit);
        }

        Map<Long, Long> result = list.stream()
                .flatMap(entry -> entry.entrySet().stream())
                .filter(VisitCounter::filterVisit)
                .collect(Collectors.groupingBy(entry -> Long.parseLong(entry.getKey()),
                        Collectors.summingLong(entry -> entry.getValue().getVisitCount().get())));

        return result;
    }

    public static boolean filterVisit(Map.Entry<String, UserStats> entry) {
        boolean convertible = false;
        try {
            Long.parseLong(entry.getKey());
            convertible = true;
        } catch (NumberFormatException e) {

        }

        return convertible && entry.getValue() != null
                && entry.getValue().getVisitCount().isPresent();
    }

    public static Map<Long, Long> convertToMap(Map.Entry<String, UserStats> entry) {
        Map<Long, Long> map = new HashMap<>();
        var key = 0L;
        try {
            key = Long.parseLong(entry.getKey());
        } catch (NumberFormatException e) {

        }
        map.put(key, entry.getValue().visitCount);

        return map;
    }

    class UserStats {

        private Long visitCount;

        public Optional<Long> getVisitCount() {
            if(visitCount == null) return Optional.empty();
            return Optional.of(visitCount);
        }

        public void setVisitCount(Long visitCount) {
            this.visitCount = visitCount;
        }

    }

}
