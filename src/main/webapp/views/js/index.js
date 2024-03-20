// This function will be called when the user clicks the "Toggle Theme" button
function toggleTheme() {
    const body = document.body;
    // Check if the body has the class 'dark-theme'
    if (body.classList.contains('dark-theme')) {
        // If it does, remove it
        body.classList.remove('dark-theme');
    } else {
        // If it doesn't, add it
        body.classList.add('dark-theme');
    }
}

// This function will be called when the page loads
window.onload = function() {
    // Find the "Toggle Theme" button
    const toggleThemeButton = document.getElementById('toggle-theme-button');
    // Add an event listener to the button
    toggleThemeButton.addEventListener('click', toggleTheme);
};