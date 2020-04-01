SUMMARY = "PTY interface for Go"
HOMEPAGE = "https://github.com/kr/pty"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=ceaf9724dda49c2d493922113d3bd3b8"

DEPENDS += "github.com-creack-pty-native"

SRC_URI = "git://${GO_IMPORT};protocol=https;tag=v${PV}"
GO_IMPORT = "github.com/kr/pty"

inherit go
inherit native
