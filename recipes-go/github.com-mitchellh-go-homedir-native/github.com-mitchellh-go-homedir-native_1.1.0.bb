SUMMARY = "Go library for detecting and expanding the user's home directory without cgo"
HOMEPAGE = "https://github.com/mitchellh/go-homedir"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=3f7765c3d4f58e1f84c4313cecf0f5bd"

SRC_URI = "git://${GO_IMPORT};protocol=https;tag=v${PV}"

GO_IMPORT = "github.com/mitchellh/go-homedir"

inherit go
inherit native
