
package Model;

import aut.Arquivo;
import java.util.ArrayList;
import json.JSONArray;
import json.JSONObject;

public class Funcionario {
    
    private String Nome;
    private String Cpf;
    private String DataNasc;
    private String Sexo;
    private String Cargo;
    
    
    public Funcionario(){    
    }
    public Funcionario(String Nome, String Cpf, String DataNasc, String Sexo, String Cargo) {
        this.Nome = Nome;
        this.Cpf = Cpf;
        this.DataNasc = DataNasc;
        this.Sexo = Sexo;
        this.Cargo = Cargo;
    }
public Funcionario(JSONObject json) {
        this.Nome = json.getString("Nome");
        this.Cpf = json.getString("CPF");
        this.DataNasc = json.getString("Data de Nascimento");
        this.Sexo = json.getString("Sexo");
        this.Cargo = json.getString("Cargo");
        
    }
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    public String getDataNasc() {
        return DataNasc;
    }

    public void setDataNasc(String DataNasc) {
        this.DataNasc = DataNasc;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }
    
    public JSONObject toJson(){
      JSONObject json = new JSONObject();
      json.put("Nome",this.Nome);
      json.put("CPF",this.Cpf);
      json.put("Data de Nascimento",this.DataNasc);
      json.put("Sexo",this.Sexo);
      json.put("Cargo",this.Cargo);
      return json;
    }
    public boolean Perdurar(){
        JSONObject json=this.toJson();
        String banco = Arquivo.Read();
        JSONArray jF = new JSONArray();
        if(!banco.isEmpty() && banco.length()>5)
               jF = new JSONArray(banco);
       
             jF.put(json);
        Arquivo.Write(jF.toString());
        return true;
    }
    public static ArrayList<Funcionario>getFuncionarios(){
        ArrayList<Funcionario>funcionarios=new ArrayList();
        String banco = Arquivo.Read();
        if(banco.isEmpty()|| banco.length()<5)
            return null;
        JSONArray jF = new JSONArray(banco);
        for(int i=0;i<jF.length();i++){
            Funcionario F = new Funcionario(jF.getJSONObject(i));
            funcionarios.add(F);
        }
        return funcionarios;
        
    }
    
}

    
    

