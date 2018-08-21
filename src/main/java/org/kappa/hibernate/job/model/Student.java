package org.kappa.hibernate.job.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="estudantes")
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="estudante_id")
	private long estudanteId;
	@Column(name="nome")
	private String nome;
	@Column(name="dni")
	private String dni;
	@Column(name="data_nac")
	@Temporal(TemporalType.DATE)
	private Date dataNac;
	public Student() {
	}
	public Student(long estudanteId, String nome, String dni, Date dataNac) {
		super();
		this.estudanteId = estudanteId;
		this.nome = nome;
		this.dni = dni;
		this.dataNac = dataNac;
	}
	public long getEstudanteId() {
		return estudanteId;
	}
	public void setEstudanteId(long estudanteId) {
		this.estudanteId = estudanteId;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public Date getDataNac() {
		return dataNac;
	}
	public void setDataNac(Date dataNac) {
		this.dataNac = dataNac;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataNac == null) ? 0 : dataNac.hashCode());
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		result = prime * result + (int) (estudanteId ^ (estudanteId >>> 32));
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (dataNac == null) {
			if (other.dataNac != null)
				return false;
		} else if (!dataNac.equals(other.dataNac))
			return false;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		if (estudanteId != other.estudanteId)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Student [estudanteId=" + estudanteId + ", nome=" + nome + ", dni=" + dni + ", dataNac=" + dataNac + "]";
	}
}
