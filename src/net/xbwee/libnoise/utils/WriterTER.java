/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.xbwee.libnoise.utils;

import net.xbwee.libnoise.module.Module;

public class WriterTER {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public WriterTER(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(WriterTER obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        NoiseUtilsJNI.delete_WriterTER(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public WriterTER() {
    this(NoiseUtilsJNI.new_WriterTER(), true);
  }

  public String GetDestFilename() {
    return NoiseUtilsJNI.WriterTER_GetDestFilename(swigCPtr, this);
  }

  public float GetMetersPerPoint() {
    return NoiseUtilsJNI.WriterTER_GetMetersPerPoint(swigCPtr, this);
  }

  public void SetDestFilename(String filename) {
    NoiseUtilsJNI.WriterTER_SetDestFilename(swigCPtr, this, filename);
  }

  public void SetMetersPerPoint(float metersPerPoint) {
    NoiseUtilsJNI.WriterTER_SetMetersPerPoint(swigCPtr, this, metersPerPoint);
  }

  public void SetSourceNoiseMap(NoiseMap sourceNoiseMap) {
    NoiseUtilsJNI.WriterTER_SetSourceNoiseMap(swigCPtr, this, NoiseMap.getCPtr(sourceNoiseMap), sourceNoiseMap);
  }

  public void WriteDestFile() {
    NoiseUtilsJNI.WriterTER_WriteDestFile(swigCPtr, this);
  }

}
