import { registerPlugin } from '@capacitor/core';
import type { PluginInfoPlugin } from './definitions';

const PluginInfo = registerPlugin<PluginInfoPlugin>('PluginInfo', {
  web: () => import('./web').then(m => new m.PluginInfoWeb()),
});

export * from './definitions';
export { PluginInfo };
