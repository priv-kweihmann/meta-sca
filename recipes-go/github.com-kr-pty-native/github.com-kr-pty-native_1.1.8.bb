SUMMARY = "PTY interface for Go"
HOMEPAGE = "https://github.com/kr/pty"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=ceaf9724dda49c2d493922113d3bd3b8"

DEPENDS += "github.com-creack-pty-native"

SRC_URI = "git://${GO_IMPORT};protocol=https"
SRCREV = "24b51915630e1d9d3c6adf15a3a96796bbc3cd43"
GO_IMPORT = "github.com/kr/pty"

export GO111MODULE = "auto"

inherit go
inherit native
