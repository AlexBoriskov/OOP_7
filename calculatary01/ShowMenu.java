package calculatary01;

public class ShowMenu {
    
    /**
     * Конструктор по-умолчанию
     */
    public ShowMenu(){
    }

    /**
     * Выдача меню команд для пользователя
     */
    public void showUserMenu(){
        System.out.println("\n\nКалькулятор комплексных чисел!\n");
        System.out.println("1. Сложение");
        System.out.println("2. Вычитание");
        System.out.println("3. Умножение");
        System.out.println("4. Деление");
        System.out.println("5. Выход");
    }
}