SUMMARY = "Implements a deep pretty printer for Go data structures to aid in debugging "
HOMEPAGE = "https://github.com/davecgh/go-spew"

SRC_URI = "git://${GO_IMPORT};protocol=https;tag=v${PV}"
GO_IMPORT = "github.com/davecgh/go-spew"

LICENSE = "ISC"
LIC_FILES_CHKSUM  = "file://src/${GO_IMPORT}/LICENSE;md5=c06795ed54b2a35ebeeb543cd3a73e56"

inherit go
inherit native
