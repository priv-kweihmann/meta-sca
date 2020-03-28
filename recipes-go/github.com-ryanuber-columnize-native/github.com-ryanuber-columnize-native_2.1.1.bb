SUMMARY = "Easy column formatted output for golang"
HOMEPAGE = "https://github.com/ryanuber/columnize"

SRC_URI = "git://${GO_IMPORT};protocol=https;tag=v${PV}"
GO_IMPORT = "github.com/ryanuber/columnize"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=2dcf22ecbbb7a43c2280f859bdb4bc76"

inherit go
inherit native
