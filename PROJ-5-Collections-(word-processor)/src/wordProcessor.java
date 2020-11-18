public class wordProcessor implements MiniWPI{
    //values
    private String words;

    //constructor
    wordProcessor(){
        words = "";
    }

    //argument constructor
    wordProcessor(String given){
        words = given;
        //default all of the words to be on the left
        for(int i = 0; i < words.length(); i++){
            left.push(words.charAt(i));
        }
    }

    @Override
    public boolean isAtStart() {
        return left.empty();
    }

    @Override
    public boolean isAtEnd() {
        return right.empty();
    }

    @Override
    public void insertChar(char c) {
        //default insert is left
        left.push(c);
    }

    @Override
    public void moveLeft() {
        right.push(left.pop());
    }

    @Override
    public void moveRight() {
        left.push(right.pop());
    }

    @Override
    public void backspace() {
        left.pop();
    }

    @Override
    public void delete() {
        right.pop();
    }

    @Override
    //move everything on left (end) to right (beginning)
    public void moveToStart() {
        //make sure left is not empty
        while(!left.empty()){
            right.push(left.pop());
        }

    }

    @Override
    //move everything on right (beginning) to left (end)
    public void moveToEnd() {
        //make sure right is not empty
        while (!right.empty()){
            left.push(right.pop());
        }
    }

    @Override
    public String toStringCursor() {
        return left.toString() + " | " + right.toString();
    }

    @Override
    public boolean search(char c) {
        boolean bool = false;

        //split string s
        String[] command = words.split("");
        //if not empty
        if(command.length >= 1) {
            for (int i = 0; i < command.length; i++) {
                if (command[i].equals(c)) {
                    bool = true;
                } else {
                    bool = false;
                }
            }
        }
        return bool;
    }

    @Override
    public void processCommand(String s) {
        //split string s
        String[] command = s.split("");
        System.out.println(command.length);

        //check if out of bound
        if (command.length != 1 || command.length != 2) {
            System.out.println("Invalid Command: Missing Information");
        }
        //check if value is valid
        else if (command[1].length() > 9 || command[1].length() < 1) {
            System.out.println("Invalid Command: Value Error");
        }
        //if command is "insert"
        else if (command[0].equals("insert")) {
            insertChar(command[1].charAt(0));
        }
        //if command is "move"
        else if (command[0].equals("move")) {
            //move right
            if (command[1].equals("right")) {
                moveRight();
            }
            //move left
            else if (command[1].equals("left")) {
                moveLeft();
            }
            //move everything to the left
            else if (command[1].equals("end")) {
                moveToEnd();
            }
            //move everything to the right
            else if (command[1].equals("start")) {
                moveToStart();
            }
            //invalid command
            else {
                System.out.println("Invalid Command: Value Error");
            }
        }
        //if command is "backspace"
        else if (command[0].equals("backspace")) {
            //only command
            if (command.length > 1) {
                System.out.println("Invalid Command");
            } else {
                backspace();
            }
        }
        //if command is "delete"
        else if (command[0].equals("delete")) {
            //only command
            if (command.length > 1) {
                System.out.println("Invalid Command");
            } else {
                delete();
            }
        }
        //if command is "search"
        else if (command[0].equals("search")) {
            //if value is invalid
            if (command[1].length() != 1) {
                System.out.println("Invalid Command: Value Error");
            } else {
                search(command[1].charAt(0));
            }
        }
        //else it is not any of the available command types
        else {
            System.out.println("Invalid Command");
        }
        printtest(s);
    }

    @Override
    public void printtest(String s) {
        System.out.println(s + ": " + this.toStringCursor());
    }
}
