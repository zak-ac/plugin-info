import { WebPlugin } from '@capacitor/core';

import type { PluginInfoPlugin } from './definitions';

export class PluginInfoWeb extends WebPlugin implements PluginInfoPlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
