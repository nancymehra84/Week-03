package singly_linked_list.inventory_management_system;

class InventoryNode {
    String itemName;
    int itemId;
    int itemQuantity;
    int itemPrice;

    InventoryNode next;

    // Constructor
    public InventoryNode(String itemName, int itemId, int itemQuantity, int itemPrice) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.itemQuantity = itemQuantity;
        this.itemPrice = itemPrice;
    }
}


