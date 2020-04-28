SUMMARY = "PTY interface for Go"
HOMEPAGE = "https://github.com/creack/pty"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=93958070863d769117fa33b129020050"

SRC_URI = "git://${GO_IMPORT};protocol=https"
SRCREV = "3a6a957789163cacdfe0e291617a1c8e80612c11"
GO_IMPORT = "github.com/creack/pty"

inherit go
inherit native
