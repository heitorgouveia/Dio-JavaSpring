# Readme
Diagrama de Classes Mermaid gerado a partir do chatGPT e JSON.

## Diagrama de classes 
```mermaid
classDiagram
    class User {
        +String name
        +Account account
        +Feature [] feature
        +Card card
        +News [] news
    }

    class Account {
        +String agency
        +String number
        +String balance
        +String limit
    }

    class Feature {
        +String icon
        +String description
    }

    class Card {
        +String number
        +String limit
    }

    class News {
        +String icon
        +String description
    }

    User "1"*-- "1"Account
    User "1"*-- "1"Card
    User "1"*-- "n"Feature
    User "1"*-- "n" News
