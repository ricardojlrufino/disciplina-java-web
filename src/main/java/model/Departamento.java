package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Departamento {

    @Id
    @GeneratedValue
    private Long id;

    private String descricao;
    
    @OneToMany(mappedBy="departamento",cascade=CascadeType.PERSIST)
    private List<Funcionario> funcionarios = new ArrayList<Funcionario>();
     
    public Departamento() {
        super();
    }
    
    public Departamento(String name) {
        this.descricao = name;
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
   
    public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
    
    public String getDescricao() {
		return descricao;
	}
  
    public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}
    
    public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}
}