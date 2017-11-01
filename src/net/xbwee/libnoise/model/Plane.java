/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.xbwee.libnoise.model;

import net.xbwee.libnoise.module.Module;

public class Plane {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Plane(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Plane obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        NoiseModelJNI.delete_Plane(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Plane() {
    this(NoiseModelJNI.new_Plane__SWIG_0(), true);
  }

  public Plane(Module module) {
    this(NoiseModelJNI.new_Plane__SWIG_1(Module.getCPtr(module), module), true);
  }

  public Module GetModule() {
    return new Module(NoiseModelJNI.Plane_GetModule(swigCPtr, this), false);
  }

  public double GetValue(double x, double z) {
    return NoiseModelJNI.Plane_GetValue(swigCPtr, this, x, z);
  }

  public void SetModule(Module module) {
    NoiseModelJNI.Plane_SetModule(swigCPtr, this, Module.getCPtr(module), module);
  }

}