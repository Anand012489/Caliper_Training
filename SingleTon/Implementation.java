package SingleTon;

public class Implementation{
    //Here I am declaring a private variable to hold the single instance
    private static Implementation instance;

    //Here I am making the constructor private
    private Implementation(){}

    //Now I am providing the public static mehod to return the single instance
        public static Implementation getInstance(){

            //Now I am creating the instance if it is not existing
            if(instance==null){
                instance=new Implementation();
            }

            return instance;
        }

    }


