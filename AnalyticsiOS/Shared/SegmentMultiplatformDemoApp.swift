//
//  SegmentMultiplatformDemoApp.swift
//  Shared
//
//  Created by Carlos Monzon on 24/7/2022.
//

import SwiftUI
import SegmentMultiplatform

@main
struct SegmentMultiplatformDemoApp: App {
    @UIApplicationDelegateAdaptor(AppDelegate.self) var appDelegate
    var body: some Scene {
        WindowGroup {
            ContentView()
        }
    }
}


class AppDelegate: NSObject, UIApplicationDelegate {
    func application(_ application: UIApplication, didFinishLaunchingWithOptions launchOptions: [UIApplication.LaunchOptionsKey : Any]? = nil) -> Bool {
        InvokeKt.Analytics(configuration: Configuration(writeKey: "YOUR API KEY"))
        return true
    }
}
