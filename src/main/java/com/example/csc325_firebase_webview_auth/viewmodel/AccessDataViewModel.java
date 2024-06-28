package com.example.csc325_firebase_webview_auth.viewmodel;



import javafx.beans.property.ReadOnlyBooleanProperty;
import javafx.beans.property.ReadOnlyBooleanWrapper;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class AccessDataViewModel {

	private final StringProperty userName = new SimpleStringProperty();
	private final StringProperty lastName = new SimpleStringProperty();
	private final StringProperty department = new SimpleStringProperty();
	private final StringProperty email = new SimpleStringProperty();
	private final StringProperty userMajor = new SimpleStringProperty();
        private final int age=0;
	private final ReadOnlyBooleanWrapper writePossible = new ReadOnlyBooleanWrapper();

	public AccessDataViewModel() {
		writePossible.bind(userName.isNotEmpty().and(userMajor.isNotEmpty()).and(lastName.isNotEmpty()).and(department.isNotEmpty()).and(email.isNotEmpty()));
	}

	public StringProperty userNameProperty() {
		return userName;
	}
	public StringProperty lastNameProperty() {
		return lastName;
	}
	public StringProperty userMajorProperty() {
		return userMajor;
	}
	public StringProperty departmentProperty() {
		return department;
	}
	public StringProperty emailProperty() {
		return email;
	}



	public ReadOnlyBooleanProperty isWritePossibleProperty() {
		return writePossible.getReadOnlyProperty();
	}
}
