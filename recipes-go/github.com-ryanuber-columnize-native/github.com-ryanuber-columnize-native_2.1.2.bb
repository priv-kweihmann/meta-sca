SUMMARY = "Easy column formatted output for golang"
HOMEPAGE = "https://github.com/ryanuber/columnize"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=2dcf22ecbbb7a43c2280f859bdb4bc76"

SRC_URI = "git://${GO_IMPORT};protocol=https"
SRCREV = "d363dedc9af5c63c6809f74e28650cbd635640e0"
GO_IMPORT = "github.com/ryanuber/columnize"

inherit go
inherit native
