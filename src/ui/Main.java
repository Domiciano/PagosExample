package ui;

import exceptions.InvalidAmmountException;
import exceptions.NotEnoughMoneyException;
import model.User;

public class Main {


    public static void main(String[] args){

      try {
          User user = new User();
          user.getWallet().addIncome(10000);
          user.getWallet().addDebt(2000);
          user.getWallet().pay(8500);
      }catch (InvalidAmmountException ex){
          ex.printStackTrace();
      }catch (NotEnoughMoneyException ex){
          ex.printStackTrace();
      }





    }


}
