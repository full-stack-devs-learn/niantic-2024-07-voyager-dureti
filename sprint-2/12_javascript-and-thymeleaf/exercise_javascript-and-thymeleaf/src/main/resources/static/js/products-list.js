document.addEventListener("DOMContentLoaded", () => {
 loadPage()

});
function loadPage()
{
    const url = `/api/products/category/${categoryId}`;
    fetch(url).then(response => {
        return response.json();
    })
        .then(data => {
            const tbody = document.getElementById("product-container");
            tbody.innerHTML = "";

            data.forEach(product => {
                displayProduct(product, tbody)
            })
        })
        .catch(error => {
            console.log(error);
        })
}