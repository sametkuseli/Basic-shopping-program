package exp2;

import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intTemp;
		boolean boolTemp;
		double doubleTemp;
		
		ArrayList<person> userList = new ArrayList<person>();
		ArrayList<items> itemList = new ArrayList<items>();
		ArrayList<campaign> campaignList = new ArrayList<campaign>();
		
		try {
			Scanner scanner = new Scanner(new File(args[0]));
			while(scanner.hasNextLine()){
			String line = scanner.nextLine();
			
			
			String[] sepLine = line.split("\t");
			
			switch(sepLine[0]){
			
			case "ADMIN":
				intTemp = Integer.parseInt(sepLine[4]);
			
				person adminobj = new admin(sepLine[1],sepLine[2],sepLine[3],intTemp,sepLine[5]);
				
				userList.add(adminobj);
				
				
				break;
			case "CUSTOMER":
				doubleTemp= Double.parseDouble(sepLine[4]);
				person customerObj = new customer(sepLine[1],sepLine[2],sepLine[3],doubleTemp,sepLine[5]);
				userList.add(customerObj);
				break;
			case "TECH":
				intTemp= Integer.parseInt(sepLine[4]);
				boolTemp = getBoolVal(sepLine[5]);
				person techObj = new technician(sepLine[1],sepLine[2],sepLine[3],intTemp,boolTemp);
				userList.add(techObj);
				
				break;
			default:
				System.out.println("Unknown users type pls check user type!!!");
				
	
			}
			
			
			
			
			}
			scanner = new Scanner(new File(args[1]));
			while(scanner.hasNextLine()){
			String line = scanner.nextLine();
			
			
			String[] sepLine = line.split("\t");
			
			switch(sepLine[0]){
			
			case "DESKTOP":
				intTemp = Integer.parseInt(sepLine[1]);
				
			
				items desktopobj = new desktop(intTemp,sepLine[2],sepLine[3],Integer.parseInt(sepLine[4]),Integer.parseInt(sepLine[5]),sepLine[6],sepLine[7],Integer.parseInt(sepLine[8]),Integer.parseInt(sepLine[9]),sepLine[10]);
				
				itemList.add(desktopobj);
				
				
				break;
			case "LAPTOP":
				
				items laptopobj = new laptop(Integer.parseInt(sepLine[1]),sepLine[2],sepLine[3],Integer.parseInt(sepLine[4]),Integer.parseInt(sepLine[5]),sepLine[6],sepLine[7],Integer.parseInt(sepLine[8]),Integer.parseInt(sepLine[9]),getBoolVal(sepLine[10]));
				itemList.add(laptopobj);
				break;
			case "TABLET":
				
				
				items tabletObj = new tablet(Integer.parseInt(sepLine[1]),sepLine[2],sepLine[3],Integer.parseInt(sepLine[4]),Integer.parseInt(sepLine[5]),sepLine[6],sepLine[7],Integer.parseInt(sepLine[8]),Integer.parseInt(sepLine[9]),Integer.parseInt(sepLine[10]));
				itemList.add(tabletObj);
				
				break;
			case "TV":
				
				items tvObj = new tv(Integer.parseInt(sepLine[1]),sepLine[2],sepLine[3],Integer.parseInt(sepLine[4]),Integer.parseInt(sepLine[5]),Integer.parseInt(sepLine[6]));
				itemList.add(tvObj);
				break;
			case "SMARTPHONE":
				
				items smartphObj = new smartPhone(Integer.parseInt(sepLine[1]),sepLine[2],sepLine[3],Integer.parseInt(sepLine[4]),Integer.parseInt(sepLine[5]),sepLine[6]);
				itemList.add(smartphObj);
				break;
			case "BOOK":
				
				items bookhObj = new book(Integer.parseInt(sepLine[1]),sepLine[2],sepLine[3],sepLine[4],sepLine[5],Integer.parseInt(sepLine[6]));
				itemList.add(bookhObj);
				break;
			case "CDDVD":
				
				items cddvdhObj = new cdDVD(Integer.parseInt(sepLine[1]),sepLine[2],sepLine[3],sepLine[4],sepLine[5]);
				itemList.add(cddvdhObj);
				break;
			case "HAIRCARE":
				
				items hairCarehObj = new hairCare(Integer.parseInt(sepLine[1]),sepLine[2],sepLine[3],getBoolVal(sepLine[4]),sepLine[5],Integer.parseInt(sepLine[6]),getBoolVal(sepLine[7]));
				itemList.add(hairCarehObj);
				break;
			case "SKINCARE":
				
				items skinCarehObj = new skinCare(Integer.parseInt(sepLine[1]),sepLine[2],sepLine[3],getBoolVal(sepLine[4]),sepLine[5],Integer.parseInt(sepLine[6]),getBoolVal(sepLine[7]));
				itemList.add(skinCarehObj);
				break;
			case "PERFUME":
				
				items parfumeObj = new parfume(Integer.parseInt(sepLine[1]),sepLine[2],sepLine[3],getBoolVal(sepLine[4]),sepLine[5],Integer.parseInt(sepLine[6]),Integer.parseInt(sepLine[7]));
				itemList.add(parfumeObj);
				break;
			default:
				System.out.println("Unknown users type pls check user type!!!");
				
	
			}
			
			}
			
			scanner = new Scanner(new File(args[2]));
			FileWriter fw = null;
			BufferedWriter bw =null;
			String content="";
			try {
				
				fw = new FileWriter("output.txt");
				bw = new BufferedWriter(fw);
			while(scanner.hasNextLine()){
			String line = scanner.nextLine();
			
			
			String[] sepLine = line.split("\t");
				content="COMMAND TEXT:<"+line+">";
				 bw.write(content);
				 bw.newLine();
				 bw.newLine();
					switch(sepLine[0]){
					
					case "ADDCUSTOMER":
						boolean opSucces = checkAdmin(userList,sepLine[1]);
						
								if(opSucces){
									person custObj = new customer(sepLine[2],sepLine[3],sepLine[4],Double.parseDouble(sepLine[5]),sepLine[6]);
									userList.add(custObj);
									content ="";
									 bw.write(content);
									 bw.newLine();
									 
								 }else{
									 
									 content = "No admin person named "+sepLine[1]+" exists!!";
									 bw.write(content);
									 bw.newLine();
									 
								 }
														
								bw.newLine();
						 break;
						
					case "SHOWCUSTOMER":
						
						boolean opResult = checkAdmin(userList,sepLine[1]);
						int searchRes=-1;
						
						
							if(opResult){
								searchRes=searchCustomerID(userList,Integer.parseInt(sepLine[2]));
								if(searchRes>(-1)){
									content =userList.get(searchRes).displayPData();
									 bw.write(content);
									 bw.newLine();
									
								}else{
									
									content="There is no customer that Id is "+Integer.parseInt(sepLine[2]);
									 bw.write(content);
									 bw.newLine();
								}
								
							}else{
								content="No admin person named "+sepLine[1]+" exists!!";
								 bw.write(content);
								 bw.newLine();
							}
						
						
							 bw.newLine();
						break;
						
					case"SHOWCUSTOMERS":
						boolTemp = checkAdmin(userList,sepLine[1]);
						if(boolTemp){
							
							for(int i=0;i<userList.size();i++){
								
								if(userList.get(i) instanceof customer){
									
									content =userList.get(i).displayPData();
									 bw.write(content);
									 bw.newLine();
									 
									
								}
								
							}
							
						}else{
							content="No admin person named "+sepLine[1]+" exists!!";
							 bw.write(content);
							 bw.newLine();
						}
						bw.newLine();
						break;
					case"SHOWADMININFO":
						boolTemp = checkAdmin(userList,sepLine[1]);
						
						if(boolTemp){
							
							for(int i=0;i<userList.size();i++){
								
								if(userList.get(i) instanceof admin){
									if(userList.get(i).name.equals(sepLine[1])){
										content =userList.get(i).displayPData();
										 bw.write(content);
										 bw.newLine();	
									}
													
								}
								
							}
							
						}else{
							content="No admin person named "+sepLine[1]+" exists!!";
							 bw.write(content);
							 bw.newLine();
						}
						bw.newLine();
						
						break;
					case"CREATECAMPAIGN":
						
						boolTemp = checkAdmin(userList,sepLine[1]);
						
						if(boolTemp){
							
							if(Double.parseDouble(sepLine[5])<50.0&&Double.parseDouble(sepLine[5])>0.0){
								campaign cmpObj = new campaign(sepLine[2],sepLine[3],sepLine[4],Double.parseDouble(sepLine[5]));
							}else{
								
								content="Campaign was not created. Discount rate exceeds maximum rate of 0.50";
								 bw.write(content);
								 bw.newLine();
							}
							
							
						}
						
						else{
							content="No admin person named "+sepLine[1]+" exists!!";
							 bw.write(content);
							 bw.newLine();
						}
						
						break;
						
					case"ADDADMIN":
						boolTemp=checkAdmin(userList,sepLine[1]);
						
						if(boolTemp){
							person adminObj= new admin(sepLine[2],sepLine[3],sepLine[4],Integer.parseInt(sepLine[5]),sepLine[6]);
							userList.add(adminObj);
						}else{
							
							content="No admin person named "+sepLine[1]+" exists!!";
							 bw.write(content);
							 bw.newLine();
						}
						break;
					case"ADDTECH":
						boolTemp=checkAdmin(userList,sepLine[1]);
						
						if(boolTemp){
							person adminObj= new technician(sepLine[2],sepLine[3],sepLine[4],Integer.parseInt(sepLine[5]),getBoolVal(sepLine[6]));
							userList.add(adminObj);
						}else{
							
							content="No admin person named "+sepLine[1]+" exists!!";
							 bw.write(content);
							 bw.newLine();
						}
						
						break;
					case"LISTITEM":
						boolTemp=checkAdmin(userList,sepLine[1]);
						if(!boolTemp){
							boolTemp = checkTech(userList,sepLine[1]);
						}
						
						if(boolTemp){
							
							for(int i=0;i<itemList.size();i++){
								
								content=itemList.get(i).displayItem();
								bw.write(content);
								 bw.newLine();
							}
							
						}else{
							content="No admin or technician person named "+sepLine[1]+" exists!!";
							 bw.write(content);
							 bw.newLine();
							
						}
						
						break;
					case"ADDITEM":
						boolTemp = checkTech(userList,sepLine[1]);
						
						if(boolTemp){
							
							itemList = addItem(itemList,sepLine[2]);
							
						}else{
							content="No technician person named "+sepLine[1]+" exists!!";
							 bw.write(content);
							 bw.newLine();
						}
						break;
					case"CHPASS":
						
						intTemp = searchCustomerID(userList,Integer.parseInt(sepLine[1]));
						if(intTemp==-1){
							
							content="No customer with ID number"+Integer.parseInt(sepLine[1])+"  exists!";
							bw.write(content);
							 bw.newLine();
						}else {
							if(((customer)(userList.get(intTemp))).changePass(sepLine[3], sepLine[2])){
								
								content ="The password has been successfully changed.";
								bw.write(content);
								 bw.newLine();
							}else{
								
								content ="The given password does not match the current password. Please try again.";
								bw.write(content);
								 bw.newLine();
							}
							
							
						}
						
						break;
					case"DEPOSITMONEY":
						intTemp = searchCustomerID(userList,Integer.parseInt(sepLine[1]));
						
						if(intTemp == -1){
							content ="No customer with ID number "+Integer.parseInt(sepLine[1])+" exists!";
							bw.write(content);
							 bw.newLine();
						}else{
							((customer)(userList.get(intTemp))).depositMoney(Double.parseDouble(sepLine[2]));
						}
						
						
						
						break;
					case"SHOWCAMPAIGNS":
						
						intTemp= searchCustomerID(userList,Integer.parseInt(sepLine[1]));
						String printString="Active campaigns:\r\n";
						if(intTemp==-1){
							content ="No customer with ID number "+Integer.parseInt(sepLine[1])+" exists!";
							bw.write(content);
							 bw.newLine();
						}else{
							for(int i=0; i<campaignList.size();i++){
								
								printString=printString+campaignList.get(i).displayCampaign();
							}
							content = printString;
							bw.write(content);
							 bw.newLine();
						}
						
						break;
					default:
						content ="";
						 bw.write(content);
					
						 bw.newLine();
						
						}
			}			

				} catch (IOException e) {

					e.printStackTrace();

				} finally {

					try {

						if (bw != null)
							bw.close();

						if (fw != null)
							fw.close();

					} catch (IOException ex) {

						ex.printStackTrace();

					}

				}
			
		
			//}
			scanner.close();
			} catch (FileNotFoundException ex) {
			System.out.println("No File Found!");
			return;
			}
	}
	
	public static boolean getBoolVal(String str){
		
		if(str.equals("1")||str.equals("true")){
			return true;
		} else if(str.equals("0")||str.equals("false")){
			return false;
			
		}
		System.out.println("Something wrong with boolean expression!!");
		return false;
	}
	
	public static boolean checkAdmin(ArrayList<person> list,String name){
		
		
		for(int i=0; i<list.size(); i++){
			
			if(list.get(i) instanceof admin){
				
				if(list.get(i).name.equals(name)){
					return true;
				}
				
			}
			
		}
		return false;
	}
public static boolean checkTech(ArrayList<person> list,String name){
		
		
		for(int i=0; i<list.size(); i++){
			
			if(list.get(i) instanceof technician){
				
				if(list.get(i).name.equals(name)){
					return true;
				}
				
			}
			
		}
		return false;
	}
	
	public static int searchCustomerID(ArrayList<person> list,int ID){
		
		for(int i=0; i<list.size(); i++){
			if(list.get(i) instanceof customer){
				customer custObj = (customer)list.get(i);
				if(custObj.getCustomerID()==ID){
					return i;
				}
			}
			
		}
		return -1;
		
	}
	public static ArrayList<items> addItem(ArrayList<items> list,String dataStr){
		
		String sepLine[] = dataStr.split(":");
		int intTemp ;
		switch(sepLine[0]){
		
		case "DESKTOP":
			intTemp = Integer.parseInt(sepLine[1]);
			
		
			items desktopobj = new desktop(intTemp,sepLine[2],sepLine[3],Integer.parseInt(sepLine[4]),Integer.parseInt(sepLine[5]),sepLine[6],sepLine[7],Integer.parseInt(sepLine[8]),Integer.parseInt(sepLine[9]),sepLine[10]);
			
			list.add(desktopobj);
			
			
			break;
		case "LAPTOP":
			
			items laptopobj = new laptop(Integer.parseInt(sepLine[1]),sepLine[2],sepLine[3],Integer.parseInt(sepLine[4]),Integer.parseInt(sepLine[5]),sepLine[6],sepLine[7],Integer.parseInt(sepLine[8]),Integer.parseInt(sepLine[9]),getBoolVal(sepLine[10]));
			list.add(laptopobj);
			break;
		case "TABLET":
			
			
			items tabletObj = new tablet(Integer.parseInt(sepLine[1]),sepLine[2],sepLine[3],Integer.parseInt(sepLine[4]),Integer.parseInt(sepLine[5]),sepLine[6],sepLine[7],Integer.parseInt(sepLine[8]),Integer.parseInt(sepLine[9]),Integer.parseInt(sepLine[10]));
			list.add(tabletObj);
			
			break;
		case "TV":
			
			items tvObj = new tv(Integer.parseInt(sepLine[1]),sepLine[2],sepLine[3],Integer.parseInt(sepLine[4]),Integer.parseInt(sepLine[5]),Integer.parseInt(sepLine[6]));
			list.add(tvObj);
			break;
		case "SMARTPHONE":
			
			items smartphObj = new smartPhone(Integer.parseInt(sepLine[1]),sepLine[2],sepLine[3],Integer.parseInt(sepLine[4]),Integer.parseInt(sepLine[5]),sepLine[6]);
			list.add(smartphObj);
			break;
		case "BOOK":
			
			items bookhObj = new book(Integer.parseInt(sepLine[1]),sepLine[2],sepLine[3],sepLine[4],sepLine[5],Integer.parseInt(sepLine[6]));
			list.add(bookhObj);
			break;
		case "CDDVD":
			
			items cddvdhObj = new cdDVD(Integer.parseInt(sepLine[1]),sepLine[2],sepLine[3],sepLine[4],sepLine[5]);
			list.add(cddvdhObj);
			break;
		case "HAIRCARE":
			
			items hairCarehObj = new hairCare(Integer.parseInt(sepLine[1]),sepLine[2],sepLine[3],getBoolVal(sepLine[4]),sepLine[5],Integer.parseInt(sepLine[6]),getBoolVal(sepLine[7]));
			list.add(hairCarehObj);
			break;
		case "SKINCARE":
			
			items skinCarehObj = new skinCare(Integer.parseInt(sepLine[1]),sepLine[2],sepLine[3],getBoolVal(sepLine[4]),sepLine[5],Integer.parseInt(sepLine[6]),getBoolVal(sepLine[7]));
			list.add(skinCarehObj);
			break;
		case "PERFUME":
			
			items parfumeObj = new parfume(Integer.parseInt(sepLine[1]),sepLine[2],sepLine[3],getBoolVal(sepLine[4]),sepLine[5],Integer.parseInt(sepLine[6]),Integer.parseInt(sepLine[7]));
			list.add(parfumeObj);
			break;
		default:
			System.out.println("Unknown users type pls check user type!!!");
			

		}
		return list;
		
	}

}
