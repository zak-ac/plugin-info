export interface PluginInfoPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
