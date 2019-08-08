SUMMARY = "Cross-platform file system notifications for Go"
HOMEPAGE = "https://github.com/fsnotify/fsnotify"

SRC_URI = "git://${GO_IMPORT};protocol=https;tag=v${PV}"
GO_IMPORT = "github.com/fsnotify/fsnotify"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM  = "file://src/${GO_IMPORT}/LICENSE;md5=c38914c9a7ab03bb2b96d4baaee10769"

DEPENDS += "golang.org-x-sys-native"

inherit go
inherit native