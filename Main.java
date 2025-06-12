public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to CS 112!");
        printer();
        String message = secret("Hello");
        System.out.println(message);
    }

    public static void printer() {
        System.out.println("\nThis is a message printed from the void method.");
    }

    public static String secret(String s) {
        return ("The secret message is: " + s);
    }
    
}

class pianoPiece {
    private String name;

    public pianoPiece() {
        this.name = "N/A";
    }
    
    public pianoPiece(String name) {
        this.name = name;
    }

    public void changeName(String newName) {
        this.name = newName;
    }

    public String retrieveName() {
        return name;
    }

    public String toString() {
        return ("The name of this piece is " + name);
    }
    
    public boolean equals(Object piece) {
        pianoPiece other = (pianoPiece) piece;
        if (this.name.equals(other.name)) {
            return true;
        } else {
            return false;
        }
    }
}