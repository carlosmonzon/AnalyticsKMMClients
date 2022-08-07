//
//  ContentView.swift
//  Shared
//
//  Created by Carlos Monzon on 24/7/2022.
//

import SwiftUI
import SegmentMultiplatform

struct ContentView: View {
    
    @Environment(\.analytics) var analytics
    var body: some View {
        Text("Hello, world!")
            .padding()
            .onTapGesture {
                let event = AddProductEvent(product: ProductProperty(skuId: "id1", price: 10.0))
                analytics.track(event: event)
            }
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
