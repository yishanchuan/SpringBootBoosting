package com.di.exam.entity;

import javax.persistence.*;

@Entity
@Table(name = "t_jiaguwen")
public class JiaGuWen {

    // 甲骨文-数据表
    @Id
    @GeneratedValue
    private Integer id;
    @Column(name = "sentence_id",length = 64)
    private Integer sentenceId;
    @Column(name = "sentence",length = 64)
    private String sentence;

    public JiaGuWen() {
    }

    public JiaGuWen(Integer sentenceId, String sentence) {
        this.sentenceId = sentenceId;
        this.sentence = sentence;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSentenceId() {
        return sentenceId;
    }

    public void setSentenceId(Integer sentenceId) {
        this.sentenceId = sentenceId;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    @Override
    public String toString() {
        return "JiaGuWen{" +
                "id=" + id +
                ", sentenceId=" + sentenceId +
                ", sentence='" + sentence + '\'' +
                '}';
    }
}
