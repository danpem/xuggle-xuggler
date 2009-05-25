/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.37
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.xuggle.ferry;

/**
 * Allows Java code to get data from a native buffers, and optionally 
 * modify native memory directly.  
 * <p>  
 * When accessing from Java, you can copy in and  
 * out ranges of buffers. You can do this by-copy  
 * (which is safer but a little slower) or by-reference  
 * where you <b>directly access underlying C++/native  
 * memory from Java</b>. Take special care if you decide  
 * that native access is required.  
 * </p>  
 * <p>  
 * When accessing from C++, you get direct access to  
 * the underlying buffer.  
 * </p>  
 */
public class IBuffer extends RefCounted {
  // IBuffer.swg: Start generated code
  // >>>>>>>>>>>>>>>>>>>>>>>>>>>

  private volatile long swigCPtr;

  /**
   * <strong>
   * DO NOT USE THIS CONSTRUCTOR - USE {@link #make(RefCounted,int)} INSTEAD.
   * </strong>
   * <p>
   * Internal Only. Do not allocate this object using new.  Not part of public API.
   * </p>
   * <p>
   * Unfortunately this constructor is public because the internal
   * implementation needs it to be, but do not pass in values to this method
   * as you may end up crashing the virtual machine.
   * </p>
   *
   * @param ignore1 ignore.
   * @param ignore2 ignore.
   *
   */ 
  public IBuffer(long ignore1, boolean ignore2) {
    super(FerryJNI.SWIGIBufferUpcast(ignore1), ignore2);
    swigCPtr = ignore1;
  }
  
  /**
   * Internal Only.  Not part of public API.
   *
   * Get the raw value of the native object that obj is proxying for.
   *   
   * @param obj The java proxy object for a native object.
   * @return The raw pointer obj is proxying for.
   */
  public static long getCPtr(IBuffer obj) {
    if (obj == null) return 0;
    return obj.getMyCPtr();
  }

  /**
   * Internal Only.  Not part of public API.
   *
   * Get the raw value of the native object that we're proxying for.
   *   
   * @return The raw pointer we're proxying for.
   */  
  public long getMyCPtr() {
    if (swigCPtr == 0) throw new IllegalStateException("underlying native object already deleted");
    return swigCPtr;
  }
  
  /**
   * Create a new IBuffer object that is actually referring to the
   * exact same underlying Native object.
   *
   * This method increases the ref count of the underlying Native object.
   *
   * @return the new Java object.
   */
  public IBuffer copyReference() {
    if (swigCPtr == 0)
      return null;
    else
    {
      IBuffer retval = new IBuffer(swigCPtr, false);
      retval.acquire();
      return retval;
    }
  }

  /**
   * Compares two values, returning true if the underlying objects in native code are the same object.
   *
   * That means you can have two different Java objects, but when you do a comparison, you'll find out
   * they are the EXACT same object.
   *
   * @return True if the underlying native object is the same.  False otherwise.
   */
  public boolean equals(Object obj) {
    boolean equal = false;
    if (obj instanceof IBuffer)
      equal = (((IBuffer)obj).swigCPtr == this.swigCPtr);
    return equal;
  }
  
  /**
   * Get a hashable value for this object.
   *
   * @return the hashable value.
   */
  public int hashCode() {
     return (int)swigCPtr;
  }
  
  /**
   * Returns up to length bytes, starting at offset in the underlying
   * buffer we're managing.
   *
   * <p> 
   * 
   * The buffer position, mark are initialized to zero and limit
   * is set to the maximum capacity of this buffer.  For some
   * IBuffer contents, the actual usable data in this buffer will
   * be less that the limit.  In those cases, use the
   * {@link #getByteBuffer(int, int)}
   * method on those objects directly and limit will be set to their
   * current content limit.
   * 
   * </p>
   */
  public java.nio.ByteBuffer getByteBuffer(int offset, int length)
  {
    return getByteBuffer(offset, length, null);
  }

  
    /**
     * For Advanced Users Only -- Do not use.
     * Returns up to length bytes, starting at offset in the underlying
     * buffer we're managing.
     *
     * <p> 
     * 
     * The buffer position, mark are initialized to zero and limit
     * is set to the maximum capacity of this buffer.  For some
     * IBuffer contents, the actual usable data in this buffer will
     * be less that the limit.  In those cases, use the
     * {@link #getByteBuffer(int, int)}
     * method on those objects directly and limit will be set to their
     * current content limit.
     * 
     * </p>
     * <p>
     *
     * WARNING: If you use this method you are access the direct native
     * memory associated with this buffer.  That means changes you make
     * to this buffer are immediately reflected in the underlying
     * memory.
     *    
     * </p>
     * <p>
     *
     * <b>NOTE FOR THE TRULY PARANOID</b>: Once you call this method,
     * the underlying native memory allocated will not be released until
     * all references to the returned value are no longer reachable and
     * at least one call to {@link JNIMemoryManager#gc()} has been
     * performed.
     * </p><p>
     *  The {@link JNIMemoryManager#gc()} is called whenever
     * xuggler tries to allocate new memory for any Xuggler interface,
     * so normally you don't need to care about this.  If for some
     * reason no other Xuggler object is ever allocated (forcing an
     * internal {@link JNIMemoryManager#gc()}), every Xuggler object has
     * a finalizer as well that will do the right thing.
     *
     * </p>
     * <p>
     *
     * But in the case of {@link java.nio.ByteBuffer} objects, we can't
     * set a finalizer, so
     * you may find situations where {@link JNIMemoryManager#gc()} is
     * not automatically called for you.  If you're truly paranoid or
     * haven't called a Xuggler interface in a a while, a call to {@link
     * JNIMemoryManager#gc()} never hurts.
     *
     * </p>
     * <p>
     *
     *  You can also start up
     * a separate thread to do this for you by calling
     * {@link JNIMemoryManager#startCollectionThread()}.  This thread
     * will only wake up when it has work to do, so the overhead
     * is very low.  We don't turn it on by default since in
     * 99.999% of cases you don't need to worry about it, but
     * you are reading the TRULY PARANOID section, so we'll assume
     * you care.
     *  
     * </p>
     * 
     * @param offset The offset (in bytes) into the buffer managed by
     *   this IBuffer
     * @param length The requested length (in bytes) you want to access.
     *   The buffer returned may actually be longer than length.
     * @param referenceReturn If non null, on exit 
     *   calling {@link com.util.concurrent.atomic.AtomicReference#get()}
     *   on this value will return a {@link JNIReference} you can use
     *   for explicitly de-allocting the underlying native store
     *   of the {@link java.nio.ByteBuffer}.  Call
     *   {@link JNIReference#delete()} for that.  <strong>Warning:</string>
     *   if you delete this reference, then the returned byte buffer
     *   will be invalid.  In most cases, just let Ferry delete it for
     *   you later.
     * @return A java.nio.ByteBuffer that directly accesses
     *   the native memory this IBuffer manages, or null if
     *   error.
     */

  public java.nio.ByteBuffer getByteBuffer(int offset, int length,
      java.util.concurrent.atomic.AtomicReference<JNIReference> referenceReturn)
  {
    java.nio.ByteBuffer retval = this.java_getByteBuffer(offset, length);
    if (retval != null)
    {
      // increment the ref count of this class to reflect the
      // byte buffer
      FerryJNI.RefCounted_acquire(swigCPtr, null);
      
      // and use the byte buffer as the reference to track
      JNIReference ref = JNIReference.createNonFerryReference(retval, swigCPtr);
      if (referenceReturn != null)
        referenceReturn.set(ref);
      
      // and tell Java this byte buffer is in native order
      retval.order(java.nio.ByteOrder.nativeOrder());
    }
    return retval;
  }
  
  // <<<<<<<<<<<<<<<<<<<<<<<<<<<
  // IBuffer.swg
  /**
   * Releases any underlying native memory and marks this object
   * as invalid.
   * <p>
   * Normally Ferry manages when to release native memory.
   * </p>
   * <p>
   * In the unlikely event you want to control EXACTLY when a native 
   * object is released, each Xuggler object has a {@link #delete()}
   * method that you can use. Once you call {@link #delete()},
   * you must ENSURE your object is never referenced again from
   * that Java object -- Ferry tries to help you avoid crashes if you
   * accidentally use an object after deletion but on this but we
   * cannot offer 100% protection (specifically if another thread
   *  is accessing that object EXACTLY when you {@link #delete()} it). 
   * </p>
   */

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      throw new UnsupportedOperationException("C++ destructor does not have public access");
    }
    swigCPtr = 0;
    super.delete();
  }

/**
 * Get the current maximum number of bytes that can  
 * be safely placed in this buffer.  
 * @return	Maximum number of bytes this buffer can manage.  
 */
  public int getBufferSize() {
    return FerryJNI.IBuffer_getBufferSize(swigCPtr, this);
  }

/**
 * Allocate a new buffer of at least bufferSize.  
 * @param	requestor An optional value telling the IBuffer class what 
 *		 object requested it. This is used for debugging 
 *		 memory leaks; it's a marker for the FERRY object 
 *		 (e.g. IPacket) that actually requested the buffer. 
 *		 If you're not an FERRY object, pass in null here. 
 *		  
 * @param	bufferSize The minimum buffer size you're requesting in bytes; 
 *		 a buffer with a larger size may be returned.  
 * @return	A new buffer, or null on error.  
 */
  public static IBuffer make(RefCounted requestor, int bufferSize) {
    long cPtr = FerryJNI.IBuffer_make__SWIG_0(RefCounted.getCPtr(requestor), requestor, bufferSize);
    return (cPtr == 0) ? null : new IBuffer(cPtr, false);
  }

/**
 * Internal only. Do not use.  
 */
  public java.nio.ByteBuffer java_getByteBuffer(int offset, int length) {
    return FerryJNI.IBuffer_java_getByteBuffer(swigCPtr, this, offset, length);
  }

/**
 * Returns up to length bytes, starting at offset in the  
 * underlying buffer we're managing.  
 * <p>  
 * This method COPIES the data into the byte array being  
 * returned..  
 * </p><p>  
 * If you don't NEED the direct access that getByteBuffer  
 * offers (and most programs can in fact take the performance  
 * hit of the copy), we recommend you use this method.  
 * It's much harder to accidentally leave native memory lying  
 * around waiting for cleanup then.  
 * </p>  
 * @param	offset The offset (in bytes) into the buffer managed by this 
 *		 IBuffer  
 * @param	length The requested length (in bytes) you want to access. 
 *		 The buffer returned may  
 * actually be longer than length.  
 * @return	A copy of the data that is in this IBuffer, or null  
 * if error.  
 */
  public byte[] getByteArray(int offset, int length) {
    return FerryJNI.IBuffer_getByteArray(swigCPtr, this, offset, length);
  }

/**
 * Allocate a new IBuffer, and copy the data in buffer into  
 * the new IBuffer object.  
 * @param	requestor An optional value telling the IBuffer class  
 * what object requested it. This is used for debugging memory leaks; 
 *  
 *  
 * requested the buffer. If you're not an FERRY object, pass in null 
 * here.  
 * @param	buffer A java byte buffer for the data containing the  
 * data you want to copy.  
 * @param	offset The starting offset in buffer where you want  
 * to start copying.  
 * @param	length The total number of bytes you want to copy from buffer. 
 *		  
 *  
 * or null on failure.  
 */
  public static IBuffer make(RefCounted requestor, byte[] buffer, int offset, int length) {
    long cPtr = FerryJNI.IBuffer_make__SWIG_1(RefCounted.getCPtr(requestor), requestor, buffer, offset, length);
    return (cPtr == 0) ? null : new IBuffer(cPtr, false);
  }

/**
 * Create a new IBuffer object that uses the direct byte buffer  
 * passed in by reference (i.e. it directly uses the bytes in  
 * the direct byte buffer).  
 * @param	requestor An optional value telling the IBuffer class  
 * what object requested it. This is used for debugging memory leaks; 
 *  
 *  
 * requested the buffer. If you're not an FERRY object, pass in null 
 * here.  
 * @param	directByteBuffer A direct {@link java.nio.ByteBuffer} object 
 *		  
 * you want to use for your memory. This must be a direct object -- 
 *  
 * non direct objects will result in an JVM-dependent exception  
 * being thrown.  
 * @param	offset The starting offset in directByteBuffer where you want 
 *		  
 * to start copying.  
 * @param	length The total number of bytes you want to copy from  
 * directByteBuffer.  
 * @return	a new IBuffer object that is using directByteBuffer  
 * behind the scenes, or null on failure.  
 */
  public static IBuffer make(RefCounted requestor, java.nio.ByteBuffer directByteBuffer, int offset, int length) {
    long cPtr = FerryJNI.IBuffer_make__SWIG_2(RefCounted.getCPtr(requestor), requestor, directByteBuffer, offset, length);
    return (cPtr == 0) ? null : new IBuffer(cPtr, false);
  }

}
