# plugin-info

Plugin to get device IMEI and SIM information

## Install

```bash
npm install plugin-info
npx cap sync
```

## API

<docgen-index>

* [`getDeviceInfo()`](#getdeviceinfo)
* [Interfaces](#interfaces)

</docgen-index>

<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->

### getDeviceInfo()

```typescript
getDeviceInfo() => Promise<DeviceInfo>
```

**Returns:** <code>Promise&lt;<a href="#deviceinfo">DeviceInfo</a>&gt;</code>

--------------------


### Interfaces


#### DeviceInfo

| Prop                  | Type                |
| --------------------- | ------------------- |
| **`imei`**            | <code>string</code> |
| **`phoneNumber`**     | <code>string</code> |
| **`simSerialNumber`** | <code>string</code> |
| **`subscriberId`**    | <code>string</code> |

</docgen-api>
