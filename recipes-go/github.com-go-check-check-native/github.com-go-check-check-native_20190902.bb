SUMMARY = "Rich testing for the Go language"
HOMEPAGE = "https://github.com/go-check/check"

SRC_URI = "git://github.com/go-check/check;protocol=https;branch=v1"
SRCREV = "41f04d3bba152ddec2103e299fed053415705330"
UPSTREAM_CHECK_COMMITS = "1"

DEPENDS += "github.com-kr-pretty-native"

GO_IMPORT ?= "github.com/go-check/check"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM  = "file://src/${GO_IMPORT}/LICENSE;md5=598d6673548efc92a7d6dfb739add1ed"

inherit go
inherit native