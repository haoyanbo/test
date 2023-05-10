package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
//import java.util.stream.Collectors;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        testPriorityQueue();

        try {
            Scanner scanner = new Scanner(System.in); // 创建 Scanner 对象，从标准输入流中读取数据
            System.out.print("请输入一个整数：");
            int num = scanner.nextInt(); // 获取用户输入的整数
            System.out.println("您输入的整数是：" + num);
            scanner.nextLine(); // 读取换行符，避免影响下一次读取
            System.out.print("请输入一个字符串：");
            String str = scanner.nextLine(); // 获取用户输入的字符串
            System.out.println("您输入的字符串是：" + str);
            scanner.close(); // 关闭 Scanner 对象
        } catch(Exception e) {
            System.out.print(e.toString());
        }
        // test output
        String message = "Hello";
        print(message);
        message += "World!";
        print(message);

        Jedi jedi = new Jedi("yanbo", "none");
        System.out.println(jedi.isB());

        System.out.println(LocalDateTime.now());
        // Press ⌥⏎ with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        ArrayList<String> names =  new ArrayList<String>();
        names.add("Yanbo");
        names.add("Modi");
        names.add("Xia");
        names.add("Aurora");
        //names.sort(Comparator.comparing(String::toString));
//        names.stream().sorted(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareTo(o2).coll;
//            }
//        })
        List<String> collect = names.stream()
                .sorted(new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        return o1.compareTo(o2);
                    }
                })
                .collect(Collectors.toList());
        for (String strx: collect
             ) {
            System.out.println(strx);
        }

        //names.stream().sorted((s1, s2) -> s1.compareTo(s2)).collect(Collectors.toList());
        //names.sort(Comparator.comparing(s -> s.toString()));
        //names.sort((o1, o2) -> o1.compareTo(o2));
        //Collections.sort(names);ˀ
        //names.sort(List.);
//        for(String name : names)
//            System.out.println(name);
        //System.out.printf("Hello and welcome!");

        // Press ⌃R or click the green arrow button in the gutter to run the code.
//        for (int i = 1; i <= 5; i++) {
//
//            // Press ⌃D to start debugging your code. We have set one breakpoint
//            // for you, but you can always add more by pressing ⌘F8.
//            System.out.println("i = " + i);
//        }
    }
    public static void print(String message) {
        System.out.print(message);
        message += "hehe";
    }
    public static void testPriorityQueue() {
        // 创建一个 PriorityQueue 对象
        PriorityQueue<String> queue = new PriorityQueue<>();

        // 添加元素
        queue.offer("沉默");
        queue.offer("王二");
        queue.offer("陈清扬");
        System.out.println("1:" + queue); // 输出 [沉默, 王二, 陈清扬]

        // 删除元素
        queue.poll();
        //queue.offer("漠笛");
        System.out.println("2:" + queue); // 输出 [王二, 陈清扬]

        // 修改元素：PriorityQueue 不支持直接修改元素，需要先删除再添加
        queue.poll();
        System.out.println("3:" + queue);
        queue.offer("张三");
        System.out.println("4:" + queue); // 输出 [张三, 陈清扬]

        // 查找元素：PriorityQueue 不支持随机访问元素，只能访问队首元素
        System.out.println("5:" + queue.peek()); // 输出 张三
        System.out.println("6:" + queue.contains("陈清扬")); // 输出 true

        // 通过 for 循环的方式查找陈清扬
        for (String element : queue) {
            if (element.equals("陈清扬")) {
                System.out.println("找到了：" + element);
                break;
            }
        }
    }
}