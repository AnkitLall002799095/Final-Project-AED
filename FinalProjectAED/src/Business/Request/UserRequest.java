/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Request;

import Business.Property.Property;
import java.util.Date;

/**
 *
 * @author hmitt
 */
public class UserRequest {
    
    private int requestId;
    private int propId;
    private int aptId;
    private int mgmtId;
    private String requestType;
    private String status;
    private String lastMdfdDate;
    private int userId;

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public int getPropId() {
        return propId;
    }

    public void setPropId(int propId) {
        this.propId = propId;
    }

    public int getAptId() {
        return aptId;
    }

    public void setAptId(int aptId) {
        this.aptId = aptId;
    }

    public int getMgmtId() {
        return mgmtId;
    }

    public void setMgmtId(int mgmtId) {
        this.mgmtId = mgmtId;
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLastMdfdDate() {
        return lastMdfdDate;
    }

    public void setLastMdfdDate(String lastMdfdDate) {
        this.lastMdfdDate = lastMdfdDate;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

}
