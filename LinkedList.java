class LinkedList {
    
    private class Node{
        int data;
        Node next;
    }
    
    private Node head;
    private Node tail;
    private int size;
    
    //O(n)
    public void display()  //displaying elements
    {
        Node temp = this.head;
        
        while(temp!=null){
            System.out.println("Value is: "+temp.data);
            temp=temp.next;
        }
    }
    
    //O(1)
    public void addLast(int item) //adding elements at the last of the linked list
    {
        // first create a new Node
        
        Node nn = new Node();
        nn.data=item;
        nn.next=null;
        
        if(this.size==0){
            this.head=nn;
            this.tail=nn;
            this.size++;
        }
        else{
            this.tail.next=nn;
            this.tail=nn;
            size++;
        }
    }
    
    //O(1)
    public void addFirst(int item)  //adding elements at the start of the linkedList
    {
        // Create a new Node
        
        Node nn = new Node();
        nn.data=item;
        nn.next=null;
        
        if(this.size==0){
            this.head=nn;
            this.tail=nn;
            this.size++;
        }
        else{
            nn.next=this.head;
            this.head=nn;
            size++;
        }
    }
    
    //O(1)
    public int getFirst() throws Exception
    {
        if(this.size==0){
            throw new Exception("LL is empty");
        }
        return this.head.data;
    }
    
    //O(1)
    public int getLast() throws Exception
    {
        if(this.size==0){
            throw new Exception("LL is empty");
        }
        return this.tail.data;
    }
    
    public int getAt(int index) throws Exception
    {
        if(this.size==0){
            throw new Exception("LL is empty");
        }
        if(index<0 || index>this.size){
            throw new Exception("Invalid index");
        }
        
        Node temp = this.head;
        for(int i=1;i<=index;i++){
            temp=temp.next;
        }
        return temp.data;
    }
    
    //O(n)
    private Node getNodeAt(int index) throws Exception
    {
        if(this.size==0){
            throw new Exception("LL is empty");
        }
        if(index<0 || index>this.size){
            throw new Exception("Invalid index");
        }
        
        Node temp = this.head;
        for(int i=1;i<=index;i++){
            temp=temp.next;
        }
        return temp;
    }
    
    //O(n)
    public void addAt(int item, int index) throws Exception
    {
        if(index<0 || index>=this.size){
            throw new Exception("Invalid index");
        }
        
        if(index==0)
            addFirst(item);
        else if(index==this.size)
            addLast(item);
        else{
            Node nn = new Node();
            nn.data=item;
            nn.next=null;
            
            Node np=getNodeAt(index-1);
            Node na=getNodeAt(index);
            np.next=nn;
            nn.next=na;
            this.size++;
        }
    }
    
    //O(1)
    public int removeFirst() throws Exception
    {
        if(this.size==0){
            throw new Exception("LL is empty");
        }
        
        int rv = this.head.data;
        if(this.size==1){
            this.head=null;
            this.tail=null;
            this.size=0;
        }
        
        else{
            this.head=this.head.next;
            this.size--;
        }

        return rv;
    }
    
    //O(n)
    public int removeLast() throws Exception
    {
        if(this.size==0){
            throw new Exception("LL is empty");
        }
        
        int rv = this.tail.data;
        
        if(this.size==1){
            this.head=null;
            this.tail=null;
            this.size=0;
        }
        else{
            Node np=getNodeAt(this.size-2);
            this.tail=np;
            this.tail.next=null;
            this.size--;
        }
        return rv;
    }
    
    //O(n)
    public int removeAt(int index) throws Exception
    {
        int rv=0;
        if(this.size==0){
            throw new Exception("LL is empty");
        }
        if(index<0 || index>=this.size){
            throw new Exception("Invalid index");
        }
        
        if(index==0){
            return removeFirst();
        }
        else if(index==this.size-1){
            return removeLast();
        }
        
        else{
            Node nm1 = getNodeAt(index-1);
            Node nn = getNodeAt(index);
            Node np1 = getNodeAt(index+1);
            rv=nn.data;
            nm1.next=np1;
            this.size--;
        }
        
        return rv;
    }
    
    public void reverseLLData() throws Exception
    {
        int temp=0;
        int left = 0;
        int right = this.size-1;
        
        while(left<right){
            Node ln=getNodeAt(left);
            Node rn=getNodeAt(right);

            temp=ln.data;
            ln.data=rn.data;
            rn.data=temp;

            left++;
            right--;
        }
    }

    public void reverseLLPointers()
    {
        Node prev = this.head;
        Node curr = prev.next;

        while(curr!=null){
            Node ahead = curr.next;
            curr.next=prev;
            prev=curr;
            curr=ahead;
        }

        Node t=this.head;
        this.head=this.tail;
        this.tail=t;

        this.tail.next=null;
    }

    public int midNode()
    {
        Node one = this.head;
        Node two = this.head;

        while(two.next!=null && two.next.next!=null){
            one=one.next;
            two=two.next.next;
        }
        return one.data;
    }

    public int kthNodeFromEnd(int k) throws Exception
    {
        if(k<0 || k>this.size){
            throw new Exception("Invalid k value");
        }

        Node ln=this.head;
        Node rn=this.head;

        for(int i=1;i<=k;i++){
            rn=rn.next;
        }

        while(rn!=null){
            ln=ln.next;
            rn=rn.next;
        }
        return ln.data;
    }
}



public class Main
{
	public static void main(String[] args) throws Exception{
		LinkedList list = new LinkedList();
		
		list.addFirst(10);
		list.addLast(20);
		list.addLast(30);
		list.addFirst(40);
		list.addFirst(50);
		
		list.display();
		System.out.println("-------------------");
		System.out.println("First element is: "+ list.getFirst());
        System.out.println("-------------------");
		System.out.println("Last element is: "+ list.getLast());
        System.out.println("-------------------");
        list.reverseLLData();
        list.display();
        System.out.println("-------------------");
        list.reverseLLPointers();
        list.display();
        System.out.println("-------------------");
        System.out.println(list.midNode()); 
        System.out.println("-------------------");
        System.out.println(list.kthNodeFromEnd(2));
        System.out.println("-------------------");
        System.out.println(list.removeAt(2));
	}
}
