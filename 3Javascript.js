
function calculateBill(items) {
    let total = 0;

    console.log("----- Shopping Bill -----");

    for (let item of items) {
        console.log(item.name + " : ₹" + item.price);
        total += item.price;
    }

    let discount = total > 1000 ? total * 0.10 : 0;
    let finalAmount = total - discount;

    console.log("-------------------------");
    console.log("Total: ₹" + total);
    console.log("Discount: ₹" + discount);
    console.log("Final Amount: ₹" + finalAmount);
}

let products = [
    { name: "Laptop", price: 50000 },
    { name: "Mouse", price: 500 },
    { name: "Keyboard", price: 1200 }
];

calculateBill(products);
