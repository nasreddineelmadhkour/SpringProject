# Projet d'Initiation à Spring Boot

Ce projet est une introduction à l'utilisation de Spring Boot 2.7.3 et du JDK 1.8. Il se concentre sur la création d'un projet basique avec des repositories, des controllers, des entities, des services et des interfaces.

## Fonctionnalités

<ul>
    <li><strong>Configuration Initiale</strong> : Configuration de base de Spring Boot pour démarrer rapidement.</li>
    <li><strong>Controllers REST</strong> : Création de contrôleurs pour gérer les requêtes HTTP.</li>
    <li><strong>Services</strong> : Mise en place de services pour encapsuler la logique métier.</li>
    <li><strong>Repositories</strong> : Utilisation de Spring Data JPA pour l'interaction avec une base de données.</li>
    <li><strong>Entities</strong> : Définition des entités JPA représentant les tables de la base de données.</li>
    <li><strong>Interfaces</strong> : Création d'interfaces pour la couche service et repository.</li>
</ul>

## Prérequis

Avant de commencer, assurez-vous d'avoir les éléments suivants installés sur votre machine :

<ul>
    <li><a href="https://www.oracle.com/java/technologies/javase-downloads.html">Java JDK 1.8</a></li>
    <li><a href="https://maven.apache.org/download.cgi">Maven 3.6.3 ou plus</a></li>
    <li>Un IDE tel que <a href="https://www.jetbrains.com/idea/">IntelliJ IDEA</a> ou <a href="https://www.eclipse.org/">Eclipse</a></li>
</ul>

## Installation

1. Clonez le dépôt :

    ```bash
    git clone https://github.com/votre-utilisateur/votre-repo.git
    cd votre-repo
    ```

2. Compilez le projet avec Maven :

    ```bash
    mvn clean install
    ```

3. Lancez l'application :

    ```bash
    mvn spring-boot:run
    ```

L'application sera disponible à l'adresse `http://localhost:8080`.

## Structure du Projet

Le projet est structuré comme suit :

- `src/main/java/com/votre-utilisateur/votre-projet/`
  - `controller` : Contient les contrôleurs REST.
  - `service` : Contient les services.
  - `repository` : Contient les repositories Spring Data JPA.
  - `entity` : Contient les entités JPA.
  - `interface` : Contient les interfaces des services et repositories.

## Utilisation

Voici quelques exemples de points d'accès que vous pouvez tester :

<ul>
    <li><code>GET /api/ressource</code> : Récupérer toutes les ressources.</li>
    <li><code>POST /api/ressource</code> : Créer une nouvelle ressource.</li>
    <li><code>GET /api/ressource/{id}</code> : Récupérer une ressource par son identifiant.</li>
    <li><code>PUT /api/ressource/{id}</code> : Mettre à jour une ressource existante.</li>
    <li><code>DELETE /api/ressource/{id}</code> : Supprimer une ressource.</li>
</ul>

## Contribution

Les contributions sont les bienvenues ! Si vous avez des suggestions ou des améliorations, n'hésitez pas à ouvrir une issue ou une pull request.

## Licence

Ce projet est sous licence MIT. Voir le fichier [LICENSE](LICENSE) pour plus de détails.

## Remerciements

<ul>
    <li><a href="https://spring.io/projects/spring-boot">Spring Boot Documentation</a></li>
    <li><a href="https://start.spring.io/">Spring Initializr</a></li>
</ul>
