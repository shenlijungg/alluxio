// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/table/table_master.proto

package alluxio.grpc.table;

public interface RangeSetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:alluxio.grpc.table.RangeSet)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .alluxio.grpc.table.Range ranges = 1;</code>
   */
  java.util.List<alluxio.grpc.table.Range> 
      getRangesList();
  /**
   * <code>repeated .alluxio.grpc.table.Range ranges = 1;</code>
   */
  alluxio.grpc.table.Range getRanges(int index);
  /**
   * <code>repeated .alluxio.grpc.table.Range ranges = 1;</code>
   */
  int getRangesCount();
  /**
   * <code>repeated .alluxio.grpc.table.Range ranges = 1;</code>
   */
  java.util.List<? extends alluxio.grpc.table.RangeOrBuilder> 
      getRangesOrBuilderList();
  /**
   * <code>repeated .alluxio.grpc.table.Range ranges = 1;</code>
   */
  alluxio.grpc.table.RangeOrBuilder getRangesOrBuilder(
      int index);
}
