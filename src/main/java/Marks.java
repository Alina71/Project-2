
    /*
    We have to calculate the average of marks obtained in three subjects by
student A and by student B. Create class 'Marks' with an abstract method
'getPercentage' that will return the average percentage of marks. Provide
implementation of abstract methods in classes 'A' and 'B'. The constructor of
student A takes the marks in three subjects as its parameters and the marks
in four subjects as its parameters for student B. Test your code
     */
    public abstract class Marks {

    abstract double getPercentage();

    }
    class A extends Marks {
        double subjectMath, subjectSpanish, subjectEnglish;

        A( double subjectMath, double subjectSpanish,double subjectEnglish) {
this.subjectMath=subjectMath;
this.subjectSpanish=subjectSpanish;
this.subjectEnglish=subjectEnglish;

        }

        @Override
        double getPercentage() {
            return (subjectMath+subjectSpanish+subjectEnglish)/3;
        }
    }

    class B extends Marks {
        double subjectMath, subjectSpanish, subjectEnglish, subjectScience;

        B(double subjectMath, double subjectSpanish, double subjectEnglish, double subjectScience) {

            this.subjectMath = subjectMath;
            this.subjectSpanish = subjectSpanish;
            this.subjectEnglish = subjectEnglish;
            this.subjectScience = subjectScience;


        }

        @Override
        double getPercentage() {
            return (subjectMath + subjectSpanish + subjectEnglish + subjectScience) / 4;
        }


        public static void main(String[] args) {
            A a = new A(90, 74, 83);
            B b = new B(90, 80, 72, 82);
            System.out.println("The average of student A for all the objects is " + a.getPercentage());
            System.out.println("The average of student B for all the objects is " + b.getPercentage());
        }
    }


