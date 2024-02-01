package practice;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

import bean.Trader;
import bean.Transaction;
import model.DataModel;

public class Ex06TransactionApp {
    public static void main(String[] args) {
        List<Transaction> transactions = DataModel.getTransactions();
        transactions.forEach(System.out::println);

        // 1. Find all transactions in the year 2011 and sort them by value (small to
        // high).
        System.out.println("\u001B[34m"
                + "------  1. Find all transactions in the year 2011 and sort them by value (small to high)"
                + "\u001B[0m");
        transactions.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted(new Comparator<Transaction>() {
                    public int compare(Transaction transaction1, Transaction transaction2) {
                        int valOfTransaction1 = transaction1.getValue();
                        int valOfTransaction2 = transaction2.getValue();
                        if (valOfTransaction1 > valOfTransaction2) {
                            return 1;
                        }
                        return -1;

                    };
                })
                .forEach(System.out::println);

        System.out.println("\u001B[34m"
                + "------ sorted by value (high to small)"
                + "\u001B[0m");
        transactions.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue).reversed())
                .forEach(System.out::println);

        // 2. Find all transactions have value greater than 300 and sort them by
        // trader’s city
        System.out.println("\u001B[34m"
                + "------ 2. Find all transactions have value greater than 300 and sort them by  trader"
                + "\u001B[0m");
        transactions.stream()
                .filter(transaction -> transaction.getValue() > 300)
                .sorted(new Comparator<Transaction>() {
                    public int compare(Transaction o1, Transaction o2) {
                        String city1 = o1.getTrader().getCity();
                        String city2 = o2.getTrader().getCity();
                        return city1.compareTo(city2);
                    };
                })
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("\u001B[34m"
                + "------ sort with comparing "
                + "\u001B[0m");
        System.out.println("sort with comparing");

        transactions.stream()
                .filter(transaction -> transaction.getValue() > 300)
                .sorted(Comparator.comparing(t -> t.getTrader().getCity()))
                .forEach(System.out::println);
        // 3. What are all the unique cities where the traders work?
        System.out.println("\u001B[34m"
                + "------ 3. What are all the unique cities where the traders work? "
                + "\u001B[0m");
        transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .forEach(System.out::println);

        // 4. Find all traders from Cambridge and sort them by name descending.
        System.out.println("\u001B[34m"
                + "------ 4. Find all traders from Cambridge and sort them by name descending."
                + "\u001B[0m");
        transactions.stream()
                .filter(transaction -> "Cambridge".equals(transaction.getTrader().getCity()))
                .sorted(
                        Comparator.comparing(
                                transaction -> ((Transaction) transaction).getTrader()
                                        .getName())
                                .reversed())
                .forEach(System.out::println);

        System.out.println("\u001B[34m"
                + "------ case 2"
                + "\u001B[0m");

        transactions.stream()
                .map(Transaction::getTrader)
                .filter(t -> "Cambridge".equals(t.getCity()))
                .sorted(Comparator.comparing(Trader::getName, Comparator.reverseOrder()))
                .forEach(System.out::println);
        // 5. Return a string of all traders’ names sorted alphabetically.
        System.out.println("\u001B[34m"
                + "5. Return a string of all traders’ names sorted alphabetically."
                + "\u001B[0m");
        String s = transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()
                .collect(Collectors.joining(", "));
        System.out.println(s);
        // 6. Are any traders based in Milan?
        System.out.println("\u001B[34m"
                + "6. Are any traders based in Milan?."
                + "\u001B[0m");

        boolean hasMilanTrader = transactions.stream()
                .anyMatch(transaction -> "Milan".equals(transaction.getTrader().getCity()));
        System.out.println(hasMilanTrader);
        // 7. Count the number of traders in Milan.
        System.out.println("\u001B[34m"
                + "7. Count the number of traders in Milan."
                + "\u001B[0m");
        long countTheNumOfTradersInMilan = transactions.stream()
                .filter(transaction -> "Milan".equals(transaction.getTrader().getCity()))
                .count();
        System.out.println(countTheNumOfTradersInMilan);
        // 8. Print all transactions’ values from the traders living in Cambridge.
        // Transaction -> trader, value
        System.out.println("\u001B[34m"
                + "8. Print all transactions’ values from the traders living in Cambridge."
                + "\u001B[0m");
        transactions.stream()
                .filter(transaction -> "Cambridge".equals(transaction.getTrader().getCity()))
                .map(Transaction::getValue)
                .forEach(System.out::println);

        // 9. What’s the highest value of all the transactions?
        System.out.println("\u001B[34m"
                + "9. What’s the highest value of all the transactions?"
                + "\u001B[0m");
        OptionalInt maxValueOpt = transactions.stream()
                .mapToInt((Transaction::getValue)) // IntStream
                .max();
        maxValueOpt.ifPresent(max -> System.out.println(max));

        transactions.stream()
                .filter(transaction -> {
                    return transaction.getValue() == transactions.stream()
                            .map(Transaction::getValue)
                            .reduce(Integer.MIN_VALUE, Integer::max);
                })
                .forEach(System.out::println);
        ;
        // 10. Find the transaction with the smallest value.
        System.out.println("\u001B[34m"
                + "10. Find the transaction with the smallest value."
                + "\u001B[0m");
        Optional<Transaction> transactionOpt = transactions.stream()
                .reduce((t1, t2) -> t1.getValue() < t2.getValue() ? t1 : t2);
        transactionOpt.ifPresent(minT -> System.out.println(minT));

    }
}
