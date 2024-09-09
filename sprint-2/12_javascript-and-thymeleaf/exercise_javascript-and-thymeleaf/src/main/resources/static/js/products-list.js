let categoryId = 1;

document.addEventListener("DOMContentLoaded", () => {
    const categoryOption = document.getElementById("category");

    categoryOption.addEventListener("change", () => {
        categoryId = categoryOption.value;
        loadPage();
 });


    categoryId = categoryOption.value;
    loadPage();
});

function loadPage() {
    const container = document.getElementById("product-container");
    container.innerHTML = "";

    const url = `/products/category/${categoryId}`;

    fetch(url)
        .then(response => {
            if (response.status === 200) {
                return response.text();
            }
            throw new Error(response.statusText);
        })
        .then(data => {
            container.innerHTML = data;
        })
        .catch(error => {
            console.error(error);
        });
}
