package ru.shestakov.start;

import ru.shestakov.models.*;
import java.util.*;

public class Tracker {
	
	private Item[] items = new Item[10];
	private int position = 0;
	private static final Random RN = new Random();
	
	public Item add(Item item) {
		item.setId(this.generateId());
		this.items[position++] = item;
		return item;
	}
	
	public void addComment(Item item, Comment newComment) {
		if(this.findById(item.getId()) != null) {
			item.setComment(newComment);
		}
	}
	
	public void update(Item item, String newName, String newDescription) {
		Item updatedItem = this.findById(item.getId());
		if (updatedItem != null) {
			updatedItem.setName(newName);
			updatedItem.setDescription(newDescription);
		}
	}
	
	public void delete(Item itemForDelete) {
		for (int index=0; index<this.position; index++) {
			if (this.items[index].getId().equals(itemForDelete.getId())) {
				this.items[index] = null;
				break;
			}	
		}
		
		/*
		if (this.findById(id) != null) {
			int newPosition = this.position--;
			Item[] newItems = new Item[newPosition];
			for (int index=0; index!=this.position; index++) {
				Item item = this.items[index];
				if (item.getId().equals(id) == false) {
					newItems[index] = item;
				}
			}
		this.items = newItems;
		this.position = newPosition;*/
		
	}

	protected Item findById(String id) {
		Item result = null;
		for (Item item : items) {
			if (item != null && item.getId().equals(id)) {
				result = item;
				break;
			}
		}
		return result;
	}
	
	public Item findByName(String name) {
		Item result = null;
		for (Item item : items) {
			if (item != null && item.getName().equals(name)) {
				result = item;
				break;
			}
		}
		return result;	
	}
	
	public Item findByDesc(String desc) {
		Item result = null;
		for (Item item : items) {
			if (item != null && item.getDescription().equals(desc)) {
				result = item;
				break;
			}
		}
		return result;	
	}
	
	public Item findByCreate(long create) {
		Item result = null;
		for (Item item : items) {
			if (item != null && item.getDescription().equals(create)) {
				result = item;
				break;
			}
		}
		return result;	
	}
	
	String generateId() {
		return String.valueOf(System.currentTimeMillis() + RN.nextInt());
	}
	
	public Item[] getAll() {
		Item[] result = new Item[position];		
		for (int index=0; index!=this.position; index++) {
			result[index] = this.items[index];
		}
		return result;
	}
}