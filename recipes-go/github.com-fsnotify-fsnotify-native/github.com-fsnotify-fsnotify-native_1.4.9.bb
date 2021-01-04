SUMMARY = "Cross-platform file system notifications for Go"
HOMEPAGE = "https://github.com/fsnotify/fsnotify"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=68f2948d3c4943313d07e084a362486c"

DEPENDS += "golang.org-x-sys-native"

SRC_URI = "git://${GO_IMPORT};protocol=https"
SRCREV = "45d7d09e39ef4ac08d493309fa031790c15bfe8a"
GO_IMPORT = "github.com/fsnotify/fsnotify"

inherit go
inherit native
