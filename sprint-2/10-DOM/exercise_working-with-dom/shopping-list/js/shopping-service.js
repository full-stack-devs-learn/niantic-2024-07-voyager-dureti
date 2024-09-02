class ShoppingService {

    getListName() {
        return "Shopping Lists"
    }

    getShoppingList() {
        return [
            {
                id: 1,
                title: '5 lb sack of potatoes',
                quantity: 1,
                isComplete: false
            },
            {
                id: 2,
                title: 'Frozen Pizza',
                quantity: 4,
                isComplete: true
            },
            {
                id: 3,
                title: '2 lb Tomato',
                quantity: 1,
                isComplete: false
            },
            {
                id: 4,
                title: '2 Bags of Chips',
                quantity: 2,
                isComplete: true
    
            },
            {
                id: 5,
                title: 'Frozen Mixed Vegetables',
                quantity: 2,
                isComplete: false
            },
            {
                id: 6,
                title: '3 lb Ground Beef',
                quantity: 1,
                isComplete: false
            },
            {
                id: 7,
                title: '1 Gallon of Milk',
                quantity: 1,
                isComplete: false
            },
            {
                id: 8,
                title: 'Loaf of Bread',
                quantity: 2,
                isComplete: true
            },
            {
                id: 9,
                title: '4 Apples',
                quantity: 4,
                isComplete: false
            },
            {
                id: 10,
                title: 'Dozen Eggs',
                quantity: 1,
                isComplete: true
            }
        ];
    }
}