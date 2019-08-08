SUMMARY = "PTY interface for Go"
HOMEPAGE = "https://github.com/kr/pty"

SRC_URI = "git://${GO_IMPORT};protocol=https;tag=v${PV}"
GO_IMPORT = "github.com/kr/pty"

LICENSE = "MIT"
LIC_FILES_CHKSUM  = "file://src/${GO_IMPORT}/License;md5=93958070863d769117fa33b129020050"

DEPENDS += "github.com-creack-pty-native"

inherit go
inherit native