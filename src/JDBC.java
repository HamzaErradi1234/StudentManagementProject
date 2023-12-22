import java.sql.*;
import java.util.ArrayList;

public class JDBC {

    private static final String url="jdbc:mysql://localhost:3306/Scolagile ";
    private static final String utilisateur="root";
    private static final String pssd ="";
    private static Connection connixion = null ;
    public static Connection getConnixion(){
        if(connixion == null ){
            try {
                Connection conn = DriverManager.getConnection(url,utilisateur,pssd);
                System.out.println(" la connexion passer en succes");
                connixion=conn;
                return connixion;
            }catch(SQLException ex){
                System.out.println("il y'a une erreur ");
                ex.printStackTrace();
            }
        }
        return connixion;
    }

    public static void createEtudiantsTable(){
        Connection connection =getConnixion();
        String sql ="create table IF NOT EXISTS etudiants "+" "+"("+
                " id int auto_increment"+
                "primary key \n"+
                " nom varchar(30) charset utf8 null\n"+
                "prenom varchar(30) charset utf8 null \n"+
                "email varchar(30) charset utf8 null \n" +
                "apogee int charset utf8 null \n"+
                "Filiere varchar(30) charset utf8 null \n"+
                "note double charset utf8 null \n"+");";
        try{
            Statement stm = connection.createStatement();
            stm.executeQuery(sql);
            System.out.println("la table est creer en succes ");
        }catch(SQLException EX){
            EX.printStackTrace();
        }
    }
    public static void InsertionEtuiants(Etudiants etudiant ){
        Connection connection = getConnixion();
        String sql = "INSERT INTO etudiants (id , nom , prenom , email , apogee, Filiere , note )values (?,?,?,?,?,?,?)";
        try{
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, etudiant.getNom());
            statement.setString(2, etudiant.getPrenom());
            statement.setString(3, etudiant.getEmail());
            statement.setInt(4, etudiant.getApogee());
            statement.setString(5, etudiant.getFiliere());
            statement.setArray(6, etudiant.getNotes());

            int rowInsertion = statement.executeUpdate();
            if(rowInsertion>0){
                System.out.println("insertion d'un etudiant en succes");
            }
        }catch(SQLException EX){
            EX.printStackTrace();
        }

    }


    public static void updateEtudiant(Etudiants etudiant ){
        Connection connection =getConnixion();
        String sql = "UPDATE etudians SET nom=? , prenom=? , email=? , apogee=? , Filiere=? , note=? WHERE id =?";


        try{

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, etudiant.getNom());
            statement.setString(1, etudiant.getPrenom());
            statement.setString(1, etudiant.getEmail());
            statement.setInt(1, etudiant.getApogee());
            statement.setString(1, etudiant.getFiliere());
            statement.setArray(1, etudiant.getNotes());
            int rowInsertion =statement.executeUpdate();
            if(rowInsertion>0){
                System.out.println("la modefication est fait avec succes");
            }
        }catch(SQLException EX){
            EX.printStackTrace();
        }
    }




    public static void deleteEtudiant(int id){
        Connection connection =getConnixion();
        String sql="DELETE FROM etudiants WHERE id = ? ";

        try{
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1,id);
            int rowInsertion =statement.executeUpdate();
            if(rowInsertion >0){
                System.out.println("Etudiant est retirer en succes");
            }
        }catch(Exception EX){
            EX.printStackTrace();
        }
    }




    public static Etudiants getEtudiantById(int id ){
        Connection connection =getConnixion();
        String sql = "SELECT * FROM etudiants WHERE id=?";
        try{
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1,id);
            ResultSet result = statement.executeQuery();
            if(result.next()){
                Etudiants etudiant = new Etudiants();
                etudiant.setNom(result.getString("Nom"));
                etudiant.setPrenom(result.getString("Prenom"));
                etudiant.setEmail(result.getString("Email"));
                etudiant.setApogee(result.getInt("Apogee"));
                etudiant.setFiliere(result.getString("Filiere"));
                etudiant.setNotes((ArrayList<Double>) result.getArray("Notes"));
            }
        }catch(Exception EX){
            EX.printStackTrace();
        }
        return null;
    }
}
