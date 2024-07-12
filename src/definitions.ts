export interface DeviceInfo {
  imei: string;
  phoneNumber: string;
  simSerialNumber: string;
  subscriberId: string;
}

export interface PluginInfoPlugin {
  getDeviceInfo(): Promise<DeviceInfo>;
}
