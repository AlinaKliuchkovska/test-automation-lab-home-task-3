package model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class RozetkaFilter {
    String group;
    String sortingType;
    String brandName;
    int itemsNumber;
    int maxSum;

    @XmlElement
    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @XmlElement
    public String getSortingType() {
        return sortingType;
    }

    public void setSortingType(String sortingType) {
        this.sortingType = sortingType;
    }

    @XmlElement
    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    @XmlElement
    public int getMaxSum() {
        return maxSum;
    }

    public void setMaxSum(int maxSum) {
        this.maxSum = maxSum;
    }

    @XmlElement
    public int getItemsNumber() {
        return itemsNumber;
    }

    public void setItemsNumber(int itemsNumber) {
        this.itemsNumber = itemsNumber;
    }
}