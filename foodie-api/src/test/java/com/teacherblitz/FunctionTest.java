package com.teacherblitz;

import cn.hutool.core.date.DateTime;
import lombok.Data;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author: teacherblitz
 * @since: 2020/5/19
 */
public class FunctionTest extends Object{

    public static int fun(Integer a1, Integer a2 , Integer a3, Bi<Integer,Integer,Integer> b){
        return b.apply(a1,a2,a3);
    }

    public static void fun2(String[] args) {
//        Bi<Integer,Integer,Integer> b1 = (a,b,c) -> a +b +c;
//        System.out.println(fun(1,2,3,b1));
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(3, 4);
        List<String> list3 = list1.stream()
                .flatMap(i -> list2
                        .stream()
                        .filter(j -> (i+j) % 3 ==0)
                        .map(j -> "("+i+j+")"))
                .collect(Collectors.toList());
        System.out.println(list3.toString());
    }

    public static void fun3(String[] args) {
        List<Dish> menu = Arrays.asList(
                new Dish("pork", false, 800, Dish.Type.MEAT),
                new Dish("beef", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("season fruit", true, 120, Dish.Type.OTHER),
                new Dish("pizza", true, 550, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("salmon", false, 450, Dish.Type.FISH) );
        Integer count = menu.stream()
                .map(i->1)
                .reduce(0, Integer::sum);
        System.out.println(count);
    }

    public static class Dish {
        private final String name;
        private final boolean vegetarian;
        private final int calories;
        private final Type type;
        public Dish(String name, boolean vegetarian, int calories, Type type) {
            this.name = name;
            this.vegetarian = vegetarian;
            this.calories = calories;
            this.type = type;
        }
        public String getName() {
            return name;
        }
        public boolean isVegetarian() {
            return vegetarian;
        }
        public int getCalories() {
            return calories;
        }
        public Type getType() {
            return type;
        }
        @Override
        public String toString() {
            return name;
        }
        public enum Type {
            MEAT, FISH, OTHER
        }
    }

    public static void fun4(String[] args) {
        String str = "824#121,824#122,824#123,824#124,824#125,824#126,824#127,824#128,824#129,824#130,823#201,823#202,823#203,823#208,823#209,823#210,823#211,823#212,823#213,823#214,823#215,823#216,823#217,823#218,823#219,823#220,822#102,822#103,822#106,822#107,822#108,822#109,822#110,822#111,822#112,822#113,822#114,822#115,822#116,822#117,822#118,822#119,822#120";
        List<String> list = Arrays.asList(str.split(","));
        Map<String, List<Room>> collect = list.stream().map(Room::new).collect(Collectors.groupingBy(Room::getId));
        System.out.println(collect);
    }

    public static void fun5(String[] args) {
        List<String> list = new ArrayList<>();
        LocalDateTime startDate = LocalDateTime.now().plusDays(1);
        LocalDateTime endDate = startDate.plusDays(10);
        // 计算两个日期之间的天数
        long days = ChronoUnit.DAYS.between(startDate, endDate);
        // 流迭代器
        Stream.iterate(startDate, s -> s.plusDays(1))
                .limit(days)
                .forEach(i -> list.add(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
                        .format(i)));
        System.out.println(String.format("可用日期(%s天)列表：%s", list.size(),list));
    }

    public static void main(String[] args) {
        String a = new String("1");
        String b = a;
//        System.out.println(a.equals(b));
        String str = "0424";
        String joinStr = String.join("", str.substring(2, 4), str.substring(0, 2));
//        System.out.println(joinStr);
        int i=0;
        i=i++;
        i=i++;
        i=i++;
        i=i++;
        i=i++;
        System.out.println("i="+i);
        System.gc();

    }

    @Data
    static class Room{
        private String id;
        private String value;

        public Room(String str){
            String[] split = str.split("#");
            this.id = split[0];
            this.value = split[1];
        }
        @Override
        public String toString(){
            return this.value;
        }
    }

    @FunctionalInterface
    interface Bi<R1,R2,R3>{
        int apply(R2 a,R1 a1 ,R3 a2);
    }
}
