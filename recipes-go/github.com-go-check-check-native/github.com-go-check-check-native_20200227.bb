SUMMARY = "Rich testing for the Go language"
HOMEPAGE = "https://github.com/go-check/check"

SRC_URI = "git://github.com/go-check/check;protocol=https;branch=v1"
SRCREV = "8fa46927fb4f5b54d48bde78c6c08db205b2298c"
UPSTREAM_CHECK_COMMITS = "1"

DEPENDS += "github.com-kr-pretty-native github.com-niemeyer-pretty-native"

GO_IMPORT ?= "github.com/go-check/check"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM  = "file://src/${GO_IMPORT}/LICENSE;md5=598d6673548efc92a7d6dfb739add1ed"

inherit go
inherit native
