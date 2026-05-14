```mermaid

classDiagram
    %% ==========================================
    %% ÇEKİRDEK (CORE) MİMARİ
    %% ==========================================
    class GameObject {
        <<abstract>>
        #String type
        #String name
        #int health
        #int damage
        +GameObject(String, String, int, int)
        +update()*
        +attack()*
        +render()*
    }

    %% ==========================================
    %% FAZ 1: YARATIMSAL (CREATIONAL) ÖRÜNTÜ - FACTORY
    %% ==========================================
    class C_Player {
        +update()
        +attack()
        +render()
    }
    class C_Enemy {
        +update()
        +attack()
        +render()
    }
    class C_Item {
        +update()
        +attack()
        +render()
    }

    class GameObjectFactory {
        <<Factory>>
        +createPlayer(String, int, int) GameObject$
        +createEnemy(String, int, int) GameObject$
        +createItem(String, int, int) GameObject$
    }

    %% ==========================================
    %% FAZ 2: YAPISAL (STRUCTURAL) ÖRÜNTÜ - DECORATOR
    %% ==========================================
    class GameObjectDecorator {
        <<abstract>>
        #GameObject decoratedObject
        +GameObjectDecorator(GameObject)
        +update()
        +attack()
        +render()
    }
    class LightsaberDecorator {
        +attack()
        +render()
    }
    class ShieldDecorator {
        +update()
        +render()
    }

    %% ==========================================
    %% FAZ 2: YAPISAL (STRUCTURAL) ÖRÜNTÜ - COMPOSITE
    %% ==========================================
    class GameObjectGroup {
        -List~GameObject~ members
        +GameObjectGroup(String)
        +addMember(GameObject)
        +removeMember(GameObject)
        +update()
        +attack()
        +render()
    }

    %% ==========================================
    %% İLİŞKİLER VE BAĞLANTILAR (RELATIONSHIPS)
    %% ==========================================
    
    %% Temel Miras Alma (Inheritance) - Faz 1
    GameObject <|-- C_Player
    GameObject <|-- C_Enemy
    GameObject <|-- C_Item
    
    %% Factory Üretim Bağlantıları (Dependency)
    GameObjectFactory ..> C_Player : Üretir
    GameObjectFactory ..> C_Enemy : Üretir
    GameObjectFactory ..> C_Item : Üretir
    
    %% Decorator Miras ve Sarmalama (Aggregation) - Faz 2
    GameObject <|-- GameObjectDecorator : Miras
    GameObjectDecorator o-- GameObject : Sarmalar (Aggregation)
    GameObjectDecorator <|-- LightsaberDecorator
    GameObjectDecorator <|-- ShieldDecorator
    
    %% Composite Miras ve İçerme (Composition) - Faz 2
    GameObject <|-- GameObjectGroup : Miras
    GameObjectGroup *-- GameObject : İçerir (Composition)
    ```