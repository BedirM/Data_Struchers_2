public class tekyonliste {
    Node head = null;
    Node tail = null;
void basekle(int x){
    Node eleman = new Node();
    eleman.data = x;

    if(head == null){
        eleman.next= null;
        head = eleman;
        tail = eleman;
        System.out.println("liste oluşturuldu ilk eleman eklendi");
    }
    else{
        eleman.next = head;
        head = eleman;
        System.out.println("başa eleman eklendi");
    }


}
    void sonaekle(int x){
        Node eleman = new Node();
        eleman.data = x;

        if(head == null){
            eleman.next= null;
            head = eleman;
            tail = eleman;
            System.out.println("liste oluşturuldu ilk eleman eklendi");
        }
        else{
            eleman.next = null;
            tail.next = eleman;
            tail = eleman;
            System.out.println("sona eleman eklendi");
        }


    }
    void yazdir(){

        if(head == null){

            System.out.println("lise yapısı boş");
        }
        else{
            Node temp = head;
            while(temp !=null){
                System.out.println(temp.data);
                temp = temp.next;
            }

        }


    }





}
