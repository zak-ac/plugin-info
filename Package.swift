// swift-tools-version: 5.9
import PackageDescription

let package = Package(
    name: "PluginInfo",
    platforms: [.iOS(.v13)],
    products: [
        .library(
            name: "PluginInfo",
            targets: ["PluginInfoPlugin"])
    ],
    dependencies: [
        .package(url: "https://github.com/ionic-team/capacitor-swift-pm.git", branch: "main")
    ],
    targets: [
        .target(
            name: "PluginInfoPlugin",
            dependencies: [
                .product(name: "Capacitor", package: "capacitor-swift-pm"),
                .product(name: "Cordova", package: "capacitor-swift-pm")
            ],
            path: "ios/Sources/PluginInfoPlugin"),
        .testTarget(
            name: "PluginInfoPluginTests",
            dependencies: ["PluginInfoPlugin"],
            path: "ios/Tests/PluginInfoPluginTests")
    ]
)