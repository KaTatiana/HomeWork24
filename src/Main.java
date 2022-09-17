//        1. Напишите статический метод, который принимает на вход три параметра: login, password и confirmPassword.
//        2. Параметр Login содержит в себе только латинские буквы, цифры и знак подчеркивания.
//        *Например, java_skypro.go*
//        1. У параметра login есть ограничение по длине – он должен быть равен или меньше 20 символов.
//        Если login длиннее 20 символов, то  необходимо выбросить исключение – `WrongLoginException`.
//        3. Параметр Password содержит в себе только латинские буквы, цифры и знак подчеркивания.
//        *Например, D_1hWiKjjP_9*
//        4. У параметра password тоже есть ограничение по длине – он должен быть строго меньше 20 символов.
//        5. Параметры password и confirmPassword должны быть равны. Если это требование не соблюдается, то нужно
//        выбросить`WrongPasswordException`.
//        6. Обработка исключений проводится внутри метода.
//        7. Для обработки исключений используйте multi-catch block.
//        1. Метод должен возвращать`true`, если значения параметров подходят под ограничения,
//        или `false` – если условия не выполняются.
import pro.sky.registration.exceptions.*;

public class Main {
    public static void main(String[] args) {
        boolean check =false;
        try {
            check = check("java_skyprogo", "D_1hWiKjjP_9", "D_1hWiKjjP_9");
        }catch (WrongLoginException e) {
            System.out.println("Ошибка при вводе логина. "+e);
        }catch (WrongPasswordException e) {
            System.out.println("Ошибка при вводе пароля. "+e);
        }
        finally{
            System.out.println("Проверка закончина!");
        }
        if(check) {
            System.out.println("Hello world!");
        }
    }

    public static boolean check(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (!login.matches("^\\w*$")) {
            throw new WrongLoginException("Логин содержит недопустимый символ!");
        } else if (login.length() > 20) {
            throw new WrongLoginException("Логин должен быть равен или меньше 20 символов!");
        }

        if(!login.matches("^\\w*$")){
            throw new WrongPasswordException("Пароль содержит недопустимый символ!");
        }else if(!password.equals(confirmPassword)){
            throw new WrongPasswordException("Пароли не совпадают!");
        }
        else if(password.length() > 20){
            throw new WrongLoginException("Пароль должен быть равен или меньше 20 символов!");
        }
        return true;
    }
}
