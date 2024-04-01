/*
Design a Quiz System as following
There is a abstract class Questions
It includes a variable question_text- This contains the text of the question
You can set question text using constructors
It includes a method verifyAnswer() to verify .
It includes abstract method specifications for getQuestion(), getSolution()
There are 2 other classes True or False Questions, Multiple Choice Question
They all inherit the Question class and provide implementation for its methods.
They all have a variable called mySolution
( Note: different class will have different data type for this variable)
Child classes will call parents getType method to get the question type
Multiple Choice Question also has variables for different options
Note:
Make a Main class where you can make and give the quiz
Write an interactive program in Java
Shuffle all the questions randomly
Each question must specify which type of question it is.
Total score and solution must be displayed in the end.
 */
import java.util.Scanner;

abstract class Questions{
    static int point=0;
    String question_text;
    Questions(String question_text){
        this.question_text=question_text;
    }
   public abstract void verifyAnswer();
   public abstract String getQuestion();
   public abstract String getSolution();
}
class TrueAndFalse extends Questions{
    boolean mySolution;
    boolean Solution;
    TrueAndFalse(String question_text,boolean mySolution,boolean Solution){
        super(question_text);
        this.mySolution=mySolution;
        this.Solution=Solution;
    }
    public void verifyAnswer(){
      if(mySolution==Solution){
          point++;
      }
    }
    public String getQuestion(){
       return question_text;
    }
    public String getSolution(){
        if(Solution==true){
            return "true";
        }
        else {
            return "false";
        }
    }
}
class MCQ extends Questions{
    String mySolution,Solution;
    MCQ(String question_text,String mySolution,String Solution){
        super(question_text);
        this.mySolution=mySolution;
        this.Solution=Solution;
    }
    public void verifyAnswer(){
       if(mySolution.equals(Solution)){
           point++;
       }
    }
    public String getQuestion(){
       return question_text;
    }
    public String getSolution(){
     return Solution;
    }
}

public class QuizQuestion {
    public static void main(String[] args) {
        String question_text;
        String mySolution;
        boolean mySolution1;
        Scanner sc = new Scanner(System.in);
        Questions q1[] = new TrueAndFalse[2];
        Questions q2[] = new MCQ[3];
        q2[0]=new MCQ("What is the name of the capital city of America. \n1)NewYork 2)Boston 3)WashingtonDC 4)Akron","","");
        q2[1]=new MCQ("The first president of india.\n1)PanditNehru 2)RajendralalPrasad 3)VallabhaiPatel 4)Gandhi","","");
        q2[2]=new MCQ("The longest river in world.\n1)Nile 2)Amazon 3)Ganga 4)Krishna","","");
        q1[0]=new TrueAndFalse("All method in abstract class are abstract.",false,false);
        q1[1]=new TrueAndFalse("Java is object oriented language.",false,false);
        System.out.println("Answer the question.");
        for(int i=0;i<3;i++){
            System.out.println("Attempt mcq no "+(i+1)+".");
            System.out.println(q2[i].getQuestion());
            mySolution=sc.next();
            if(i==0) {
                q2[i] = new MCQ(q2[i].question_text, mySolution, "WashingtonDC");
            }
            else if(i==1){
                q2[i] = new MCQ(q2[i].question_text, mySolution, "RajendralalPrasad");
            }
            else if(i==2){
                q2[i] = new MCQ(q2[i].question_text, mySolution, "Nile");
            }
            q2[i].verifyAnswer();

            if(i==0 || i==1){
                System.out.println("Attempt true and false no "+(i+1)+".");
                System.out.println(q1[i].getQuestion());
                mySolution1=sc.nextBoolean();
                if(i==0){
                    q1[i]=new TrueAndFalse(q1[i].question_text,mySolution1,false);
                }
                else if(i==1){
                    q1[i]=new TrueAndFalse(q1[i].question_text,mySolution1,true);
                }
                q1[i].verifyAnswer();
            }
        }
        System.out.println("The total point you get is "+Questions.point);
        System.out.println("The solution is given below.");
        for(int i=0;i<3;i++){
            System.out.println(q2[i].getQuestion());
            System.out.println("Solution -"+q2[i].getSolution());
            if(i==0 || i==1){
                System.out.println(q1[i].getQuestion());
                System.out.println("Solution -"+q1[i].getSolution());
            }
        }

    }
}
