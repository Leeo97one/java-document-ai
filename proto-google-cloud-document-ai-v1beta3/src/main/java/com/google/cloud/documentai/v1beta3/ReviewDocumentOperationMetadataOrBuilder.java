/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/documentai/v1beta3/document_processor_service.proto

package com.google.cloud.documentai.v1beta3;

public interface ReviewDocumentOperationMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.documentai.v1beta3.ReviewDocumentOperationMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Used only when Operation.done is false.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.ReviewDocumentOperationMetadata.State state = 1;</code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Used only when Operation.done is false.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.ReviewDocumentOperationMetadata.State state = 1;</code>
   *
   * @return The state.
   */
  com.google.cloud.documentai.v1beta3.ReviewDocumentOperationMetadata.State getState();

  /**
   *
   *
   * <pre>
   * A message providing more details about the current state of processing.
   * For example, the error message if the operation is failed.
   * </pre>
   *
   * <code>string state_message = 2;</code>
   *
   * @return The stateMessage.
   */
  java.lang.String getStateMessage();
  /**
   *
   *
   * <pre>
   * A message providing more details about the current state of processing.
   * For example, the error message if the operation is failed.
   * </pre>
   *
   * <code>string state_message = 2;</code>
   *
   * @return The bytes for stateMessage.
   */
  com.google.protobuf.ByteString getStateMessageBytes();

  /**
   *
   *
   * <pre>
   * The creation time of the operation.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3;</code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * The creation time of the operation.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3;</code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * The creation time of the operation.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The last update time of the operation.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4;</code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * The last update time of the operation.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4;</code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * The last update time of the operation.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The basic metadata of the long running operation.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.CommonOperationMetadata common_metadata = 5;</code>
   *
   * @return Whether the commonMetadata field is set.
   */
  boolean hasCommonMetadata();
  /**
   *
   *
   * <pre>
   * The basic metadata of the long running operation.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.CommonOperationMetadata common_metadata = 5;</code>
   *
   * @return The commonMetadata.
   */
  com.google.cloud.documentai.v1beta3.CommonOperationMetadata getCommonMetadata();
  /**
   *
   *
   * <pre>
   * The basic metadata of the long running operation.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.CommonOperationMetadata common_metadata = 5;</code>
   */
  com.google.cloud.documentai.v1beta3.CommonOperationMetadataOrBuilder getCommonMetadataOrBuilder();

  /**
   *
   *
   * <pre>
   * The question ID.
   * </pre>
   *
   * <code>string question_id = 6;</code>
   *
   * @return The questionId.
   */
  java.lang.String getQuestionId();
  /**
   *
   *
   * <pre>
   * The question ID.
   * </pre>
   *
   * <code>string question_id = 6;</code>
   *
   * @return The bytes for questionId.
   */
  com.google.protobuf.ByteString getQuestionIdBytes();
}
