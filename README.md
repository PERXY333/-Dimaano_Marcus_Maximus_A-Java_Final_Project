Instructions:
To open the file, press the PlaNT Management System
Enter your choice upon or under the text.

Sdg:
Sustainable Development Goal 15: Life on Land aims to protect, restore, and promote the sustainable use of terrestrial ecosystems, halt deforestation, combat desertification, and halt biodiversity loss. 
This goal is directly relevant to terreSTRIAL, a platform for trading and selling plants.
As the project involves plant commerce, it must address environmental sustainability and promote practices that align with SDG 15. 
If poorly managed, such a platform could contribute to habitat destruction, the spread of invasive species, or the illegal trade of endangered plants, all of which conflict with the goal's objectives.

Brief Overview:
The SuperPlant feature is a module within terreSTRIAL designed to manage plant data. It allows users to add plants to a database with relevant details such as the plant name, type, and special characteristics. Once plants are added, users can view the compiled list, showcasing all plants along with their details in an organized format. This feature simplifies plant inventory management, ensuring seamless interactions for sellers and buyers.

ABSTRATION:
The Plant class serves as an abstract blueprint for all plant types. It cannot be instantiated directly, ensuring only subclasses like GenericPlant can define specific behavior.

Polymorphism:
The describePlant() method is overridden in the GenericPlant subclass to provide a specific implementation. This demonstrates polymorphism because the behavior of this method depends on the class of the object calling it.

 Encapsulation:
 The fields like name and type are marked private, preventing direct access from outside the class. This protects the integrity of the data by restricting modifications.

Inheritance:
The GenericPlant class inherits the fields and methods of the Plant class. This avoids rewriting the same code and simplifies code maintenance.
