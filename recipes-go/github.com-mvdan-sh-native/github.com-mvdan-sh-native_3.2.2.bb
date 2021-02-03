SUMMARY = "A shell parser, formatter, and interpreter (sh/bash/mksh) "
HOMEPAGE = "https://github.com/mvdan/sh"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=5762bc15271b0661f5c9c593cd080548"

DEPENDS += "mvdan.cc-sh-native"

SRC_URI = "git://github.com/mvdan/sh;protocol=https;nobranch=1"
SRCREV = "7427541e5e83b5c71ebc97b4199b25cb0d6015cd"
GO_IMPORT ?= "github.com/mvdan/sh"

inherit go
inherit native
