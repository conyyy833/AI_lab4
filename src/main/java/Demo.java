import java.util.*;

public class Demo {
    public static void main(String[] args) {

        //输入用户总量
        Userset.UserSet userSet = new Userset.UserSet();
        userSet.put("Tom")
                .set("Cardiovascular Department", 50)
                .set("Respiratory Medicine", 30)
                .set("Pediatrics", 45)
                .set("Gynecology", 50)
                .set("ophthalmology", 30)
                .set("Otorhinolaryngology", 45)
                .set("Stomatology", 50)
                .create();

        userSet.put("BOb")
                .set("dermatology", 40)
                .set("Pediatrics", 30)
                .set("ophthalmology", 50)
                .set("Otorhinolaryngology", 50)
                .set("Stomatology", 30)
                .set("Psychology", 30)
                .create();


        userSet.put("Amy")
                .set("dermatology", 20)
                .set("Cardiovascular Department", 50)
                .set("ophthalmology", 30)
                .set("Gynecology", 50)
                .set("Otorhinolaryngology", 45)
                .set("Rehabilitation Medicine", 50)
                .create();

        userSet.put("Alice")
                .set("dermatology", 50)
                .set("Cardiovascular Department", 30)
                .set("ophthalmology", 40)
                .set("Scald", 40)
                .set("Rehabilitation Medicine", 35)
                .set("Stomatology", 35)
                .set("Psychology", 45)
                .create();

        userSet.put("Cony")
                .set("dermatology", 20)
                .set("Cardiovascular Department", 40)
                .set("Pediatrics", 45)
                .set("Gynecology", 50)
                .set("ophthalmology", 20)
                .create();

        userSet.put("Jerry")
                .set("Pediatrics", 50)
                .set("Laboratory", 50)
                .set("ophthalmology", 30)
                .set("Rehabilitation Medicine", 50)
                .set("Physical examination", 45)
                .set("Gynecology", 40)
                .set("Psychology", 35)
                .create();

        userSet.put("Max")
                .set("Pediatrics", 50)
                .set("Cardiovascular Department", 40)
                .set("ophthalmology", 10)
                .set("Cardiac surgery", 50)
                .set("Hematology", 40)
                .set("The Strokes", 50)
                .create();

        userSet.put("Iris")
                .set("dermatology", 40)
                .set("ophthalmology", 45)
                .set("Scald", 45)
                .set("Hematology", 25)
                .set("Gastroenterology", 30)
                .create();


        Recommend recommend = new Recommend();
        List<Userset.UserSet.Set> recommendations = recommend.recommend("小明", userSet);
        System.out.println("-----------------------");
        for (Userset.UserSet.Set set : recommendations) {
            System.out.println(set.username+" "+set.score);
        }
    }



}








