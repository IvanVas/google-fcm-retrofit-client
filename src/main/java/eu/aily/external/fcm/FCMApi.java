package eu.aily.external.fcm;

import eu.aily.external.fcm.CollectionFormats.*;

import retrofit.Callback;
import retrofit.http.*;
import retrofit.mime.*;

import eu.aily.external.fcm.Message;
import eu.aily.external.fcm.Response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface FCMApi {
  /**
   * 
   * Sync method
   * Send downstream messages to client apps
   * @param message Downstream message to send (required)
   * @return Response
   */
  
  @POST("/fcm/send")
  Response fcmSendPost(
    @retrofit.http.Body Message message
  );

  /**
   * 
   * Async method
   * @param message Downstream message to send (required)
   * @param cb callback method
   */
  
  @POST("/fcm/send")
  void fcmSendPost(
    @retrofit.http.Body Message message, Callback<Response> cb
  );
}
