import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import java.util.Scanner;

class Result {

     */public static String findDay(int month, int day, int year) { Calendar calendar = Calendar.getInstance(); calendar.set(year, month - 1, day); int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK); System.out.println(dayOfWeek); String[] dayOf = { "SUNDAY", "MONDAY",
"TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY" }; return dayOf[dayOfWeek - 1]; } }