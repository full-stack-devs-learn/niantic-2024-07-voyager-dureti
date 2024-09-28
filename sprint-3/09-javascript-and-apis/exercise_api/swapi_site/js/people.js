let peopleService = new PeopleService();
let currentPage = 1;

document.addEventListener('DOMContentLoaded', () => {
    displayPeople(currentPage);

    const previousButton = createButton('Previous', () => changePage(-1));
    previousButton.disabled = true; 

    const nextButton = createButton('Next', () => changePage(1));
    document.body.append(previousButton, nextButton);
});

async function displayPeople(page) {
    try {
        console.log(`Fetching data for page: ${page}`);
        const peopleList = await peopleService.getPeople(page);
        console.log(`Data received for page ${page}:`, peopleList);

        const listContainer = document.getElementById('people-list') || document.createElement('ul');
        listContainer.id = 'people-list';
        listContainer.innerHTML = ''; 

        peopleList.forEach(person => {
            const listItem = document.createElement('li');
            listItem.textContent = person.name;
            listContainer.appendChild(listItem);
        });

        document.body.appendChild(listContainer);
    } catch (error) {
        console.error('Error displaying people:', error);
        alert('Failed to load people from SWAPI.');
    }
}

async function changePage(offset) {
    currentPage += offset; 
    console.log(`Changing to page: ${currentPage}`);
    await displayPeople(currentPage);

    const previousButton = document.querySelector('button:nth-of-type(1)');
    previousButton.disabled = currentPage === 1; 
}


function createButton(text, clickHandler) {
    const button = document.createElement('button');
    button.innerText = text;
    button.addEventListener('click', clickHandler);
    return button;
}