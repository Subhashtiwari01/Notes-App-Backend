# Notes-App-Backend


The NotesController class is a REST controller responsible for handling HTTP requests related to managing notes in the notesProject application. It provides endpoints for adding, fetching, and deleting notes.

## Endpoints

### `POST /addNote`

Adds a new note to the database.

#### Request Body

- `notes`: JSON object representing the note to be added.

#### Response

- Returns the newly added note.

### `GET /allNotes`

Retrieves all notes from the database.

#### Response

- Returns a list of all notes stored in the database.

### `GET /getNotesById/{id}`

Retrieves a specific note by its ID from the database.

#### Path Parameters

- `id`: ID of the note to retrieve.

#### Response

- Returns the note with the specified ID if found.
- Returns a 404 Not Found response if no note is found with the given ID.

### `DELETE /deleteNotes/{id}`

Deletes a note from the database by its ID.

#### Path Parameters

- `id`: ID of the note to delete.

#### Response

- Returns a success message indicating that the note has been deleted.
- Returns a 404 Not Found response if no note is found with the given ID.

## Dependencies

- **Spring Boot**: This controller is built using the Spring Boot framework for handling HTTP requests and managing the application's business logic.
- **Spring Data JPA**: This controller interacts with a database using Spring Data JPA repositories.
- **Java Persistence API (JPA)**: This controller utilizes JPA for object-relational mapping.

## Usage

To use the NotesController in your Spring Boot application, follow these steps:

1. **Create Notes Entity**: Define the Notes entity class with appropriate fields and annotations for JPA mapping.

2. **Create NotesServices**: Implement the NotesServices class to handle business logic related to notes.

3. **Configure Database**: Configure the database connection details in your `application.properties` or `application.yml` file.

4. **Add Controller**: Create the NotesController class and define the REST endpoints for managing notes.

5. **Run Application**: Run your Spring Boot application, and the NotesController endpoints will be accessible at the specified paths.


Feel free to use, modify, and distribute this controller in your projects. If you encounter any issues or have suggestions for improvements, please open an issue or submit a pull request.

## Subhash_Tiwari
