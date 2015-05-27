package org.opengrid.service;

import org.opengrid.pojo.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.UUID;

import javax.ws.rs.PathParam;

import org.eclipse.jetty.util.ajax.JSON;
import org.opengrid.pojo.PojoMapper;
import org.opengrid.pojo.UsersPojo;
import org.springframework.stereotype.Component;


@Component("OpenGridServiceBean")
public class OpenGridServiceImpl implements OpenGridService {
	
	@Override
	public String getAllOpenGridLists() {
		String myStr = "all objects here !";
		return myStr;
	}
	
	@Override
	public OpenGridResult postOpenGridUserToken(String users,  String password) {
		OpenGridResult response = new OpenGridResult();
		
		if ((users != null) && (password != null)) {
			 response = new OpenGridResult();
	
			response.setStatusMessage("WindyGrid Service Get Success !");
			response.setStatusType(OpenGridResultStatusEnum.SUCCESS);
			
			return response;
		}
		else {
		
			response.setStatusMessage("Couldn't find user !");
			
			return response;
		}
	}
	
	@Override
	public String getOpenGridUserList(String filter) {
		String pojoAsString  = null;
		 UsersPojo pojo = new UsersPojo();
	        // Populate it with some data
	        pojo.setDepartment("eki");
	        pojo.setDeptNumber("myNuber");
	        pojo.setLastName("Fan");
	        pojo.setFirstName("Wayne");
	        pojo.setUserID("wfan");
	        pojo.setUserPass("504bd6582c176712c214d370");
	        pojo.setEmail("wfan@eki-consulting.com");
	       
	        Map<String,Date> map = new HashMap<String,Date>();
	        map.put("now", new Date());
	        pojo.setMap(map);

	        // Map it to JSON and then back again
	        try {
	            pojoAsString = PojoMapper.toJson(pojo, true);
	            System.out.println("POJO as string:\n" + pojoAsString + "\n");
	            UsersPojo pojo2 = (UsersPojo) PojoMapper.fromJson(pojoAsString, UsersPojo.class);
	            System.out.println("POJO toString():\n" + pojo2 + "\n");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }

			
		return pojoAsString;
	}
	
	@Override
	public String getOpenGridOneUser(String userId) {
		DataObjects myObject = new DataObjects();

			myObject.setId("504bd6582c176712c214d370");
			myObject.setName("db.windygrid.findOne({'user1' : 'kaslkasfa'})");
			
			return "{userid: " + userId + "}";
	}
	
	@Override
	public OpenGridResult updateOpenGridOneUser(String userid) {
		OpenGridResult response = new OpenGridResult();
		if (userid != null) {
			response.setStatusMessage("WindyGrid Service Get Success !");
			response.setStatusType(OpenGridResultStatusEnum.SUCCESS);
			

		} else {
			response.setStatusMessage("WindyGrid Service Get Failed !");
			response.setStatusType(OpenGridResultStatusEnum.FAIL);
		}
		return response;
	}
	
	@Override
	public String getOpenGridGroupsList() {
		DataObjects myObject = new DataObjects();
		
		myObject.setId("504bd6582c176712c214d370");
		myObject.setName("db.windygrid.findOne({'team1' : 'myGroups'})");
		
		
		return myObject.getName();
	}
	
	@Override
	public OpenGridResult createOpenGridNewGroup() {
		OpenGridResult response = new OpenGridResult();
		
		response.setStatusMessage("WindyGrid Service Get Success !");
		response.setStatusType(OpenGridResultStatusEnum.SUCCESS);
			

		return response;
	}
	
	@Override
	public String getOpenGridOneGroup(String groupId) {
		DataObjects myObject = new DataObjects();

		myObject.setId("504bd6582c176712c214d370");
		myObject.setName("db.windygrid.findOne({'user1' : 'kaslkasfa'})");
		
		return "{groupid: " + groupId + "}";
	}
	
	@Override
	public OpenGridResult updateOpenGridOneGroup(String groupId) {
		OpenGridResult response = new OpenGridResult();

		if (groupId != null) {
			response.setStatusMessage("WindyGrid Service Get Success !");
			response.setStatusType(OpenGridResultStatusEnum.SUCCESS);
			

		} else {
			response.setStatusMessage("WindyGrid Get Failed !");
			response.setStatusType(OpenGridResultStatusEnum.FAIL);
		}
		return response;
	}
	
	@Override
	public OpenGridResult deleteOpenGridOneGroup(String groupId) {
		OpenGridResult response = new OpenGridResult();
		if (groupId != null) {
			response.setStatusMessage("WindyGrid Service Get Success !");
			response.setStatusType(OpenGridResultStatusEnum.SUCCESS);
			

		} else {
			response.setStatusMessage("WindyGrid Service Get Failed !");
			response.setStatusType(OpenGridResultStatusEnum.FAIL);
		}
		return response;
	}
	
	
	@Override
	public String getOpenGridOneGroupMembersList(String groupId)  {
		DataObjects myObject = new DataObjects();
		if (groupId.equalsIgnoreCase("504bd6582c176712c214d370")) {
			myObject.setId("504bd6582c176712c214d370");
			myObject.setName("db.windygrid.findOne({'user1' : 'kaslkasfa'})");
			
			return myObject.getName();
		}
		else {
			myObject.setErrorMessage("groupId is not matched");
			
			return myObject.getErrorMessage();
		}
	}
	
	@Override
	public OpenGridResult addOpenGridOneGroupOneMember(String groupId) {
		OpenGridResult response = new OpenGridResult();

		if (groupId != null) {
			response.setStatusMessage("WindyGrid Service Get Success !");
			response.setStatusType(OpenGridResultStatusEnum.SUCCESS);
			

		} else {
			response.setStatusMessage("WindyGrid Get Failed !");
			response.setStatusType(OpenGridResultStatusEnum.FAIL);
		}
		return response;
	}
	
	@Override
	public OpenGridResult deleteOpenGridOneGroupOneMember(String groupId, String memberId) {
		OpenGridResult response = new OpenGridResult();
		if ((groupId != null) && (memberId != null)) {
			response.setStatusMessage("WindyGrid Service Get Success !");
			response.setStatusType(OpenGridResultStatusEnum.SUCCESS);
			

		} else {
			response.setStatusMessage("WindyGrid Service Get Failed !");
			response.setStatusType(OpenGridResultStatusEnum.FAIL);
		}
		return response;
	}
	
	@Override
	public String getOpenGridOneGroupAlertsList(String groupId) {
		DataObjects myObject = new DataObjects();
		if (groupId.equalsIgnoreCase("504bd6582c176712c214d370")) {
			myObject.setId("504bd6582c176712c214d370");
			myObject.setName("db.windygrid.findOne({'user1' : 'kaslkasfa'})");
			
			return myObject.getName();
		}
		else {
			myObject.setErrorMessage("groupId is not matched");
			
			return myObject.getErrorMessage();
		}
		
	}
	
	@Override
	public OpenGridResult createOpenGridOneGroupNewAlert(String groupId)  {
		OpenGridResult response = new OpenGridResult();

		if (groupId != null) {
			response.setStatusMessage("WindyGrid Service Get Success !");
			response.setStatusType(OpenGridResultStatusEnum.SUCCESS);
			

		} else {
			response.setStatusMessage("WindyGrid Get Failed !");
			response.setStatusType(OpenGridResultStatusEnum.FAIL);
		}
		return response;
	}
	
	@Override
	public String getOpenGridAlertsList() {
		DataObjects myObject = new DataObjects();
		
		myObject.setId("504bd6582c176712c214d370");
		myObject.setName("db.windygrid.findOne({'type' : '311'})");
		
		
		return myObject.getName();
	}
	
	
	@Override
	public OpenGridResult addOpenGridNewAlert() {
		OpenGridResult response = new OpenGridResult();
	
		response.setStatusMessage("WindyGrid Service Get Success !");
		response.setStatusType(OpenGridResultStatusEnum.SUCCESS);
			
	
		return response;
	}
	
	@Override
	public String getOpenGridOneAlert(String alertId) {
		DataObjects myObject = new DataObjects();
		if (alertId.equalsIgnoreCase("504bd6582c176712c214d370")) {
			myObject.setId("504bd6582c176712c214d370");
			myObject.setName("db.windygrid.findOne({'user1' : 'kaslkasfa'})");
			
			return myObject.getName();
		}
		else {
			myObject.setErrorMessage("groupId is not matched");
			
			return myObject.getErrorMessage();
		}
	}
	
	@Override
	public OpenGridResult putOpenGridOneAlert(String alertId) {
		OpenGridResult response = new OpenGridResult();
	
		if (alertId != null) {
			response.setStatusMessage("WindyGrid Service Get Success !");
			response.setStatusType(OpenGridResultStatusEnum.SUCCESS);
			
	
		} else {
			response.setStatusMessage("WindyGrid Get Failed !");
			response.setStatusType(OpenGridResultStatusEnum.FAIL);
		}
		return response;
	}
	
	@Override
	public OpenGridResult deleteOpenGridOneAlert(String alertId) {
		OpenGridResult response = new OpenGridResult();
		if (alertId != null) {
			response.setStatusMessage("WindyGrid Service Get Success !");
			response.setStatusType(OpenGridResultStatusEnum.SUCCESS);
			
	
		} else {
			response.setStatusMessage("WindyGrid Service Get Failed !");
			response.setStatusType(OpenGridResultStatusEnum.FAIL);
		}
		return response;
	}
	
	@Override
	public String getOpenGridDatasetsList() {
		String retString = null;
		ArrayList pojo = new ArrayList();
		JsonObject pojo1 = new JsonObject();
		JsonObject pojo2 = new JsonObject();
		try {
			HashMap<String, Object> map = new HashMap<String, Object>();
		
			pojo1 = (JsonObject) PojoMapper.fromJson(streamToString(readFileAsResource("json/Weather.json")), JsonObject.class);		
	        
			pojo2 = (JsonObject) PojoMapper.fromJson(streamToString(readFileAsResource("json/twitter.json")), JsonObject.class);		
	        	       
	        pojo.add(0, pojo1);
	        pojo.add(1, pojo2);
	        
	        retString = PojoMapper.toJson(pojo, true);
		}
		catch (Exception e) {
	          e.printStackTrace();
	      }
		
		return retString;
	}
	
	@Override
	public OpenGridResult addOpenGridNewdataset() {
		OpenGridResult response = new OpenGridResult();
	
		response.setStatusMessage("WindyGrid Service Get Success !");
		response.setStatusType(OpenGridResultStatusEnum.SUCCESS);
			
	
		return response;
	}
	
	@Override
	public String getOpenGridOneDataset(String datasetId) {
		
		String retString = null;
		
		JsonObject pojo = new JsonObject();
		
		if (datasetId.equalsIgnoreCase("Twitter")) {
			try {
		          pojo = (JsonObject) PojoMapper.fromJson(streamToString(readFileAsResource("json/Twitter.json")), JsonObject.class);
		          
		          retString = PojoMapper.toJson(pojo, true);

		      } catch (Exception e) {
		          e.printStackTrace();
		      }
			
		}
		else if (datasetId.equalsIgnoreCase("Weather")) {
			try {

				pojo = (JsonObject) PojoMapper.fromJson(streamToString(readFileAsResource("json/Weather.json")), JsonObject.class);
		          
		          retString = PojoMapper.toJson(pojo, true);
		      } catch (Exception e) {
		          e.printStackTrace();
		      }
		}
		else
			return "No data set has been found !";
		
		return retString;
	}
	
	@Override
	public String excuteOpenGridQuery(String datasetId, String queryId) {
	
		String retString = null;
		
		JsonObject pojo = new JsonObject();
		
		if (datasetId.equalsIgnoreCase("Twitter")) {
			if (queryId.equalsIgnoreCase("json")) {
			try {
				  pojo = (JsonObject) PojoMapper.fromJson(streamToString(readFileAsResource("json/Twitter_JsonQuery.json")), JsonObject.class);
		          
		          retString = PojoMapper.toJson(pojo, true);

		      } catch (Exception e) {
		          e.printStackTrace();
		      }
			
		}
			else if (queryId.equalsIgnoreCase("geojson")) {
				try {
					 pojo = (JsonObject) PojoMapper.fromJson(streamToString(readFileAsResource("json/Twitter_GeoQuery.json")), JsonObject.class);
			          
			          retString = PojoMapper.toJson(pojo, true);

			      } catch (Exception e) {
			          e.printStackTrace();
			      }
			}
			else {
				try {
					   pojo = (JsonObject) PojoMapper.fromJson(streamToString(readFileAsResource("json/Twitter.json")), JsonObject.class);
			          
			          retString = PojoMapper.toJson(pojo, true);

			      } catch (Exception e) {
			          e.printStackTrace();
			      }
				
			}
				
		}
		else if (datasetId.equalsIgnoreCase("Weather")) {
			if (queryId.equalsIgnoreCase("json")) {
				try {
					  pojo = (JsonObject) PojoMapper.fromJson(streamToString(readFileAsResource("json/Weather_JsonQuery.json")), JsonObject.class);
			          
			          retString = PojoMapper.toJson(pojo, true);

			      } catch (Exception e) {
			          e.printStackTrace();
			      }
				
			}
				else if (queryId.equalsIgnoreCase("geojson")) {
					try {
						  pojo = (JsonObject) PojoMapper.fromJson(streamToString(readFileAsResource("json/Weather_GeoQuery.json")), JsonObject.class);
				          
				          retString = PojoMapper.toJson(pojo, true);

				      } catch (Exception e) {
				          e.printStackTrace();
				      }
				}
				else {
					try {
						  pojo = (JsonObject) PojoMapper.fromJson(streamToString(readFileAsResource("json/Weather.json")), JsonObject.class);
				          
				          retString = PojoMapper.toJson(pojo, true);

				      } catch (Exception e) {
				          e.printStackTrace();
				      }
					
				}
				}
				return retString;
		}
		
	
		
	
	@Override
	public String getOpenGridQueriesList() {
		DataObjects myObject = new DataObjects();
		
		myObject.setId("504bd6582c176712c214d370");
		myObject.setName("db.windygrid.findOne({'type' : '311'})");
		
		
		return myObject.getName();
	}
	
	@Override
	public String addOpenGridNewQuery() {
		DataObjects myObject = new DataObjects();
		
		myObject.setId("504bd6582c176712c214d370");
		myObject.setName("db.windygrid.findOne({'type' : '311'})");
		
		
		return myObject.getName();
	}
	
	
	@Override
	public String getOpenGridOneQuery(String queryId)  {
		DataObjects myObject = new DataObjects();
		if (queryId.equalsIgnoreCase("504bd6582c176712c214d370")) {
			myObject.setId("504bd6582c176712c214d370");
			myObject.setName("db.windygrid.findOne({'user1' : 'kaslkasfa'})");
			
			return myObject.getName();
		}
		else {
			myObject.setErrorMessage("groupId is not matched");
			
			return myObject.getErrorMessage();
		}	
	}
	
	@Override
	public OpenGridResult updateOpenGridOneQuery(String queryId) {
		OpenGridResult response = new OpenGridResult();
	
		if (queryId != null) {
			response.setStatusMessage("WindyGrid Service Get Success !");
			response.setStatusType(OpenGridResultStatusEnum.SUCCESS);
			
	
		} else {
			response.setStatusMessage("WindyGrid Get Failed !");
			response.setStatusType(OpenGridResultStatusEnum.FAIL);
		}
		return response;
	}
	
	@Override
	public OpenGridResult deleteOpenGridOneQuery(String querId) {
		OpenGridResult response = new OpenGridResult();
		if (querId != null) {
			response.setStatusMessage("WindyGrid Service Get Success !");
			response.setStatusType(OpenGridResultStatusEnum.SUCCESS);
			
	
		} else {
			response.setStatusMessage("WindyGrid Service Get Failed !");
			response.setStatusType(OpenGridResultStatusEnum.FAIL);
		}
		return response;
	}
	
	@Override
	public String getOpenGridGeoboundariesList() {
		DataObjects myObject = new DataObjects();
		
		myObject.setId("504bd6582c176712c214d370");
		myObject.setName("db.windygrid.findOne({'type' : '311'})");
		
		
		return myObject.getName();
	}
	
	
	@Override
	public String getOpenGridOneGeoboundary(String boundaryId) {
		DataObjects myObject = new DataObjects();
		if (boundaryId.equalsIgnoreCase("504bd6582c176712c214d370")) {
			myObject.setId("504bd6582c176712c214d370");
			myObject.setName("db.windygrid.findOne({'user1' : 'kaslkasfa'})");
			
			return myObject.getName();
		}
		else {
			myObject.setErrorMessage("groupId is not matched");
			
			return myObject.getErrorMessage();
		}	
	}
	


private InputStream readFileAsResource(String fileName) throws IOException {
    InputStream f;
    try {
           FileInputStream fis = new FileInputStream(fileName);
           f = fis;
         } catch (FileNotFoundException ex) {
                                                //FileNotFound
           f =new Object() { }.getClass().getEnclosingClass().getClassLoader().getResourceAsStream(fileName);
        }
           if (f == null) {
        	   throw new IOException("Cannot load file " + fileName);
        }
               return f;
 }
                
private String streamToString(InputStream is) {
       Scanner s = new Scanner(is).useDelimiter("\\A");
      return s.hasNext() ? s.next() : "";
}	
}
