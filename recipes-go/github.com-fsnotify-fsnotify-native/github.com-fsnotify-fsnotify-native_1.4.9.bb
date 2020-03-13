SUMMARY = "Cross-platform file system notifications for Go"
HOMEPAGE = "https://github.com/fsnotify/fsnotify"

SRC_URI = "git://${GO_IMPORT};protocol=https;tag=v${PV}"
GO_IMPORT = "github.com/fsnotify/fsnotify"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM  = "file://src/${GO_IMPORT}/LICENSE;md5=68f2948d3c4943313d07e084a362486c"

DEPENDS += "golang.org-x-sys-native"

inherit go
inherit native