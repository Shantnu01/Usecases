public class usecase5 {
  

    public static void main(String[] args) {

        String text = "JAVA";

        String[] banner = {
                String.join("", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*",
                                   "*", "*", "*", "*", "*", "*", "*", "*", "*", "*",
                                   "*", "*", "*", "*", "*", "*", "*", "*", "*", "*"),
                String.join("", "*", "                            ", "*"),
                String.join("", "*", "                            ", "*"),
                String.join("", "*", "        ", text, "            ", "*"),
                String.join("", "*", "                            ", "*"),
                String.join("", "*", "                            ", "*"),
                String.join("", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*",
                                   "*", "*", "*", "*", "*", "*", "*", "*", "*", "*",
                                   "*", "*", "*", "*", "*", "*", "*", "*", "*", "*")
        };
        for (String line : banner) {
            System.out.println(line);
        }
    }

}
