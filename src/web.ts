import { WebPlugin } from '@capacitor/core';
import type { PluginInfoPlugin, DeviceInfo } from './definitions';

export class PluginInfoWeb extends WebPlugin implements PluginInfoPlugin {
  async getDeviceInfo(): Promise<DeviceInfo> {
    throw this.unimplemented('Not implemented on web.');
  }
}
