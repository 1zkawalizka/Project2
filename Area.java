import java.io.*;
import dataStructures.*;
public class Area implements Serializable {
    private String name;
    //we are adding bounds
    private Bounds bounds;
    //key-String, name of the place fe. pizzeria   value-service type
    //we use bstmap to have everything in order without additional logic
    private BSTMap<String, Service> serviceByName;
    //map/list of students, key-fex. name of the student, value-student but type
    //w3e use hashtable because it has low time compleity and in the same time its perfect to fast check the infos we need
    private HashTable<String,Student> studentsMap;

    public Area(String name, Bounds bounds,BSTMap<String,Service> serviceByName,HashTable<String, Student> studentsMap)
    {
        this.name=name;
        this.name=bounds;
        this.serviceByName=serviceByName;
        this.studentsMap=studentsMap;

        public void addService(Service s)
        {
            if(s!=null)
            {
                //based on the method from bstmap we can add just our service name as a key , and service as a value
                serviceByName.put(s.getName(),s);
            }
        }

        public void addStudent(Student s)
        {
            if(s!=null)
            {
                //we do the same as add service but as a key we have name of the student, and value is the type of student
                studentsMap.put(s.getName(),s)
            }
        }

        public BSTMap<String, Service> getService(){return serviceByName;}

        public HashTable<String, Student> getStudents(){return studentsMap;}

        public Service findServiceByName(String name)
        {
            return serviceByName.get(name);
        }

        public void saveToFile()
        {
            try
            {
                ObjectOutputStream file=new ObjectOutputStream(new FileOutputStream("Area_list"));

                file.writeObject(this);
                file.close();
            }
            catch(IOException e)
            {
                System.out.println("Error while saving informations to file");
            }
        }


    }

}
