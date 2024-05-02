package com.example.eidservermock;

import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
class OperationsAllowedByUser{
    @JsonProperty("DocumentType")
    public String documentType;
    @JsonProperty("IssuingState")
    public String issuingState;
    @JsonProperty("DateOfExpiry")
    public String dateOfExpiry;
    @JsonProperty("GivenNames")
    public String givenNames;
    @JsonProperty("FamilyNames")
    public String familyNames;
    @JsonProperty("ArtisticName")
    public String artisticName;
    @JsonProperty("AcademicTitle")
    public String academicTitle;
    @JsonProperty("DateOfBirth")
    public String dateOfBirth;
    @JsonProperty("PlaceOfBirth")
    public String placeOfBirth;
    @JsonProperty("Nationality")
    public String nationality;
    @JsonProperty("BirthName")
    public String birthName;
    @JsonProperty("PlaceOfResidence")
    public String placeOfResidence;
    @JsonProperty("ResidencePermitI")
    public String residencePermitI;
    @JsonProperty("RestrictedID")
    public String restrictedID;
    @JsonProperty("AgeVerification")
    public String ageVerification;
    @JsonProperty("PlaceVerification")
    public String placeVerification;
}

class PersonalData{
    @JsonProperty("DocumentType")
    public String documentType;
    @JsonProperty("IssuingState")
    public String issuingState;
    @JsonProperty("GivenNames")
    public String givenNames;
    @JsonProperty("FamilyNames")
    public String familyNames;
    @JsonProperty("ArtisticName")
    public String artisticName;
    @JsonProperty("AcademicTitle")
    public String academicTitle;
    @JsonProperty("PlaceOfBirth")
    public PlaceOfBirth placeOfBirth;
    @JsonProperty("Nationality")
    public String nationality;
    @JsonProperty("BirthName")
    public String birthName;
    @JsonProperty("PlaceOfResidence")
    public PlaceOfResidence placeOfResidence;
    @JsonProperty("ResidencePermitI")
    public String residencePermitI;
    @JsonProperty("DateOfBirth")
    public String dateOfBirth;
}

class PlaceOfBirth{
    @JsonProperty("FreetextPlace")
    public String freetextPlace;
}

class PlaceOfResidence{
    @JsonProperty("StructuredPlace")
    public StructuredPlace structuredPlace;
}

class Result{
    @JsonProperty("ResultMajor")
    public String resultMajor;
}

public class ResultDTO{
    @JsonProperty("PersonalData")
    public PersonalData personalData;
    @JsonProperty("OperationsAllowedByUser")
    public OperationsAllowedByUser operationsAllowedByUser;
    @JsonProperty("Result")
    public Result result;
}

class StructuredPlace{
    @JsonProperty("Street")
    public String street;
    @JsonProperty("City")
    public String city;
    @JsonProperty("Country")
    public String country;
    @JsonProperty("ZipCode")
    public String zipCode;
}

