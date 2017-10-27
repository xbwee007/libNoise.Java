/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.xbwee.noise.module;

public class Checkerboard extends Module {
  private transient long swigCPtr;

  protected Checkerboard(long cPtr, boolean cMemoryOwn) {
    super(NoiseModuleJNI.Checkerboard_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Checkerboard obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        NoiseModuleJNI.delete_Checkerboard(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Checkerboard() {
    this(NoiseModuleJNI.new_Checkerboard(), true);
  }

  public int GetSourceModuleCount() {
    return NoiseModuleJNI.Checkerboard_GetSourceModuleCount(swigCPtr, this);
  }

  public double GetValue(double x, double y, double z) {
    return NoiseModuleJNI.Checkerboard_GetValue(swigCPtr, this, x, y, z);
  }

}