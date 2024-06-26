package controller;

import service.FamilyService;
import dao.entity.Family;
import dao.entity.Human;
import dao.entity.Pet;

import java.util.List;
import java.util.Optional;

public class FamilyController {
    private FamilyService familyService;

    public FamilyController(FamilyService familyService) {
        this.familyService = familyService;
    }


    public List<Family> getAllFamilies() {
        return familyService.getAllFamilies();
    }

    public void displayAllFamilies() {
        familyService.displayAllFamilies();
    }

    public void getFamiliesBiggerThan(int numberOfPeople) {
        familyService.getFamiliesBiggerThan(numberOfPeople);
    }

    public void getFamiliesLessThan(int numberOfPeople) {
        familyService.getFamiliesLessThan(numberOfPeople);
    }

    public int countFamiliesWithMemberNumber(int numberOfPeople) {
        return familyService.countFamiliesWithMemberNumber(numberOfPeople);
    }

    public Optional<Family> createNewFamily(Human fatherName, Human motherName) {
        return familyService.createNewFamily(fatherName,motherName);
    }

    public boolean deleteFamilyByIndex(int index) {
        return familyService.deleteFamilyByIndex(index);
    }

    public Family bornChild(Family family, String masculineName, String feminineName) {
        return familyService.bornChild(family, masculineName, feminineName);
    }

    public void deleteAllChildrenOlderThan(int age) {
        familyService.deleteAllChildrenOlderThan(age);
    }
    public Family getFamilyById(int id){
        return familyService.getFamilyById(id);
    }

    public Family getFamilyByIndex(int index) {
        return familyService.getFamilyByIndex(index);
    }

    public boolean deleteFamily(int index) {
        try {
            return familyService.deleteFamily(index);
        }
        catch (FamilyOverflowException e){
            if (index>familyService.count()){
                System.out.println("index is not valid");
            e.printStackTrace();
            }
        }
        return familyService.deleteFamily(index);
    }

    public boolean deleteFamily(Family family) {
        return familyService.deleteFamily(family);
    }

    public boolean saveFamily(Family family) {
        return familyService.saveFamily(family);
    }

    public Family adoptChild(Family family, Human child) {
        return familyService.adoptChild(family, child);
    }

    public int count() {
        return familyService.count();
    }

    public List<Pet> getPet(int index) {
        return familyService.getPet(index);
    }
    public boolean addPet(int index, Pet pet){return  familyService.addPet(index,pet);}

}
