package com.c;

public class VerifyImage {
 private int locationX;
 private int locationY;
 private String srcImageBASE64;
 private String markImageBASE64;

 public VerifyImage(String srcImageBASE64, String markImageBASE64, int locationX, int locationY) {
  super();
  this.locationX = locationX;
  this.locationY = locationY;
  this.srcImageBASE64 = srcImageBASE64;
  this.markImageBASE64 = markImageBASE64;
 }
 public int getLocationX() {
  return locationX;
 }
 public void setLocationX(int locationX) {
  this.locationX = locationX;
 }
 public int getLocationY() {
  return locationY;
 }
 public void setLocationY(int locationY) {
  this.locationY = locationY;
 }
 public String getSrcImageBASE64() {
  return srcImageBASE64;
 }
 public void setSrcImageBASE64(String srcImageBASE64) {
  this.srcImageBASE64 = srcImageBASE64;
 }
 public String getMarkImageBASE64() {
  return markImageBASE64;
 }
 public void setMarkImageBASE64(String markImageBASE64) {
  this.markImageBASE64 = markImageBASE64;
 }
 @Override
 public String toString() {
  return "VerifyImage [locationX=" + locationX + ", locationY=" + locationY + ", srcImageBASE64=" + srcImageBASE64
    + ", markImageBASE64=" + markImageBASE64 + "]";
 }

}
