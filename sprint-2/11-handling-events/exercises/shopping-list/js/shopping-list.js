let service;
let list = []

let allItemsIncomplete = true;

function displayListTitle() {
    const title = document.getElementById("title")
    title.textContent = service.getListName();
}

function displayShoppingList() {
    const parent = document.getElementById("shopping-list")
    parent.innerHTML = "";
    list.forEach(item => {
        addListItem(item, parent);
    })
}

function addListItem(item, parent)
{
    const div = document.createElement("div")
    div.classList.add("list-item");
    if(item.isComplete)
    {
        div.classList.add("complete")
    }

    addItemTitle(item, div);
    addQuantity(item, div)

    // Added click event listener to mark item complete
    div.addEventListener('click', () => {
        markItemComplete(div, item);
    });

    // Added double-click event listener to mark item incomplete
    div.addEventListener('dblclick', () => {
        markItemInComplete(div, item);
    });


    parent.appendChild(div)
}

function addItemTitle(item, parent)
{
    const div = document.createElement("div")
    div.textContent = item.title;

    parent.appendChild(div);
}

function addQuantity(item, parent)
{
    const div = document.createElement("div");
    div.classList.add("quantity-container");

    const span = document.createElement("span");
    span.textContent = "quantity"
    span.classList.add("super");

    const text = document.createTextNode(item.quantity)

    div.appendChild(span)
    div.appendChild(text)
    parent.appendChild(div);
}

// Mark individual item complete

function markItemComplete(item)
{
    if (!item.classList.contains("complete")) 
    {
        item.classList.add("complete");
        item.isComplete = true;
    }

}

// Mark item incomplete

function markItemInComplete(item)
{
    if (item.classList.contains("complete")) 
    {
        item.classList.remove("complete");
        item.isComplete = false;
    }
}

// Toggle all

function toggleAllItems()
{
    const toggleButton = document.getElementById("allCompleteButton");
    toggleButton.addEventListener('click', () => 
    {
        allItemsIncomplete = !allItemsIncomplete;
        list.forEach(item => {
            item.isComplete = !allItemsIncomplete;
        });
        displayShoppingList();
        toggleButton.textContent = allItemsIncomplete ? "Mark All Complete" : "Mark All Incomplete";
    });
}
// add new item

function addNewItem(event){
    event.preventDefault();

    const itemName = document.getElementById("itemName").value;
    const quantity = document.getElementById("quantity").value;

    const newItem = {
        title: itemName,
        quantity: quantity,
        isComplete: false
    };

    list.push(newItem);
    displayShoppingList();
    clearForm();
}

function clearForm(){
    document.getElementById("itemName").value = "";
    document.getElementById("quantity").value = "";
}

document.addEventListener('DOMContentLoaded', () => {
    const form = document.querySelector('form');
    form.addEventListener('submit', addNewItem);
});

function markCompleted() {
    const listItems = document.querySelectorAll(".list-item");

    listItems.forEach(item => {
        item.classList.add("complete");
    })
}

// create the page load event here

document.addEventListener("DOMContentLoaded", () => {
    service = new ShoppingService();
    list = service.getShoppingList();

    displayListTitle();
    displayShoppingList();
    toggleAllItems();
});

