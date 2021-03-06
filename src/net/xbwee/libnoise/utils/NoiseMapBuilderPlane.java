/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.xbwee.libnoise.utils;

import net.xbwee.libnoise.module.Module;

public class NoiseMapBuilderPlane extends NoiseMapBuilder {
  private transient long swigCPtr;

  public NoiseMapBuilderPlane(long cPtr, boolean cMemoryOwn) {
    super(NoiseUtilsJNI.NoiseMapBuilderPlane_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(NoiseMapBuilderPlane obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        NoiseUtilsJNI.delete_NoiseMapBuilderPlane(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public NoiseMapBuilderPlane() {
    this(NoiseUtilsJNI.new_NoiseMapBuilderPlane(), true);
  }

  public void Build() {
    NoiseUtilsJNI.NoiseMapBuilderPlane_Build(swigCPtr, this);
  }

  public void EnableSeamless(boolean enable) {
    NoiseUtilsJNI.NoiseMapBuilderPlane_EnableSeamless__SWIG_0(swigCPtr, this, enable);
  }

  public void EnableSeamless() {
    NoiseUtilsJNI.NoiseMapBuilderPlane_EnableSeamless__SWIG_1(swigCPtr, this);
  }

  public double GetLowerXBound() {
    return NoiseUtilsJNI.NoiseMapBuilderPlane_GetLowerXBound(swigCPtr, this);
  }

  public double GetLowerZBound() {
    return NoiseUtilsJNI.NoiseMapBuilderPlane_GetLowerZBound(swigCPtr, this);
  }

  public double GetUpperXBound() {
    return NoiseUtilsJNI.NoiseMapBuilderPlane_GetUpperXBound(swigCPtr, this);
  }

  public double GetUpperZBound() {
    return NoiseUtilsJNI.NoiseMapBuilderPlane_GetUpperZBound(swigCPtr, this);
  }

  public boolean IsSeamlessEnabled() {
    return NoiseUtilsJNI.NoiseMapBuilderPlane_IsSeamlessEnabled(swigCPtr, this);
  }

  public void SetBounds(double lowerXBound, double upperXBound, double lowerZBound, double upperZBound) {
    NoiseUtilsJNI.NoiseMapBuilderPlane_SetBounds(swigCPtr, this, lowerXBound, upperXBound, lowerZBound, upperZBound);
  }

}
