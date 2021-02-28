SUMMARY = "Implements a deep pretty printer for Go data structures to aid in debugging "
HOMEPAGE = "https://github.com/davecgh/go-spew"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=c06795ed54b2a35ebeeb543cd3a73e56"

SRC_URI = "git://${GO_IMPORT};protocol=https"
SRCREV = "8991bc29aa16c548c550c7ff78260e27b9ab7c73"
GO_IMPORT = "github.com/davecgh/go-spew"

export GO111MODULE = "auto"

inherit go
inherit native
