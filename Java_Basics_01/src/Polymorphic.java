/**
 * @author Jin
 * @Description
 * @date 9/16/2023 11:28 AM
 */
public class Polymorphic {
    public static void main(String[] args){
        Income[] incomes = new Income[]{
                new Income(5000),
                new Salary(9000),
                new SpecialAllowance(8888)
        };

        //print total taxes
        System.out.println(totalTax(incomes));
        runTwice(incomes[0]);
    }

    public static void runTwice(Income income){
        income.getTax();
        income.getTax();

    }

    public static double totalTax(Income... incomes){
        double total = 0;
        for (Income income: incomes){
            total = total + income.getTax();
        }
        return total;
    }
}

//the ellipsis (...) is used as part of the syntax to create variable-length argument lists for methods

class Income{
    protected double income;

    public Income(double income){
        this.income = income;
    }

    public double getTax(){
        System.out.println("Income");
        return income * 0.1;
    }
}

class Salary extends Income {

    public Salary(double income){
        super(income);
    }
    public double getTax(){

        System.out.println("Salary");
        return (income-5000) *2;


    }
}


class SpecialAllowance extends Income{

    public SpecialAllowance(double income){
        super(income);
    }
    public double getTax(){
        System.out.println("SpecialAllowance");
        return 0;
    }
}