SUMMARY = "The tomb package helps with clean goroutine termination in the Go language"
HOMEPAGE = "https://github.com/go-tomb/tomb"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=95d4102f39f26da9b66fee5d05ac597b"

SRC_URI = "git://${GO_IMPORT};protocol=https;branch=v1"
SRCREV = "dd632973f1e7218eb1089048e0798ec9ae7dceb8"
UPSTREAM_CHECK_COMMITS = "1"

GO_IMPORT = "github.com/go-tomb/tomb"

inherit go
inherit native
