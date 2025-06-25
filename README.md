# Asset Inventory Backend

This is the backend system for the Asset Inventory Management application, built using **Spring Boot** and **MySQL**. It provides RESTful APIs to manage assets such as computers, monitors, furniture, etc.

---

## 🛠 Tech Stack

- Java 17
- Spring Boot 3.5.x
- Spring Data JPA
- MySQL 8.x
- Maven
- HikariCP Connection Pool
- RESTful API

---

## 📁 Project Structure

src/
├── main/
│ ├── java/com/assetinventory/backend/
│ │ ├── controller/ # REST Controllers
│ │ ├── model/ # JPA Entities
│ │ ├── repository/ # JPA Repositories
│ │ └── AssetInventoryBackendApplication.java
│ └── resources/
│ ├── application.properties
│ └── ...


---

## ⚙️ Configuration

### 1. MySQL Setup

Create a database in MySQL:
```sql
CREATE DATABASE asset_inventory;


application.properties example 
        spring.datasource.url=jdbc:mysql://localhost:3306/asset_inventory
        spring.datasource.username=your_mysql_username
        spring.datasource.password=your_mysql_password

        spring.jpa.hibernate.ddl-auto=update
        spring.jpa.show-sql=true

        spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect

How to Run
Run from terminal
bash
Copy
Edit
./mvnw spring-boot:run
Or run from IntelliJ IDEA:
Right-click AssetInventoryBackendApplication.java → Run

Server will start at:

arduino
Copy
Edit
http://localhost:8080



API Endpoints
Method	Endpoint	Description
GET	/api/assets	Get all assets
POST	/api/assets	Create new asset
GET	/api/assets/{id}	Get asset by ID
PUT	/api/assets/{id}	Update asset by ID
DELETE	/api/assets/{id}	Delete asset by ID



📦 Sample JSON for POST
json
Copy
Edit
{
  "name": "Chair",
  "type": "Furniture",
  "location": "Meeting Room"
}



📄 License
This project is for educational/demo purposes. No license attached.

yaml
Copy
Edit

---

### ✅ What to Do With It:
- Save it as `README.md` in your `backend/` folder
- Run:
```bash
git add README.md
git commit -m "Add README for backend"
git push
