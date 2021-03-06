/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.xbwee.libnoise.utils;

import net.xbwee.libnoise.module.Module;

public class NoiseMap {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public NoiseMap(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(NoiseMap obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        NoiseUtilsJNI.delete_NoiseMap(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public NoiseMap() {
    this(NoiseUtilsJNI.new_NoiseMap__SWIG_0(), true);
  }

  public NoiseMap(int width, int height) {
    this(NoiseUtilsJNI.new_NoiseMap__SWIG_1(width, height), true);
  }

  public NoiseMap(NoiseMap rhs) {
    this(NoiseUtilsJNI.new_NoiseMap__SWIG_2(NoiseMap.getCPtr(rhs), rhs), true);
  }

  public void Clear(float value) {
    NoiseUtilsJNI.NoiseMap_Clear(swigCPtr, this, value);
  }

  public float GetBorderValue() {
    return NoiseUtilsJNI.NoiseMap_GetBorderValue(swigCPtr, this);
  }

  public SWIGTYPE_p_float GetConstSlabPtr() {
    long cPtr = NoiseUtilsJNI.NoiseMap_GetConstSlabPtr__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_float(cPtr, false);
  }

  public SWIGTYPE_p_float GetConstSlabPtr(int row) {
    long cPtr = NoiseUtilsJNI.NoiseMap_GetConstSlabPtr__SWIG_1(swigCPtr, this, row);
    return (cPtr == 0) ? null : new SWIGTYPE_p_float(cPtr, false);
  }

  public SWIGTYPE_p_float GetConstSlabPtr(int x, int y) {
    long cPtr = NoiseUtilsJNI.NoiseMap_GetConstSlabPtr__SWIG_2(swigCPtr, this, x, y);
    return (cPtr == 0) ? null : new SWIGTYPE_p_float(cPtr, false);
  }

  public int GetHeight() {
    return NoiseUtilsJNI.NoiseMap_GetHeight(swigCPtr, this);
  }

  public long GetMemUsed() {
    return NoiseUtilsJNI.NoiseMap_GetMemUsed(swigCPtr, this);
  }

  public SWIGTYPE_p_float GetSlabPtr() {
    long cPtr = NoiseUtilsJNI.NoiseMap_GetSlabPtr__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_float(cPtr, false);
  }

  public SWIGTYPE_p_float GetSlabPtr(int row) {
    long cPtr = NoiseUtilsJNI.NoiseMap_GetSlabPtr__SWIG_1(swigCPtr, this, row);
    return (cPtr == 0) ? null : new SWIGTYPE_p_float(cPtr, false);
  }

  public SWIGTYPE_p_float GetSlabPtr(int x, int y) {
    long cPtr = NoiseUtilsJNI.NoiseMap_GetSlabPtr__SWIG_2(swigCPtr, this, x, y);
    return (cPtr == 0) ? null : new SWIGTYPE_p_float(cPtr, false);
  }

  public int GetStride() {
    return NoiseUtilsJNI.NoiseMap_GetStride(swigCPtr, this);
  }

  public float GetValue(int x, int y) {
    return NoiseUtilsJNI.NoiseMap_GetValue(swigCPtr, this, x, y);
  }

  public int GetWidth() {
    return NoiseUtilsJNI.NoiseMap_GetWidth(swigCPtr, this);
  }

  public void ReclaimMem() {
    NoiseUtilsJNI.NoiseMap_ReclaimMem(swigCPtr, this);
  }

  public void SetBorderValue(float borderValue) {
    NoiseUtilsJNI.NoiseMap_SetBorderValue(swigCPtr, this, borderValue);
  }

  public void SetSize(int width, int height) {
    NoiseUtilsJNI.NoiseMap_SetSize(swigCPtr, this, width, height);
  }

  public void SetValue(int x, int y, float value) {
    NoiseUtilsJNI.NoiseMap_SetValue(swigCPtr, this, x, y, value);
  }

  public void TakeOwnership(NoiseMap source) {
    NoiseUtilsJNI.NoiseMap_TakeOwnership(swigCPtr, this, NoiseMap.getCPtr(source), source);
  }

}
