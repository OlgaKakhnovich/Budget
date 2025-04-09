package app;

import database.DatabaseConnection;
import repository.BudgetRepository;

import java.sql.*;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws SQLException {


        BudgetRepository budgetRepository = new BudgetRepository();
        budgetRepository.getAllCategories();

       // budgetRepository.insertUser("ola", "ola@wp.pl", "123456");
       // budgetRepository.updateUser("maja", 2);
        //budgetRepository.deleteUser(4);

    }

}