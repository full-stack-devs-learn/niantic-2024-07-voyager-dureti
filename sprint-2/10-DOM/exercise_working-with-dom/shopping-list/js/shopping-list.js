// add pageTitle

// add groceries
const service = new ShoppingService();
/**
 * This function will get a reference to the title and set its text to the value
 * of the pageTitle variable that was set above.
 */
function displayListTitle() {
    const shoppingTitle = document.getElementById("title");
    shoppingTitle.textContent = service.getListName();
}

/**
 * This function will loop over the array of groceries that was set above and add them to the DOM.
 */
function displayGroceries() {
    const groceries = service.getShoppingList();
    const groceryContainer = document.getElementById("shopping-list");

    groceries.forEach(grocery => {
        createShoppingListDiv(grocery, groceryContainer);
    });
}

function createShoppingListDiv(grocery, parent) {
    const shoppingDiv = document.createElement("div");
    shoppingDiv.classList.add("list-item");

    // check if item marked complete, add to complete
    if (grocery.isComplete) {
        shoppingDiv.classList.add('complete');
    }

    parent.appendChild(shoppingDiv);

    // add all inner div
    buildItemTitle(grocery, shoppingDiv);
    buildQuantity(grocery, shoppingDiv);
}

function buildItemTitle(grocery, parent) {
    const itemTitleDiv = document.createElement("div");
    itemTitleDiv.textContent = grocery.title;
    parent.appendChild(itemTitleDiv);
}

function buildQuantityLabel(grocery, parent) {
    const quantityLabel = document.createElement('span');
    quantityLabel.classList.add('super');
    quantityLabel.textContent = "quantity";
    parent.appendChild(quantityLabel);
}

function buildQuantity(grocery, parent) {
    const quantityDiv = document.createElement("div");
    quantityDiv.classList.add("quantity-container");

    buildQuantityLabel(grocery, quantityDiv);
    const quantityText = document.createTextNode(grocery.quantity);
    quantityDiv.appendChild(quantityText);

    parent.appendChild(quantityDiv);
}
/**
 * This function will be called when the button is clicked. You will need to get a reference
 * to every list item and add the class completed to each one
 */
function markCompleted() {
    const items = document.querySelectorAll('.list-item');
    items.forEach(item => {
    item.classList.add('complete');
    });
}

document.addEventListener("DOMContentLoaded", () => {

    displayListTitle();

    displayGroceries();

});