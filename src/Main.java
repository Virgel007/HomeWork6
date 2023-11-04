public class Main {
    public static void main(String[] args) {
//        task1();
//        task2();
        task3();
//        task4();
//        task5();
//        task6();
//        task7();
//        task8();
//        task9();
//        task10();

    }

    //### **Задание 1**
    //Представим, что мы работаем в небольшой компании. Данные сотрудников хранятся в неструктурированном формате,
    // и бухгалтерия попросила написать программу, в которой можно работать с Ф.И.О. сотрудников.
    //Напишите четыре строки:
    //первая с именем firstName — для хранения имени;
    //вторая с именем middleName — для хранения отчества;
    //третья с именем lastName — для хранения фамилии;
    //четвертая с именем fullName — для хранения Ф.И.О. сотрудника в формате "Фамилия Имя Отчество".
    //Выведите в консоль фразу: “ФИО сотрудника — ….”
    //В качестве данных для задачи используйте “Ivanov Ivan Ivanovich”.
    public static void task1() {
        String firstName = "Ivan";
        firstName = firstName + ' ';
        String middleName = "Ivanovich";
        middleName = middleName + ' ';
        String lastName = "Ivanov";
        lastName = lastName + ' ';
        String fullName = lastName + firstName + middleName;
        System.out.println("Ф.И.О. сотрудника — " + fullName);
    }
    //### **Задание 2**
    //Для подачи ежемесячного отчета и ведения документации нашей бухгалтерии нужны
    //Ф.И.О. сотрудников, полностью написанные заглавными буквами (верхним регистром).
    //Напишите программу, которая изменит написание Ф. И. О. сотрудника с “Ivanov Ivan Ivanovich” на полностью заглавные буквы.
    //В качестве строки с исходными данными используйте строку fullName.
    //Результат программы выведите в консоль в формате: ”Данные ФИО сотрудника для заполнения отчета — …”
    public static void task2() {
        String firstName = "Ivan";
        firstName = firstName + ' ';
        String middleName = "Ivanovich";
        middleName = middleName + ' ';
        String lastName = "Ivanov";
        lastName = lastName + ' ';
        String fullName = lastName + firstName + middleName;
        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета — " + fullName.toUpperCase());
    }
    //### **Задание 3**
    //Система, в которой мы работаем, не принимает символ “ё”.
    //Поэтому нам нужно написать программу, которая заменяет символ “ё” на символ “е”.
    //В качестве исходных данных используйте строку fullName и данные в ней “Иванов Семён Семёнович”.
    //Выведите результат программы в консоль в формате: ”Данные ФИО сотрудника — ...”
    public static void task3() {
        String firstName = "Семён";
        firstName = firstName + ' ';
        String middleName = "Семёнович";
        middleName = middleName + ' ';
        String lastName = "Иванов";
        lastName = lastName + ' ';
        String fullName = lastName + firstName + middleName;
        fullName = fullName.replace('ё', 'е');
        System.out.println("Данные Ф.И.О. сотрудника — " + fullName);
    }

    public static void task10() {
//        String phone = "9604157537";
//        phone = '7' + phone;
//        System.out.println("phone = " + phone);
//        String phone = "89604157537";
//        if (phone.length() == 10) {
//            phone = '7' + phone;
//        } else if (phone.length() > 11) {
//            throw new RuntimeException("Телефон слишком длинный");
//        } else if (phone.length() < 10) {
//            throw new RuntimeException("Телефон слишком короткий");
//        } else if (phone.length() == 11 && phone.charAt(0) != '7') {
//            throw new RuntimeException("Среди нас пастаронний");
//        }
//        System.out.println("phone = " + phone);
        String phone = "+7 960-415-75-37";
        phone = phone.replace("-", "");
        phone = phone.replace("+", "");
        phone = phone.replace(" ", "");
        if (phone.length() == 10) {
//            phone = '7' + phone;
        } else if (phone.length() > 11) {
            throw new RuntimeException("Телефон слишком длинный");
        } else if (phone.length() < 10) {
            throw new RuntimeException("Телефон слишком короткий");
        } else if (phone.length() == 11 && phone.charAt(0) != '7') {
            throw new RuntimeException("Среди нас пастаронний");
        }
        System.out.println("phone = " + phone);
        String expectedPhone = "79604157537";
        if (phone.equals(expectedPhone)) {
            System.out.println("Успех");
        } else {
            System.out.println("Не удача");
        }
    }
}