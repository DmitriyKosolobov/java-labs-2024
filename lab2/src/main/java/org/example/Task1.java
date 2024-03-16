package org.example;

import java.time.LocalDate;

public class Task1 {
    public static class MonthCalendar {
        private int year;
        private int month;

        private MonthCalendar() {
        }

        public static MonthCalendar of(int year, int month) {
            MonthCalendar calendar = new MonthCalendar();
            calendar.year = year;
            calendar.month = month;
            return calendar;
        }

        public void print() {
            LocalDate date = LocalDate.of(year, month, 1);

            System.out.printf("%3s", "ВС");
            System.out.printf("%3s", "ПН");
            System.out.printf("%3s", "ВТ");
            System.out.printf("%3s", "СР");
            System.out.printf("%3s", "ЧТ");
            System.out.printf("%3s", "ПТ");
            System.out.printf("%3s", "СБ");
            System.out.println();

            for (int i = 1; i < date.getDayOfWeek().getValue() + 1; i++) {
                System.out.print("   ");
            }
            while (date.getMonthValue() == month) {
                System.out.printf("%3d", date.getDayOfMonth());
                if (date.getDayOfWeek().getValue() == 6) {
                    System.out.println();
                }
                date = date.plusDays(1);
            }

        }
    }

    public static void main(String[] args) {
        MonthCalendar.of(2024, 3).print();
    }
}
