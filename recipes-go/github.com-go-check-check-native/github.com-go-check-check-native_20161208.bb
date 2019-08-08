SUMMARY = "Rich testing for the Go language"
HOMEPAGE = "https://github.com/go-check/check"

SRC_URI = "git://github.com/go-check/check;protocol=https;branch=v1"
SRCREV = "20d25e2804050c1cd24a7eea1e7a6447dd0e74ec"

GO_IMPORT ?= "github.com/go-check/check"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM  = "file://src/${GO_IMPORT}/LICENSE;md5=598d6673548efc92a7d6dfb739add1ed"

inherit go
inherit native