package Ingredient.Chemical;

import Ingredient.BasicIngredient;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.math.BigDecimal;
@Entity
public abstract class BasicChemicalIngredient extends BasicIngredient implements ChemicalIngredient {

    @Column(name = "chemical_formula")
    String chemicalFormula;

    protected BasicChemicalIngredient() {}

    BasicChemicalIngredient(String name, BigDecimal price, String chemicalFormula) {
        super(name, price);
        this.setChemicalFormula(chemicalFormula);
    }

    public String getChemicalFormula() {
        return this.chemicalFormula;
    }

    private void setChemicalFormula(String chemicalFormula){
        this.chemicalFormula = chemicalFormula;
    }
}
