public class BasicDifficulty {
    private static Employee[] employees = new Employee[10];
    public static void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
        public static int calculateTotalSalary() {
            int sum = 0;
            for (Employee employee : employees) {
                sum += employee.getSalary();
            }
            return sum;
        }
        public static Employee findEmployeeWithMinSalary() {
            Employee result = employees[0];
            int minSalary = employees[0].getSalary();
            for (Employee employee : employees) {
                if (employee.getSalary() < minSalary) {
                    minSalary = employee.getSalary();
                    result = employee;
                }
            }
            return result;
        }
        public static Employee findEmployeeWithMaxSalary() {
            Employee result = employees[0];
            int maxSalary = employees[0].getSalary();
            for (Employee employee : employees) {
                if (employee.getSalary() > maxSalary) {
                    maxSalary = employee.getSalary();
                    result = employee;
                }
            }
            return result;
        }
        public static float calculateAverageSalary() {
            return calculateTotalSalary() / Employee.getCounter();
        }
        public static void printFullNames() {
            for (Employee employee : employees) {
                System.out.println(employee.getName());
            }
        }
        public static void main(String[] args) {
            employees = new Employee[]{
                    new Employee("Макарова Надежда Владимировна", 15_000, 1);
            new Employee("Плотников Иван Александрович", 82_000, 2);
            new Employee("Алексеева Анна Данииловна", 20_000, 3);
            new Employee("Морозова Дарья Александровна", 24_000, 1);
            new Employee("Зайцева Екатерина Артемьевна", 30_000, 2);
            new Employee("Титова София Марковна", 15_000, 1);
            new Employee("Алексеев Мирон Тигранович", 37_000, 1);
            new Employee("Лаптев Тимофей Сергеевич", 50_000, 2);
            new Employee("Прокофьева Владислава Егоровна", 38_000, 3);
            new Employee("Климова Полина Евгеньевна", 19_000, 1);
                    };
            printFullNames();
            printEmployees();
            System.out.println("avg = " + calculateAverageSalary);
        }
    }
}
