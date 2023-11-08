// Kişi listesi sınıfı tanımlama
class ContactList {
    // Kişi listesini tutan ArrayList yapısı
    private ArrayList<Person> contacts;
  
    // Kişi listesi sınıfının yapıcı metodu
    public ContactList() {
      contacts = new ArrayList<Person>();
    }
  
    // Kişi listesine yeni bir kişi ekleyen metot
    public void addContact(Person person) {
      contacts.add(person);
    }
  
    // Kişi listesinden verilen ad veya soyada göre kişi arayan metot
    public Person searchContact(String name) {
      // Kişi listesini döngü ile gezme
      for (Person person : contacts) {
        // Eğer kişinin adı veya soyadı aranan isimle eşleşiyorsa, kişiyi döndürme
        if (person.getFirstName().equals(name) || person.getLastName().equals(name)) {
          return person;
        }
      }
      // Eğer eşleşen kişi bulunamazsa, null döndürme
      return null;
    }
  }
  