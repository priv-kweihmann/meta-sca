SUMMARY = "PTY interface for Go"
HOMEPAGE = "https://github.com/creack/pty"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=93958070863d769117fa33b129020050"

SRC_URI = "git://${GO_IMPORT};protocol=https"
SRCREV = "2a38352e8b4d7ab6c336eef107e42a55e72e7fbc"
GO_IMPORT = "github.com/creack/pty"

export GO111MODULE = "auto"

inherit go
inherit native
