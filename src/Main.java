import database.DatabaseService;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws SQLException {
        Connection connection = DatabaseService.createConnection();

        pozivanjeProcedureZaBrisanjeDrzava(connection);

        connection.close();
    }

    public static void pozivanjeProcedureZaBrisanjeDrzava(Connection connection) throws SQLException {
        String callProcedure = "{CALL ObrisiDrzaveSaIdVecimOd(?)}";
        CallableStatement callableStatement = connection.prepareCall(callProcedure);

        int minId = 1011;
        callableStatement.setInt(1, minId);

        callableStatement.execute();

        System.out.println("Drzave sa Id vecim ili jednakim od " + minId + " su obrisane.");

        callableStatement.close();
    }


    public static void unos10RandomDrzava(Connection connection) throws SQLException {
        List<String> naziviDrzava = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            naziviDrzava.add("Drzava" + i);
        }

        String query = "INSERT INTO Drzava (Naziv) VALUES (?)";

        PreparedStatement preparedStatement = connection.prepareStatement(query);

        for (String nazivDrzave : naziviDrzava) {
            preparedStatement.setString(1, nazivDrzave);
            preparedStatement.executeUpdate();
            System.out.println("Dodana: " + nazivDrzave);
        }

        preparedStatement.close();
    }
}