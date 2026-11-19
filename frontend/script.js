let item = 2;
let quantity = 3;
let price;
let total;

switch (item) {
    case 1:
        price = 100;
        console.log("Item: Pen");
        break;

    case 2:
        price = 50;
        console.log("Item: Notebook");
        break;

    case 3:
        price = 20;
        console.log("Item: Pencil");
        break;

    case 4:
        price = 500;
        console.log("Item: School Bag");
        break;

    default:
        console.log("Invalid item selection");
        price = 0;
}

if (price > 0) {
    total = price * quantity;

    console.log("Price per item: " + price);
    console.log("Quantity: " + quantity);
    console.log("Total Amount: " + total);
}