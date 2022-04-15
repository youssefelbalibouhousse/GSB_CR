package controleur;

import java.sql.*;

public class c_BDD {
    public static void main(String[] args) throws Exception{

        try {
            //Charger le driver
            //etablir la connexion

            String s = "jdbc:mysql://localhost:3306/gsb_java";


            Connection con = DriverManager.getConnection(s,"root","root");

            //declarer les variables de connexion

            Statement st = con.createStatement();

            //executer la requete sql

            ResultSet resultSet = st.executeQuery("select * from gsb_java.visiteur");

            //afficher le resultat a travers des procedes

            while (resultSet.next()) {
                System.out.println(resultSet.getString("vis_prenom"));
            }
            //fermer la connexion
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
