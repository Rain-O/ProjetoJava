public class JavaProject {
    // Condições aula 09
    //Calculadora
    public static void main(String[] args) {
        String operation = args[0];
        int x = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);
    if (operation.equals("Soma")){
        sum(x, y);
    }
    }
    static void sum(int x, int y){
        System.out.println(x + y);
    }

}
