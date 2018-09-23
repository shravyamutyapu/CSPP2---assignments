import java.util.Scanner;
import java.util.Arrays;

/**
  * write your code below this comment
  */
class Task {
    private String title;
    private String assignedTo;
    private int timeToComplete;
    private boolean important;
    private boolean urgent;
    private String status;
    Task() { }
    Task(String title1, String assignedTo1, int timeToComplete1, boolean important1, boolean urgent1, String status1) throws Exception{
        if(title1.length()==0) {
            throw new Exception("Title not provided");
        } else {
           this.title = title1;
        }
        this.assignedTo = assignedTo1;
        if(timeToComplete1 < 0) {
            throw new Exception("Invalid timeToComplete "+timeToComplete1);
        }
        this.timeToComplete = timeToComplete1;
        this.important = important1;
        this.urgent = urgent1;
        if(status.equals("todo")|| status.equals("done")) {
            this.status = status1;
        } else {
            throw new Exception("Invalid status "+status1);
        }

    }
        public String getTitle(){
            return this.title;
        }
         public String getassignedTo(){
            return this.assignedTo;
        }
        public String getStatus(){
            return this.status;
        }
        public int gettimeToComplete(){
            return this.timeToComplete;
        }
        public boolean getimportant(){
            return this.important;
        }
        public boolean geturgent(){
            return this.urgent;
        }
        public String getImpStatus() {
            if(this.important==true) {
                return "Important";
            } else {
                return "Not Important";
            }
        }
        public String getUrgStat() {
            if(this.urgent==true) {
                return "Urgent";
            } else {
                return "Not Urgent";
            }
        }
        public String setTitle(String title1) {
            return this.title = title1;
        }
        public int settimeToComplete(int timeToComplete1){
            return this.timeToComplete = timeToComplete1;
        }
        public String setStatus(String status1) {
            return this.status = status1;
        }
        public String toString(){
            return getTitle()+", "+getassignedTo()+", "+gettimeToComplete()+", "+getImpStatus()+", "+getUrgStat()+", "+getStatus();
        }
    // public String toString()throws Exception {
    //     String s = "";
    //     if (title != null) {
    //         s = title + ", " + assignedTo + ", ";
    //     }
    //     else{
    //         throw new Exception(" Title not provided ");
    //     }
    //     if (timeToComplete > 0) {
    //         s += timeToComplete + ", ";
    //     }
    //     else{
    //         throw new Exception ("Invalid timeToComplete "+timeToComplete);
    //     }
    //     if (important) {
    //         s += "Important" + ", ";
    //     } else s += "Not Important" + ", ";
    //     if (urgent) {
    //         s += "Urgent" + ", ";
    //     } else s += "Not Urgent" + ", ";
    //     if(status.equals("todo")|| status.equals("done")) {
    //         s += status;
    //     }
    //     else{
    //         throw new Exception("Invalid status "+status);
    //     }

    // return s;
//}
}



/**
 * Class for todoist main.
 */
class TodoistMain {

    /**
     * Starts a test.
     */
    public static void startTest() {
        //Todoist todo = new Todoist();
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            String[] tokens = s.nextLine().split(",");
            switch (tokens[0]) {
            case "task":
                testTask(tokens);
                break;
            // case "add-task":
            //     testAddTask(todo, tokens);
            //     break;
            // case "print-todoist":
            //     System.out.println(todo);
            //     break;
            // case "get-next":
            //     System.out.println(todo.getNextTask(tokens[1]));
            //     break;
            // case "get-next-n":
            //     int n = Integer.parseInt(tokens[2]);
            //     Task[] tasks = todo.getNextTask(tokens[1], n);
            //     System.out.println(Arrays.deepToString(tasks));
            //     break;
            // case "total-time":
            //     System.out.println(todo.totalTime4Completion());
            //     break;
            default:
                break;
            }
        }
    }

    /**
     * method to test add task.
     *
     * @param      todo    The todo
     * @param      tokens  The tokens
     */
    // public static void testAddTask(final Todoist todo, final String[] tokens) {
    //     try {
    //         todo.addTask(createTask(tokens));
    //     } catch (Exception e) {
    //         System.out.println(e.getMessage());
    //     }
    // }

    /**
     * method to test the creation of task object.
     *
     * @param      tokens  The tokens
     */
    public static void testTask(final String[] tokens) {
        try {
            System.out.println(createTask(tokens));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Creates a task object.
     *
     * @param      tokens     The tokens
     *
     * @return     Task object
     *
     * @throws     Exception  if task inputs are invalid
     */
    public static Task createTask(final String[] tokens) throws Exception {
        String title = tokens[1];
        String assignedTo = tokens[2];
        int timeToComplete = Integer.parseInt(tokens[3]);
        boolean important = tokens[4].equals("y");
        boolean urgent = tokens[5].equals("y");
        String status = tokens[6];
        return new Task(
                   title, assignedTo, timeToComplete, important, urgent, status);
    }

    /**
     * main method.
     *
     * @param      args  The command line arguments
     */
    public static void main(final String[] args) {
        startTest();
    }
}
