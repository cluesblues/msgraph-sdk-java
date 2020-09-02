// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Health Attestation State.
 */
public class DeviceHealthAttestationState implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Attestation Identity Key.
     * TWhen an Attestation Identity Key (AIK) is present on a device, it indicates that the device has an endorsement key (EK) certificate.
     */
    @SerializedName("attestationIdentityKey")
    @Expose
    public String attestationIdentityKey;

    /**
     * The Bit Locker Status.
     * On or Off of BitLocker Drive Encryption
     */
    @SerializedName("bitLockerStatus")
    @Expose
    public String bitLockerStatus;

    /**
     * The Boot App Security Version.
     * The security version number of the Boot Application
     */
    @SerializedName("bootAppSecurityVersion")
    @Expose
    public String bootAppSecurityVersion;

    /**
     * The Boot Debugging.
     * When bootDebugging is enabled, the device is used in development and testing
     */
    @SerializedName("bootDebugging")
    @Expose
    public String bootDebugging;

    /**
     * The Boot Manager Security Version.
     * The security version number of the Boot Application
     */
    @SerializedName("bootManagerSecurityVersion")
    @Expose
    public String bootManagerSecurityVersion;

    /**
     * The Boot Manager Version.
     * The version of the Boot Manager
     */
    @SerializedName("bootManagerVersion")
    @Expose
    public String bootManagerVersion;

    /**
     * The Boot Revision List Info.
     * The Boot Revision List that was loaded during initial boot on the attested device
     */
    @SerializedName("bootRevisionListInfo")
    @Expose
    public String bootRevisionListInfo;

    /**
     * The Code Integrity.
     * When code integrity is enabled, code execution is restricted to integrity verified code
     */
    @SerializedName("codeIntegrity")
    @Expose
    public String codeIntegrity;

    /**
     * The Code Integrity Check Version.
     * The version of the Boot Manager
     */
    @SerializedName("codeIntegrityCheckVersion")
    @Expose
    public String codeIntegrityCheckVersion;

    /**
     * The Code Integrity Policy.
     * The Code Integrity policy that is controlling the security of the boot environment
     */
    @SerializedName("codeIntegrityPolicy")
    @Expose
    public String codeIntegrityPolicy;

    /**
     * The Content Namespace Url.
     * The DHA report version. (Namespace version)
     */
    @SerializedName("contentNamespaceUrl")
    @Expose
    public String contentNamespaceUrl;

    /**
     * The Content Version.
     * The HealthAttestation state schema version
     */
    @SerializedName("contentVersion")
    @Expose
    public String contentVersion;

    /**
     * The Data Excution Policy.
     * DEP Policy defines a set of hardware and software technologies that perform additional checks on memory
     */
    @SerializedName("dataExcutionPolicy")
    @Expose
    public String dataExcutionPolicy;

    /**
     * The Device Health Attestation Status.
     * The DHA report version. (Namespace version)
     */
    @SerializedName("deviceHealthAttestationStatus")
    @Expose
    public String deviceHealthAttestationStatus;

    /**
     * The Early Launch Anti Malware Driver Protection.
     * ELAM provides protection for the computers in your network when they start up
     */
    @SerializedName("earlyLaunchAntiMalwareDriverProtection")
    @Expose
    public String earlyLaunchAntiMalwareDriverProtection;

    /**
     * The Health Attestation Supported Status.
     * This attribute indicates if DHA is supported for the device
     */
    @SerializedName("healthAttestationSupportedStatus")
    @Expose
    public String healthAttestationSupportedStatus;

    /**
     * The Health Status Mismatch Info.
     * This attribute appears if DHA-Service detects an integrity issue
     */
    @SerializedName("healthStatusMismatchInfo")
    @Expose
    public String healthStatusMismatchInfo;

    /**
     * The Issued Date Time.
     * The DateTime when device was evaluated or issued to MDM
     */
    @SerializedName("issuedDateTime")
    @Expose
    public java.util.Calendar issuedDateTime;

    /**
     * The Last Update Date Time.
     * The Timestamp of the last update.
     */
    @SerializedName("lastUpdateDateTime")
    @Expose
    public String lastUpdateDateTime;

    /**
     * The Operating System Kernel Debugging.
     * When operatingSystemKernelDebugging is enabled, the device is used in development and testing
     */
    @SerializedName("operatingSystemKernelDebugging")
    @Expose
    public String operatingSystemKernelDebugging;

    /**
     * The Operating System Rev List Info.
     * The Operating System Revision List that was loaded during initial boot on the attested device
     */
    @SerializedName("operatingSystemRevListInfo")
    @Expose
    public String operatingSystemRevListInfo;

    /**
     * The Pcr0.
     * The measurement that is captured in PCR[0]
     */
    @SerializedName("pcr0")
    @Expose
    public String pcr0;

    /**
     * The Pcr Hash Algorithm.
     * Informational attribute that identifies the HASH algorithm that was used by TPM
     */
    @SerializedName("pcrHashAlgorithm")
    @Expose
    public String pcrHashAlgorithm;

    /**
     * The Reset Count.
     * The number of times a PC device has hibernated or resumed
     */
    @SerializedName("resetCount")
    @Expose
    public Long resetCount;

    /**
     * The Restart Count.
     * The number of times a PC device has rebooted
     */
    @SerializedName("restartCount")
    @Expose
    public Long restartCount;

    /**
     * The Safe Mode.
     * Safe mode is a troubleshooting option for Windows that starts your computer in a limited state
     */
    @SerializedName("safeMode")
    @Expose
    public String safeMode;

    /**
     * The Secure Boot.
     * When Secure Boot is enabled, the core components must have the correct cryptographic signatures
     */
    @SerializedName("secureBoot")
    @Expose
    public String secureBoot;

    /**
     * The Secure Boot Configuration Policy Finger Print.
     * Fingerprint of the Custom Secure Boot Configuration Policy
     */
    @SerializedName("secureBootConfigurationPolicyFingerPrint")
    @Expose
    public String secureBootConfigurationPolicyFingerPrint;

    /**
     * The Test Signing.
     * When test signing is allowed, the device does not enforce signature validation during boot
     */
    @SerializedName("testSigning")
    @Expose
    public String testSigning;

    /**
     * The Tpm Version.
     * The security version number of the Boot Application
     */
    @SerializedName("tpmVersion")
    @Expose
    public String tpmVersion;

    /**
     * The Virtual Secure Mode.
     * VSM is a container that protects high value assets from a compromised kernel
     */
    @SerializedName("virtualSecureMode")
    @Expose
    public String virtualSecureMode;

    /**
     * The Windows PE.
     * Operating system running with limited services that is used to prepare a computer for Windows
     */
    @SerializedName("windowsPE")
    @Expose
    public String windowsPE;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}
