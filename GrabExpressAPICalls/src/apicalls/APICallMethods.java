package apicalls;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import model.DeliveryPost;
import model.DeliveryPostQuotes;
import model.GetDelivery;
import model.Quotes;

public class APICallMethods {

	// Holds the API URL
	String apiUrl;

	private static APICallMethods instance = null;

	private APICallMethods() {
		// API URL initialization
		apiUrl = "https://partner-api.grab.com/grab-express/v1/grab-express/v1/deliveries";
	}

	public static APICallMethods getInstance() {
		if (instance == null) {
			instance = new APICallMethods();
		}
		return instance;
	}

	//Post Method: Request for delivery service
	public GetDelivery delivery(DeliveryPost delivery) throws IOException {

		URL url = new URL(apiUrl);

		GetDelivery result = null;
		String readLine = null;
		Gson gson = new Gson();
		
		HttpURLConnection conection = (HttpURLConnection) url.openConnection();
		conection.setRequestMethod("POST");
		conection.setRequestProperty("Accept", "application/json");
		
		conection.setDoOutput(true);
		OutputStream os = conection.getOutputStream();
		os.write(gson.toJson(delivery).getBytes());
		os.flush();
		os.close();

		int responseCode = conection.getResponseCode();
		
		//if responseCode is OK return GetDelivery object from the response
		if (responseCode == HttpURLConnection.HTTP_OK) {

			BufferedReader in = new BufferedReader(new InputStreamReader(conection.getInputStream()));
			StringBuffer response = new StringBuffer();
			while ((readLine = in.readLine()) != null) {
				response.append(readLine);
			}
			in.close();

			Type type = new TypeToken<GetDelivery>() {
			}.getType();
			result = gson.fromJson(response.toString(), type);

		//if responseCode is HTTP_BAD_REQUEST, HTTP_NOT_FOUND or HTTP_CONFLICT
		//get the message from the response and print to the console
		} else if (responseCode == HttpURLConnection.HTTP_BAD_REQUEST
				|| responseCode == HttpURLConnection.HTTP_NOT_FOUND
				|| responseCode == HttpURLConnection.HTTP_CONFLICT) {
			BufferedReader in = new BufferedReader(new InputStreamReader(conection.getInputStream()));
			StringBuffer response = new StringBuffer();
			while ((readLine = in.readLine()) != null) {
				response.append(readLine);
			}
			in.close();

			Type type = new TypeToken<Error>() {
			}.getType();
			Error error = (gson.fromJson(response.toString(), type));
			System.out.println(error.getMessage());

		} else {
			System.out.println("ERROR: Connection refused");
		}

		return result;
		
	}

	//Post Method: Request for delivery service quotes
	public Quotes deliveryQuotes(DeliveryPostQuotes delivery) throws IOException {
		
		URL url = new URL(apiUrl + "/quotes");

		Quotes result = null;
		String readLine = null;
		Gson gson = new Gson();
		
		HttpURLConnection conection = (HttpURLConnection) url.openConnection();
		conection.setRequestMethod("POST");
		conection.setRequestProperty("Accept", "application/json");
		
		conection.setDoOutput(true);
		OutputStream os = conection.getOutputStream();
		os.write(gson.toJson(delivery).getBytes());
		os.flush();
		os.close();

		int responseCode = conection.getResponseCode();
		
		//if responseCode is OK return Quotes object from the response
		if (responseCode == HttpURLConnection.HTTP_OK) {

			BufferedReader in = new BufferedReader(new InputStreamReader(conection.getInputStream()));
			StringBuffer response = new StringBuffer();
			while ((readLine = in.readLine()) != null) {
				response.append(readLine);
			}
			in.close();

			Type type = new TypeToken<Quotes>() {
			}.getType();
			result = gson.fromJson(response.toString(), type);

		//if responseCode is HTTP_BAD_REQUEST, HTTP_NOT_FOUND or HTTP_CONFLICT
		//get the message from the response and print to the console
		} else if (responseCode == HttpURLConnection.HTTP_BAD_REQUEST
				|| responseCode == HttpURLConnection.HTTP_NOT_FOUND
				|| responseCode == HttpURLConnection.HTTP_CONFLICT) {
			BufferedReader in = new BufferedReader(new InputStreamReader(conection.getInputStream()));
			StringBuffer response = new StringBuffer();
			while ((readLine = in.readLine()) != null) {
				response.append(readLine);
			}
			in.close();

			Type type = new TypeToken<Error>() {
			}.getType();
			Error error = (gson.fromJson(response.toString(), type));
			System.out.println(error.getMessage());

		} else {
			System.out.println("ERROR: Connection refused");
		}

		return result;
		
	}

	//Get Method: Get the full information of a delivery
	public GetDelivery getDelivery(int id) throws IOException {

		URL url = new URL(apiUrl + "/" + id);

		GetDelivery result = null;
		String readLine = null;
		Gson gson = new Gson();
		
		HttpURLConnection conection = (HttpURLConnection) url.openConnection();
		conection.setRequestMethod("GET");
		conection.setRequestProperty("Accept", "application/json");

		int responseCode = conection.getResponseCode();
		
		//if responseCode is OK return GetDelivery object from the response
		if (responseCode == HttpURLConnection.HTTP_OK) {
			BufferedReader in = new BufferedReader(new InputStreamReader(conection.getInputStream()));
			StringBuffer response = new StringBuffer();
			while ((readLine = in.readLine()) != null) {
				response.append(readLine);
			}
			in.close();

			Type type = new TypeToken<GetDelivery>() {
			}.getType();
			result = gson.fromJson(response.toString(), type);

		//if responseCode is HTTP_BAD_REQUEST or HTTP_NOT_FOUND
		//get the message from the response and print to the console
		} else if (responseCode == HttpURLConnection.HTTP_BAD_REQUEST
				|| responseCode == HttpURLConnection.HTTP_NOT_FOUND) {
			BufferedReader in = new BufferedReader(new InputStreamReader(conection.getInputStream()));
			StringBuffer response = new StringBuffer();
			while ((readLine = in.readLine()) != null) {
				response.append(readLine);
			}
			in.close();

			Type type = new TypeToken<Error>() {
			}.getType();
			Error error = (gson.fromJson(response.toString(), type));
			System.out.println(error.getMessage());

		} else {
			System.out.println("ERROR: Connection refused");
		}

		return result;
	}

	//Delete Method: Cancel a delivery
	public void deleteDelivery(int id) throws IOException {

		URL url = new URL(apiUrl + "/" + id);

		String readLine = null;
		Gson gson = new Gson();
		
		HttpURLConnection conection = (HttpURLConnection) url.openConnection();
		conection.setRequestMethod("DELETE");
		conection.setRequestProperty("Accept", "application/json");

		int responseCode = conection.getResponseCode();
		
		//if responseCode is OK print Delivery deleted to the console
		if (responseCode == HttpURLConnection.HTTP_OK) {
			System.out.println("Delivery deleted");

		//if responseCode is HTTP_BAD_REQUEST, HTTP_NOT_FOUND or HTTP_CONFLICT
		//get the message from the response and print to the console
		} else if (responseCode == HttpURLConnection.HTTP_BAD_REQUEST
				|| responseCode == HttpURLConnection.HTTP_NOT_FOUND
				|| responseCode == HttpURLConnection.HTTP_CONFLICT) {
			BufferedReader in = new BufferedReader(new InputStreamReader(conection.getInputStream()));
			StringBuffer response = new StringBuffer();
			while ((readLine = in.readLine()) != null) {
				response.append(readLine);
			}
			in.close();

			Type type = new TypeToken<Error>() {
			}.getType();
			Error error = (gson.fromJson(response.toString(), type));
			System.out.println(error.getMessage());

		} else {
			System.out.println("ERROR: Connection refused");
		}
	}
}
