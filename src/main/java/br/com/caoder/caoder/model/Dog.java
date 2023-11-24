package br.com.caoder.caoder.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "dog_seq", sequenceName = "dog_seq", initialValue = 1, allocationSize = 1)
public class Dog {

    public enum Porte {
        pequeno,
        médio,
        grande
    }

    public enum Personalidade {
        Calmo,
        Agitado,
        Medroso,
        Carinhoso
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "dog_seq")
    private long id;
    private String aupelido;
    private int idade;
    private Porte porte;
    private Personalidade personalidade;
    private boolean sexo;
    private boolean castrado;
    private boolean vacinado;
    private String problemas;
    private String tutor;
    private String tutorContato;

    public Dog(){ }

    public Dog(long id, String aupelido, int idade, Porte porte, Personalidade personalidade, boolean sexo, boolean castrado, boolean vacinado, String problemas, String tutor, String tutorContato ){
        this.id = id;
        this.aupelido = aupelido;
        this.idade = idade;
        this.porte = porte;
        this.personalidade = personalidade;
        this.sexo = sexo;
        this.castrado = castrado;
        this.vacinado = vacinado;
        this.problemas = problemas;
        this.tutor = tutor;
        this.tutorContato = tutorContato;
    }

    /**
     * @return long - O ID do cachorro
     */
    public long getId() {
        return id;
    }

    /**
     * @param id - O ID a ser definido para o cachorro
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return String - O apelido do cachorro
     */
    public String getAupelido() {
        return aupelido;
    }

    /**
     * @param aupelido - O apelido a ser definido para o cachorro
     */
    public void setAupelido(String aupelido) {
        this.aupelido = aupelido;
    }

    /**
     * @return int - A idade do cachorro
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade - A idade a ser definida para o cachorro
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return Porte - O porte do cachorro (Pequeno, Médio, Grande)
     */
    public Porte getPorte() {
        return porte;
    }

    /**
     * @param porte - O porte a ser definido para o cachorro
     */
    public void setPorte(Porte porte) {
        this.porte = porte;
    }

    /**
     * @return Personalidade - A personalidade do cachorro (Calmo, Agitado, Medroso, Carinhoso)
     */
    public Personalidade getPersonalidade() {
        return personalidade;
    }

    /**
     * @param personalidade - A personalidade a ser definida para o cachorro
     */
    public void setPersonalidade(Personalidade personalidade) {
        this.personalidade = personalidade;
    }

    /**
     * @return boolean - O sexo do cachorro
     */
    public boolean isSexo() {
        return sexo;
    }

    /**
     * @param sexo - O sexo a ser definido para o cachorro
     */
    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    /**
     * @return boolean - Se o cachorro é castrado ou não
     */
    public boolean isCastrado() {
        return castrado;
    }

    /**
     * @param castrado - Se o cachorro é castrado ou não
     */
    public void setCastrado(boolean castrado) {
        this.castrado = castrado;
    }

    /**
     * @return boolean - Se o cachorro está vacinado ou não
     */
    public boolean isVacinado() {
        return vacinado;
    }

    /**
     * @param vacinado - Se o cachorro está vacinado ou não
     */
    public void setVacinado(boolean vacinado) {
        this.vacinado = vacinado;
    }

    /**
     * @return String - Os problemas de saúde do cachorro
     */
    public String getProblemas() {
        return problemas;
    }

    /**
     * @param problemas - Os problemas de saúde a serem definidos para o cachorro
     */
    public void setProblemas(String problemas) {
        this.problemas = problemas;
    }

    /**
     * @return String - O tutor do cachorro
     */
    public String getTutor() {
        return tutor;
    }

    /**
     * @param tutor - O tutor a ser definido para o cachorro
     */
    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    /**
     * @return String - O contato do tutor do cachorro
     */
    public String getTutorContato() {
        return tutorContato;
    }

    /**
     * @param tutorContato - O contato do tutor a ser definido para o cachorro
     */
    public void setTutorContato(String tutorContato) {
        this.tutorContato = tutorContato;
    }
}
