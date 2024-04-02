public class Main {
    public static Employee[] employees = new Employee[10];


    public static void main(String[] args) {
        employees[0] = new Employee("Трындеева Любовь Аркадьевна", 5, 65_000);
        employees[1] = new Employee("Окунь Махрипа Люсьевна", 5, 75_000);
        employees[2] = new Employee("Пыж Андрей Никитьич", 1, 85_000);
        employees[3] = new Employee("Скороговоркина Ольга Андреевна", 2, 70_000);
        employees[4] = new Employee("Огнище Марина Петровна", 4, 74_000);
        employees[5] = new Employee("Писуль Карл Карлович", 3, 69_000);
        employees[6] = new Employee("Аркашин Яков Иванович", 1, 71_000);
        employees[7] = new Employee("Якубович Дмитрий Борисович", 4, 66_000);
        employees[8] = new Employee("Лялякишева Светланка Александровна", 2, 83_000);
        employees[9] = new Employee("Мякишева Кристина Алексеевна", 3, 78_000);
        getEmployeesList();
        System.out.println("Сумма затрат на всех сотрудников в месяц составляет " + countSalaryTotal());
        System.out.println("Минимальная зарплата у сотрудника " + getEmployeeMinSalary());
        System.out.println("Максимальная зарплата у сотрудника " + getEmployeeMaxSalary());
        System.out.println("Средняя зарплата всех сотрудников составляет " + getSalaryAverage() + " рублей");
        printEmployeesName();

    }
    private static void getEmployeesList() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);

        }
    }

    private static int countSalaryTotal() {
        int total = 0;
        for (int i = 0; i < employees.length; i++) {
            total = total + employees[i].getSalary();
        }
        return total;

    }

    private static Employee getEmployeeMinSalary() {
        Employee minSalary = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < minSalary.getSalary()) {
                minSalary = employees[i];
            }
        }
        return minSalary;
    }

    private static Employee getEmployeeMaxSalary() {
        Employee maxSalary = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > maxSalary.getSalary()) {
                maxSalary = employees[i];
            }
        }
        return maxSalary;
    }

    private static int getSalaryAverage() {
        return countSalaryTotal() / employees.length;
    }

    private static void printEmployeesName() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println("ФИО сотрудника " + employees[i].getFullName());
        }
    }
}
