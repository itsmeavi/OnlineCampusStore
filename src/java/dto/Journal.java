/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author free_bird
 */
public class Journal {
     private String journalId;
     private String journalName;
     private String publication;

    /**
     * @return the journalId
     */
    public String getJournalId() {
        return journalId;
    }

    /**
     * @param journalId the journalId to set
     */
    public void setJournalId(String journalId) {
        this.journalId = journalId;
    }

    /**
     * @return the journalName
     */
    public String getJournalName() {
        return journalName;
    }

    /**
     * @param journalName the journalName to set
     */
    public void setJournalName(String journalName) {
        this.journalName = journalName;
    }

    /**
     * @return the publication
     */
    public String getPublication() {
        return publication;
    }

    /**
     * @param publication the publication to set
     */
    public void setPublication(String publication) {
        this.publication = publication;
    }

   
   
}
