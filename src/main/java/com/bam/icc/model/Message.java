package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "icc_message")
public class Message {

    @Id
    private long id;
    @Column(name = "bam_user")
    private long bamUserId;
    @Column(name = "account_id")
    private long accountId;
    @Column(name = "prepared_data")
    private String preparedData;
    @Column(name = "status")
    private String status;
    @Column(name = "time_generated")
    private LocalDateTime timeGenerated;
    @Column(name = "time_saved")
    private LocalDateTime timeSaved;
    @Column(name = "time_updated")
    private LocalDateTime timeUpdated;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getBamUserId() {
        return bamUserId;
    }

    public void setBamUserId(long bamUserId) {
        this.bamUserId = bamUserId;
    }

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public String getPreparedData() {
        return preparedData;
    }

    public void setPreparedData(String preparedData) {
        this.preparedData = preparedData;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getTimeGenerated() {
        return timeGenerated;
    }

    public void setTimeGenerated(LocalDateTime timeGenerated) {
        this.timeGenerated = timeGenerated;
    }

    public LocalDateTime getTimeSaved() {
        return timeSaved;
    }

    public void setTimeSaved(LocalDateTime timeSaved) {
        this.timeSaved = timeSaved;
    }

    public LocalDateTime getTimeUpdated() {
        return timeUpdated;
    }

    public void setTimeUpdated(LocalDateTime timeUpdated) {
        this.timeUpdated = timeUpdated;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Message{");
        sb.append("id=").append(id);
        sb.append(", bamUserId=").append(bamUserId);
        sb.append(", accountId=").append(accountId);
        sb.append(", preparedData='").append(preparedData).append('\'');
        sb.append(", status='").append(status).append('\'');
        sb.append(", timeGenerated=").append(timeGenerated);
        sb.append(", timeSaved=").append(timeSaved);
        sb.append(", timeUpdated=").append(timeUpdated);
        sb.append('}');
        return sb.toString();
    }
}
