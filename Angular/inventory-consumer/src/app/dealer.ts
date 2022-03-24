export class Dealer {
    id: number=0;
    email: string="";
    fname: string="";
    lname: string="";
    password: string="";
    dob: Date | any;
    phoneNo:string="";
    street:string="";
    city:string="";
    pincode:string="";

    active: boolean=false;

    constructor(username:string,password:string){
        this.email = username;
        this.password = password;
    }
}
