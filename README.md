# Personal Finance Manager

A full-stack web application that empowers users to take control of their finances by tracking income, expenses, and budgets in one centralized, secure platform.

## 🎯 Overview

Personal Finance Manager is a modern financial management tool designed to help individuals and families organize their financial life. With secure authentication, intuitive dashboards, and powerful analytics, managing your money has never been easier.

## ✨ Features

- **Secure Authentication** - Industry-standard encryption and secure login/registration
- **Income Tracking** - Record and categorize all income sources
- **Expense Management** - Log and organize expenses with detailed categorization
- **Budget Planning** - Create and monitor budgets for different categories
- **Financial Dashboard** - Visual representation of your financial health
- **Transaction History** - Complete audit trail of all financial activities
- **Category Management** - Customizable spending categories
- **Reports & Analytics** - Detailed financial reports and insights
- **Data Export** - Export your financial data in multiple formats
- **Responsive Design** - Works seamlessly on desktop, tablet, and mobile devices

## 🛠️ Tech Stack

- **Backend**: Java (100%)
- **Framework**: Spring Boot
- **Architecture**: Full-stack web application with robust backend services
- **Database**: MySQL/PostgreSQL relational database
- **Frontend**: Modern responsive UI with HTML, CSS, JavaScript
- **Build Tool**: Maven

## 📋 Prerequisites

- Java 11 or higher
- Apache Maven 3.6+
- MySQL 8.0+ or PostgreSQL 12+
- Git
- Modern web browser (Chrome, Firefox, Safari, Edge)

## 🚀 Installation

### Clone the Repository
```bash
git clone https://github.com/ShravanOfficial-09/Personal-Finance-Manager.git
cd Personal-Finance-Manager
```

### Backend Setup

1. **Configure Database**
```bash
# Create a database
mysql -u root -p
CREATE DATABASE personal_finance_manager;
```

2. **Update application.properties**
Edit `src/main/resources/application.properties`:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/personal_finance_manager
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
server.port=8080
```

3. **Build and Run**
```bash
# Build the project
mvn clean install

# Run the application
mvn spring-boot:run
```

The application will be available at `http://localhost:8080`

## 💻 Usage

### Getting Started

1. **Register Account**
   - Navigate to the registration page
   - Enter your email and create a secure password
   - Verify your email address

2. **Set Up Categories**
   - Create custom spending categories
   - Set up income categories
   - Organize by your preferences

3. **Add Transactions**
   - Record income and expenses
   - Categorize each transaction
   - Add notes for future reference

4. **Create Budgets**
   - Set monthly or yearly budgets
   - Define spending limits per category
   - Monitor progress toward your goals

5. **View Analytics**
   - Check your financial dashboard
   - Review spending trends
   - Generate detailed reports

## 📚 Project Structure

```
Personal-Finance-Manager/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/finance/manager/
│   │   │       ├── controller/        # REST API endpoints
│   │   │       ├── service/           # Business logic
│   │   │       ├── repository/        # Database access (JPA)
│   │   │       ├── model/             # Entity classes
│   │   │       ├── dto/               # Data Transfer Objects
│   │   │       ├── security/          # Authentication & authorization
│   │   │       └── utils/             # Utility classes
│   │   └── resources/
│   │       ├── application.properties # Configuration
│   │       └── templates/             # HTML templates
│   └── test/
│       └── java/                      # Unit and integration tests
├── pom.xml                            # Maven dependencies
├── .gitignore
└── README.md                          # This file
```

## 🔐 Security Features

- **Password Encryption** - BCrypt hashing for secure password storage
- **JWT Authentication** - Secure token-based authentication
- **Data Validation** - Input validation and sanitization
- **SQL Injection Protection** - Parameterized queries with JPA
- **HTTPS Support** - Secure data transmission
- **Role-Based Access Control** - User-specific data isolation
- **CSRF Protection** - Spring Security CSRF tokens
- **Session Management** - Secure session handling

## 🧪 Testing

```bash
# Run all tests
mvn test

# Run specific test class
mvn test -Dtest=TransactionServiceTest

# Run with coverage report
mvn clean test jacoco:report
```

## 📊 API Endpoints

### Authentication
- `POST /api/auth/register` - Register new user
- `POST /api/auth/login` - User login
- `POST /api/auth/logout` - User logout
- `POST /api/auth/refresh` - Refresh JWT token

### User Management
- `GET /api/users/profile` - Get user profile
- `PUT /api/users/profile` - Update user profile
- `DELETE /api/users/account` - Delete account

### Transactions
- `GET /api/transactions` - Get all transactions
- `GET /api/transactions/{id}` - Get specific transaction
- `POST /api/transactions` - Create new transaction
- `PUT /api/transactions/{id}` - Update transaction
- `DELETE /api/transactions/{id}` - Delete transaction
- `GET /api/transactions/category/{category}` - Get transactions by category

### Categories
- `GET /api/categories` - Get all categories
- `POST /api/categories` - Create new category
- `PUT /api/categories/{id}` - Update category
- `DELETE /api/categories/{id}` - Delete category

### Budget Management
- `GET /api/budgets` - Get all budgets
- `GET /api/budgets/{id}` - Get specific budget
- `POST /api/budgets` - Create new budget
- `PUT /api/budgets/{id}` - Update budget
- `DELETE /api/budgets/{id}` - Delete budget
- `GET /api/budgets/{id}/progress` - Get budget progress

### Reports & Analytics
- `GET /api/reports/summary` - Financial summary
- `GET /api/reports/expenses` - Expense analysis
- `GET /api/reports/income` - Income analysis
- `GET /api/reports/spending-trends` - Spending trends
- `GET /api/reports/category-breakdown` - Category-wise breakdown
- `GET /api/reports/export` - Export financial data

## 🤝 Contributing

We welcome contributions! Here's how:

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

### Contribution Guidelines
- Follow Java coding conventions (Google Java Style Guide)
- Write unit tests for new features (aim for 80%+ coverage)
- Update documentation as needed
- Keep commits atomic and descriptive
- Follow REST API design principles

## 📝 License

This project is licensed under the MIT License - see the LICENSE file for details.

## 🐛 Bug Reports & Feature Requests

Found a bug? Have a feature idea? Please open an issue on GitHub with:
- Clear description of the issue
- Steps to reproduce (for bugs)
- Expected vs actual behavior
- Screenshots if applicable
- System information (OS, Java version, etc.)

## 💬 Support & Contact

- **GitHub Issues**: [Open an issue](https://github.com/ShravanOfficial-09/Personal-Finance-Manager/issues)
- **Email**: support@personalfinancemanager.com
- **Documentation**: Check the [Wiki](https://github.com/ShravanOfficial-09/Personal-Finance-Manager/wiki)

## 👨‍💻 Author

**Shravan Official**
- GitHub: [@ShravanOfficial-09](https://github.com/ShravanOfficial-09)

## 🙏 Acknowledgments

- Built with Spring Boot framework
- Database management with Hibernate JPA
- Security powered by Spring Security
- API documentation with Swagger/Springdoc
- Frontend built with modern web technologies

## 📈 Roadmap

- [ ] Mobile app (iOS/Android using React Native)
- [ ] Multi-currency support
- [ ] Advanced reporting with interactive charts
- [ ] Bill reminders and push notifications
- [ ] Investment tracking and portfolio management
- [ ] Tax report generation
- [ ] API for third-party integrations
- [ ] Recurring transactions/recurring bills
- [ ] Data import from bank statements
- [ ] Budget forecasting with ML

---

⭐ If you find this project helpful, please give it a star and share it with others!

**Happy Financial Managing!** 💰