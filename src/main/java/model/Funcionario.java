package model;

import javax.persistence.*;
 
@Entity
public class Funcionario {
	
    @Id @GeneratedValue
    private Long id;

    private String name;
    
    @ManyToOne
    private Departamento departamento;

    public Funcionario() {}

    public Funcionario(String name, Departamento departamento) {
        this.name = name;
        this.departamento = departamento;
    }
    

    public Funcionario(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
    
    public Departamento getDepartamento() {
		return departamento;
	}
    

}
