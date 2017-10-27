/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.xbwee.noise.module;

public class Billow extends Module {
  private transient long swigCPtr;

  protected Billow(long cPtr, boolean cMemoryOwn) {
    super(NoiseModuleJNI.Billow_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Billow obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        NoiseModuleJNI.delete_Billow(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Billow() {
    this(NoiseModuleJNI.new_Billow(), true);
  }

  public double GetFrequency() {
    return NoiseModuleJNI.Billow_GetFrequency(swigCPtr, this);
  }

  public double GetLacunarity() {
    return NoiseModuleJNI.Billow_GetLacunarity(swigCPtr, this);
  }

  public SWIGTYPE_p_noise__NoiseQuality GetNoiseQuality() {
    return new SWIGTYPE_p_noise__NoiseQuality(NoiseModuleJNI.Billow_GetNoiseQuality(swigCPtr, this), true);
  }

  public int GetOctaveCount() {
    return NoiseModuleJNI.Billow_GetOctaveCount(swigCPtr, this);
  }

  public double GetPersistence() {
    return NoiseModuleJNI.Billow_GetPersistence(swigCPtr, this);
  }

  public int GetSeed() {
    return NoiseModuleJNI.Billow_GetSeed(swigCPtr, this);
  }

  public int GetSourceModuleCount() {
    return NoiseModuleJNI.Billow_GetSourceModuleCount(swigCPtr, this);
  }

  public double GetValue(double x, double y, double z) {
    return NoiseModuleJNI.Billow_GetValue(swigCPtr, this, x, y, z);
  }

  public void SetFrequency(double frequency) {
    NoiseModuleJNI.Billow_SetFrequency(swigCPtr, this, frequency);
  }

  public void SetLacunarity(double lacunarity) {
    NoiseModuleJNI.Billow_SetLacunarity(swigCPtr, this, lacunarity);
  }

  public void SetNoiseQuality(SWIGTYPE_p_noise__NoiseQuality noiseQuality) {
    NoiseModuleJNI.Billow_SetNoiseQuality(swigCPtr, this, SWIGTYPE_p_noise__NoiseQuality.getCPtr(noiseQuality));
  }

  public void SetOctaveCount(int octaveCount) {
    NoiseModuleJNI.Billow_SetOctaveCount(swigCPtr, this, octaveCount);
  }

  public void SetPersistence(double persistence) {
    NoiseModuleJNI.Billow_SetPersistence(swigCPtr, this, persistence);
  }

  public void SetSeed(int seed) {
    NoiseModuleJNI.Billow_SetSeed(swigCPtr, this, seed);
  }

}