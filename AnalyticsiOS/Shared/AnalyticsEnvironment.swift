//
//  AnalyticsEnvironment.swift
//  SegmentMultiplatformDemo (iOS)
//
//  Created by Carlos Monzon on 24/7/2022.
//

import SwiftUI
import SegmentMultiplatform

private struct AnalyticsKey: EnvironmentKey {
    static let defaultValue: Analytics = {
        return InvokeKt.Analytics()
    }()
}

extension EnvironmentValues {
    var analytics: Analytics {
        get { self[AnalyticsKey.self] }
        set { self[AnalyticsKey.self] = newValue }
    }
}
