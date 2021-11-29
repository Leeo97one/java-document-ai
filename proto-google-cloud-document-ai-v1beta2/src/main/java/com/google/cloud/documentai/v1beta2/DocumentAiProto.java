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
// source: google/cloud/documentai/v1beta2/document_understanding.proto

package com.google.cloud.documentai.v1beta2;

public final class DocumentAiProto {
  private DocumentAiProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta2_BatchProcessDocumentsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta2_BatchProcessDocumentsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta2_ProcessDocumentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta2_ProcessDocumentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta2_BatchProcessDocumentsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta2_BatchProcessDocumentsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta2_ProcessDocumentResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta2_ProcessDocumentResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta2_OcrParams_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta2_OcrParams_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta2_TableExtractionParams_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta2_TableExtractionParams_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta2_TableBoundHint_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta2_TableBoundHint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta2_FormExtractionParams_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta2_FormExtractionParams_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta2_KeyValuePairHint_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta2_KeyValuePairHint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta2_EntityExtractionParams_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta2_EntityExtractionParams_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta2_AutoMlParams_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta2_AutoMlParams_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta2_InputConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta2_InputConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta2_OutputConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta2_OutputConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta2_GcsSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta2_GcsSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta2_GcsDestination_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta2_GcsDestination_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta2_OperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta2_OperationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + "<google/cloud/documentai/v1beta2/document_understanding.proto\022\037google.cloud.doc"
          + "umentai.v1beta2\032\034google/api/annotations.proto\032\027google/api/client.proto\032\037google/api/field_behavior.proto\032.google/cloud/documentai/v1beta2/document.proto\032.google/cloud/documentai/v1beta2/geometry.proto\032#google/longrunning/operations.proto\032\037google/protobuf/timestamp.proto\"~\n"
          + "\034BatchProcessDocumentsRequest\022N\n"
          + "\010requests\030\001"
          + " \003(\01327.google.cloud.documentai.v1beta2.ProcessDocumentRequestB\003\340A\002\022\016\n"
          + "\006parent\030\002 \001(\t\"\344\004\n"
          + "\026ProcessDocumentRequest\022\016\n"
          + "\006parent\030\t \001(\t\022G\n"
          + "\014input_config\030\001"
          + " \001(\0132,.google.cloud.documentai.v1beta2.InputConfigB\003\340A\002\022I\n\r"
          + "output_config\030\002"
          + " \001(\0132-.google.cloud.documentai.v1beta2.OutputConfigB\003\340A\001\022\025\n\r"
          + "document_type\030\003 \001(\t\022W\n"
          + "\027table_extraction_params\030\004"
          + " \001(\01326.google.cloud.documentai.v1beta2.TableExtractionParams\022U\n"
          + "\026form_extraction_params\030\005"
          + " \001(\01325.google.cloud.documentai.v1beta2.FormExtractionParams\022Y\n"
          + "\030entity_extraction_params\030\006"
          + " \001(\01327.google.cloud.documentai.v1beta2.EntityExtractionParams\022>\n\n"
          + "ocr_params\030\007 \001(\0132*.google.cloud.documentai.v1beta2.OcrParams\022D\n\r"
          + "automl_params\030\010 \001(\0132-.google.cloud.documentai.v1beta2.AutoMlParams\"l\n"
          + "\035BatchProcessDocumentsResponse\022K\n"
          + "\tresponses\030\001"
          + " \003(\01328.google.cloud.documentai.v1beta2.ProcessDocumentResponse\"\243\001\n"
          + "\027ProcessDocumentResponse\022B\n"
          + "\014input_config\030\001"
          + " \001(\0132,.google.cloud.documentai.v1beta2.InputConfig\022D\n\r"
          + "output_config\030\002 \001(\0132-.google.cloud.documentai.v1beta2.OutputConfig\"#\n"
          + "\tOcrParams\022\026\n"
          + "\016language_hints\030\001 \003(\t\"\253\001\n"
          + "\025TableExtractionParams\022\017\n"
          + "\007enabled\030\001 \001(\010\022O\n"
          + "\021table_bound_hints\030\002"
          + " \003(\0132/.google.cloud.documentai.v1beta2.TableBoundHintB\003\340A\001\022\031\n"
          + "\014header_hints\030\003 \003(\tB\003\340A\001\022\025\n\r"
          + "model_version\030\004 \001(\t\"o\n"
          + "\016TableBoundHint\022\030\n"
          + "\013page_number\030\001 \001(\005B\003\340A\001\022C\n"
          + "\014bounding_box\030\002"
          + " \001(\0132-.google.cloud.documentai.v1beta2.BoundingPoly\"\217\001\n"
          + "\024FormExtractionParams\022\017\n"
          + "\007enabled\030\001 \001(\010\022O\n"
          + "\024key_value_pair_hints\030\002"
          + " \003(\01321.google.cloud.documentai.v1beta2.KeyValuePairHint\022\025\n\r"
          + "model_version\030\003 \001(\t\"4\n"
          + "\020KeyValuePairHint\022\013\n"
          + "\003key\030\001 \001(\t\022\023\n"
          + "\013value_types\030\002 \003(\t\"@\n"
          + "\026EntityExtractionParams\022\017\n"
          + "\007enabled\030\001 \001(\010\022\025\n\r"
          + "model_version\030\002 \001(\t\"\035\n"
          + "\014AutoMlParams\022\r\n"
          + "\005model\030\001 \001(\t\"\205\001\n"
          + "\013InputConfig\022@\n\n"
          + "gcs_source\030\001"
          + " \001(\0132*.google.cloud.documentai.v1beta2.GcsSourceH\000\022\022\n"
          + "\010contents\030\003 \001(\014H\000\022\026\n"
          + "\tmime_type\030\002 \001(\tB\003\340A\002B\010\n"
          + "\006source\"\202\001\n"
          + "\014OutputConfig\022J\n"
          + "\017gcs_destination\030\001"
          + " \001(\0132/.google.cloud.documentai.v1beta2.GcsDestinationH\000\022\027\n"
          + "\017pages_per_shard\030\002 \001(\005B\r\n"
          + "\013destination\"\035\n"
          + "\tGcsSource\022\020\n"
          + "\003uri\030\001 \001(\tB\003\340A\002\"\"\n"
          + "\016GcsDestination\022\020\n"
          + "\003uri\030\001 \001(\tB\003\340A\002\"\307\002\n"
          + "\021OperationMetadata\022G\n"
          + "\005state\030\001"
          + " \001(\01628.google.cloud.documentai.v1beta2.OperationMetadata.State\022\025\n\r"
          + "state_message\030\002 \001(\t\022/\n"
          + "\013create_time\030\003 \001(\0132\032.google.protobuf.Timestamp\022/\n"
          + "\013update_time\030\004 \001(\0132\032.google.protobuf.Timestamp\"p\n"
          + "\005State\022\025\n"
          + "\021STATE_UNSPECIFIED\020\000\022\014\n"
          + "\010ACCEPTED\020\001\022\013\n"
          + "\007WAITING\020\002\022\013\n"
          + "\007RUNNING\020\003\022\r\n"
          + "\tSUCCEEDED\020\004\022\r\n"
          + "\tCANCELLED\020\005\022\n\n"
          + "\006FAILED\020\0062\240\005\n"
          + "\034DocumentUnderstandingService\022\274\002\n"
          + "\025BatchProcessDocuments\022=.google.cloud.documentai.v1beta2.BatchProcessDocumentsRequest\032\035.google.longrunning.Operation\"\304\001\202\323\344\223\002~\"?/v1beta2/{parent=projects/*/locations/*}/documents:batchProcess:\001*Z8\"3/v1beta2/{parent=projects/*}/documents:batchProcess:\001*\332A\010requests\312A2\n"
          + "\035BatchProcessDocumentsResponse\022\021OperationMetadata\022\361\001\n"
          + "\017ProcessDocument\0227.google.cloud.documentai.v1beta2.ProcessDocumentReq"
          + "uest\032).google.cloud.documentai.v1beta2.Document\"z\202\323\344\223\002t\":/v1beta2/{parent=projects/*/locations/*}/documents:process:\001*Z3\"./v1beta2/{parent=projects/*}/documents:process:\001*\032M\312A\031documentai.googleapis.com\322A.https://www.googleapis.com/auth/cloud-platformB\354\001\n"
          + "#com.google.cloud.documentai.v1beta2B\017DocumentAiProtoP\001ZIgoogle.go"
          + "lang.org/genproto/googleapis/cloud/docum"
          + "entai/v1beta2;documentai\252\002\037Google.Cloud."
          + "DocumentAI.V1Beta2\312\002\037Google\\Cloud\\Docume"
          + "ntAI\\V1beta2\352\002\"Google::Cloud::DocumentAI::V1beta2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.cloud.documentai.v1beta2.DocumentProto.getDescriptor(),
              com.google.cloud.documentai.v1beta2.GeometryProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_documentai_v1beta2_BatchProcessDocumentsRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_documentai_v1beta2_BatchProcessDocumentsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta2_BatchProcessDocumentsRequest_descriptor,
            new java.lang.String[] {
              "Requests", "Parent",
            });
    internal_static_google_cloud_documentai_v1beta2_ProcessDocumentRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_documentai_v1beta2_ProcessDocumentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta2_ProcessDocumentRequest_descriptor,
            new java.lang.String[] {
              "Parent",
              "InputConfig",
              "OutputConfig",
              "DocumentType",
              "TableExtractionParams",
              "FormExtractionParams",
              "EntityExtractionParams",
              "OcrParams",
              "AutomlParams",
            });
    internal_static_google_cloud_documentai_v1beta2_BatchProcessDocumentsResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_documentai_v1beta2_BatchProcessDocumentsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta2_BatchProcessDocumentsResponse_descriptor,
            new java.lang.String[] {
              "Responses",
            });
    internal_static_google_cloud_documentai_v1beta2_ProcessDocumentResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_documentai_v1beta2_ProcessDocumentResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta2_ProcessDocumentResponse_descriptor,
            new java.lang.String[] {
              "InputConfig", "OutputConfig",
            });
    internal_static_google_cloud_documentai_v1beta2_OcrParams_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_documentai_v1beta2_OcrParams_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta2_OcrParams_descriptor,
            new java.lang.String[] {
              "LanguageHints",
            });
    internal_static_google_cloud_documentai_v1beta2_TableExtractionParams_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_documentai_v1beta2_TableExtractionParams_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta2_TableExtractionParams_descriptor,
            new java.lang.String[] {
              "Enabled", "TableBoundHints", "HeaderHints", "ModelVersion",
            });
    internal_static_google_cloud_documentai_v1beta2_TableBoundHint_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_documentai_v1beta2_TableBoundHint_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta2_TableBoundHint_descriptor,
            new java.lang.String[] {
              "PageNumber", "BoundingBox",
            });
    internal_static_google_cloud_documentai_v1beta2_FormExtractionParams_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_documentai_v1beta2_FormExtractionParams_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta2_FormExtractionParams_descriptor,
            new java.lang.String[] {
              "Enabled", "KeyValuePairHints", "ModelVersion",
            });
    internal_static_google_cloud_documentai_v1beta2_KeyValuePairHint_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_documentai_v1beta2_KeyValuePairHint_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta2_KeyValuePairHint_descriptor,
            new java.lang.String[] {
              "Key", "ValueTypes",
            });
    internal_static_google_cloud_documentai_v1beta2_EntityExtractionParams_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_documentai_v1beta2_EntityExtractionParams_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta2_EntityExtractionParams_descriptor,
            new java.lang.String[] {
              "Enabled", "ModelVersion",
            });
    internal_static_google_cloud_documentai_v1beta2_AutoMlParams_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_documentai_v1beta2_AutoMlParams_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta2_AutoMlParams_descriptor,
            new java.lang.String[] {
              "Model",
            });
    internal_static_google_cloud_documentai_v1beta2_InputConfig_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_documentai_v1beta2_InputConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta2_InputConfig_descriptor,
            new java.lang.String[] {
              "GcsSource", "Contents", "MimeType", "Source",
            });
    internal_static_google_cloud_documentai_v1beta2_OutputConfig_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_documentai_v1beta2_OutputConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta2_OutputConfig_descriptor,
            new java.lang.String[] {
              "GcsDestination", "PagesPerShard", "Destination",
            });
    internal_static_google_cloud_documentai_v1beta2_GcsSource_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_documentai_v1beta2_GcsSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta2_GcsSource_descriptor,
            new java.lang.String[] {
              "Uri",
            });
    internal_static_google_cloud_documentai_v1beta2_GcsDestination_descriptor =
        getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_documentai_v1beta2_GcsDestination_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta2_GcsDestination_descriptor,
            new java.lang.String[] {
              "Uri",
            });
    internal_static_google_cloud_documentai_v1beta2_OperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(15);
    internal_static_google_cloud_documentai_v1beta2_OperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta2_OperationMetadata_descriptor,
            new java.lang.String[] {
              "State", "StateMessage", "CreateTime", "UpdateTime",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.cloud.documentai.v1beta2.DocumentProto.getDescriptor();
    com.google.cloud.documentai.v1beta2.GeometryProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
