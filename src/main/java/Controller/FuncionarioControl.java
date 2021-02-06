
package Controller;
import Model.Funcionario;
import java.util.ArrayList;

/**
 *
 * @author Lucas Ramon
 */

public class FuncionarioControl {
    public static boolean SalvarFuncionario(String Nome,String Cpf,String DataNasc,String Sexo,String Cargo){
        Funcionario f = new Funcionario(Nome,Cpf,DataNasc,Sexo,Cargo);
        return f.Perdurar();       
        }
    public static ArrayList<String[]> getFuncionarios(){
        
        ArrayList<String[]> Funcionarios = new ArrayList();
        
        ArrayList<Funcionario> F = Funcionario.getFuncionarios();
        if(F!=null){
        for(int i=0;i<F.size();i++){
            String f[]= new String[5];
            f[0]=F.get(i).getNome();
            f[1]=F.get(i).getCpf();
            f[2]=F.get(i).getDataNasc();
            f[3]=F.get(i).getSexo();
            f[4]=F.get(i).getCargo();
            Funcionarios.add(f);
        }
        }
        return Funcionarios; 
  }   
}