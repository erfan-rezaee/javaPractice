class UserManager{

    public String formatName(String name){
        return name.trim().toUpperCase();
    }

    public boolean isValidUsername(String username) {
        return username.length() >= 5;
    }

    public String generateEmail(String username, String domain){

        StringBuilder email = new StringBuilder();

        email.append(username)
             .append("@")
             .append(domain);

        return email.toString();
    }

    public static void printUserInfo(String name, boolean valid, String email){

        System.out.println("========== User Information ==========");
        System.out.println("Name: " + name);
        System.out.println("Username Valid: " + valid);
        System.out.println("Email: " + email);
        System.out.println("==================================");
    }

    public static void main(String[] args){

        UserManager user = new UserManager();
        String username = "erfan";
        String formattedName = user.formatName(username);
        boolean isValid = user.isValidUsername(username);
        String email = user.generateEmail(username, "gmail.com");
        printUserInfo(formattedName, isValid, email);

    }
}