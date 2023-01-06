//https://github.com/mameevdi/CW1/pull/1
public class Main {
    private static final Employee[] EMPLOYEES = {
            new Employee("Мамеев Дмитрий Михайлович", 1, 125600),
            new Employee("Трофимова Анастасия Алексеевна", 2, 98000),
            new Employee("Шкуратова Ирина Васильевна", 3, 106100),
            new Employee("Аветисян Эдгар Жораевич", 4, 58200),
            new Employee("Рогов Михаил Сергеевич", 1, 95700),
            new Employee("Пляко Александр Петрович", 5, 36050),
            new Employee("Иванова Дарья Сергеевна", 2, 67900),
            new Employee("Кротов Михаил Борисович", 4, 65000),
            new Employee("Калиниченко Елизавета Арсеньевна", 3, 115000),
            new Employee("Куценко Лиана Арсеновна", 1, 103000),

    };
    public static void printEmployees() {
        for (Employee employee : EMPLOYEES) {
            System.out.println(employee);
        }
    }

    public static double sumSalary() {
        double sum = 0;
        for (Employee employee : EMPLOYEES) {
            sum = sum + employee.getSalary();
        }
        return sum;
    }

    public static Employee employeeMinSalary() {
        Employee result = EMPLOYEES[0];
        double minSalary = EMPLOYEES[0].getSalary();
        for (Employee employee : EMPLOYEES) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static Employee employeeMaxSalary() {
        Employee result = EMPLOYEES[0];
        double maxSalary = EMPLOYEES[0].getSalary();
        for (Employee employee : EMPLOYEES) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static double averageSalary() {
        double average = 0;
        average = sumSalary() / EMPLOYEES.length;
        return average;
    }


    public static void printSeparator() {
        System.out.println();
    }

    public static void main(String[] args) {
        printEmployees(); //Получить список всех сотрудников
        printSeparator();

        System.out.println("Сумма затрат на зарплаты в месяц: " +sumSalary()); //Посчитать сумму затрат на зарплаты.
        printSeparator();

        System.out.println("Сотрудник с минимальной заработной платой " + employeeMinSalary()); //Найти сотрудника с минимальной заплатой.
        printSeparator();

        System.out.println("Сотрудник с максимальной заработной платой " + employeeMaxSalary()); //Найти сотрудника с максимальной зарплатой.
        printSeparator();

        System.out.println("Среднее значение зарплат "+ averageSalary()); //Подсчитать среднее значение зарплат.
    }
}