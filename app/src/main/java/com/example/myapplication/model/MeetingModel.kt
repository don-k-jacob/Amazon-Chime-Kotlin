/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * SPDX-License-Identifier: Apache-2.0
 */

package com.example.myapplication.R

import androidx.lifecycle.ViewModel
import com.amazonaws.services.chime.sdk.meetings.device.MediaDevice


// This will be used for keeping state after rotation
class MeetingModel : ViewModel() {
    val currentMetrics = mutableMapOf<String, MetricData>()
    val currentRoster = mutableMapOf<String, RosterAttendee>()
    val currentVideoTiles = mutableMapOf<Int, VideoCollectionTile>()
    val currentScreenTiles = mutableMapOf<Int, VideoCollectionTile>()
    val nextVideoTiles = LinkedHashMap<Int, VideoCollectionTile>()
    var currentMediaDevices = listOf<MediaDevice>()
    var currentMessages = mutableListOf<Message>()

    var isMuted = false
    var isCameraOn = false
    var isDeviceListDialogOn = false
    var lastReceivedMessageTimestamp = 0L
    var tabIndex = 0
}
