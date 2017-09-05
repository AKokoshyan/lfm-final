package com.phonebook;

import java.util.ArrayList;
import java.util.Comparator;

import com.contacts.Contact;
import com.contacts.Contact.NameIsNullException;
import com.contacts.Contact.NumberIsNullException;

public class Phonebook {

	private String name;
	private ArrayList<Contact> contactList;
	private ArrayList<Contact> contactsOrderByOutgoingCall;

	public Phonebook(String name) {
		setName(name);
		this.contactList = new ArrayList<>();
	}

	private void setName(String name) {
		if (name != null) {
			this.name = name;
		} else {
			this.name = "undefined";
		}

	}

	public void fillContactList(ArrayList<String> contacts) {
		for (int i = 0; i < contacts.size(); i++) {
			String[] separator = contacts.get(i).split("-");
			for (int j = 0; j < separator.length; j++) {
				if (j < separator.length - 1) {
					try {
						contactList.add(new Contact(separator[j], separator[j + 1]));
					} catch (NameIsNullException e) {
						e.getMessage();
						e.printStackTrace();
					} catch (NumberIsNullException e) {
						e.getMessage();
						e.printStackTrace();
					}
				}
			}
		}
	}

	public void addSingleContact(Contact contact) {
		if (contact != null) {
			contactList.add(contact);
		}
	}

	public void removeContactByName(String name) {
		int temp = 0;
		for (int i = 0; i < contactList.size(); i++) {
			if (name.equals(contactList.get(i).getName())) {
				temp = i;
				break;
			}
		}
		contactList.remove(temp);
	}

	public String accessPhoneNumberByName(String name) {
		String phoneNumber = "";
		for (int i = 0; i < contactList.size(); i++) {
			if (name.equals(contactList.get(i).getName())) {
				phoneNumber = contactList.get(i).getNumber();
				break;
			}
		}
		return phoneNumber;
	}

	public void printTheTopFiveContackts() {
		contactsOrderByOutgoingCall = new ArrayList<>();
		contactsOrderByOutgoingCall.addAll(contactList);
		contactsOrderByOutgoingCall.sort((o1, o2) -> o2.getOutgoingCall() - o1.getOutgoingCall());

		int counter = 0;
		while (counter < 5) {
			System.out.println(contactsOrderByOutgoingCall.get(counter));
			counter++;
		}
	}

	@Override
	public String toString() {

		contactList.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
		String result = "";
		result += this.name + "\n";
		for (int i = 0; i < contactList.size(); i++) {
			result += contactList.get(i).toString() + "\n";
		}
		return result;
	}
}
