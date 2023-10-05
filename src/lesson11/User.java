package lesson11;

public class User {

    public static void register(String login, String password, String confirmPassword) {
        try{
            checkLogin(login);
            checkPassword(password, confirmPassword);
            System.out.println("успешная регистрация");
        }catch (WrongPasswordException | WrongLoginException e){
            System.out.println(e);
        }

    }


    private static void checkLogin(String login) throws WrongLoginException {
        if (login.length() > 20 || login.contains(" ")) {
            throw new WrongLoginException("login issue");
        }
    }

        private static void checkPassword (String password, String confirmPassword) throws WrongPasswordException {
            if (password.length() > 20 || password.contains(" ") || !password.equals(confirmPassword) || !checkNumber(password)){
                throw new WrongPasswordException("password issue");
            }
        }

        static boolean checkNumber(String q){
        for(char c : q.toCharArray()){
            if(Character.isDigit(c)){
                return true;
            }
        }
        return false;
    }

//        static boolean checkSymbol(String q){
//        for(char c : q.toCharArray()){
//            if(c == '*' || c == '.' || c == ',' || c == '<' || c == '>' || c == '/'){
//                return true;
//            }
//        }
//        return false;
//        }




    }
