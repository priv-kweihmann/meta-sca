SUMMARY = "Color package for Go (golang)"
HOMEPAGE = "https://github.com/fatih/color"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE.md;md5=316e6d590bdcde7993fb175662c0dd5a"

SRC_URI = "git://${GO_IMPORT};protocol=https"
SRCREV = "daf2830f2741ebb735b21709a520c5f37d642d85"
GO_IMPORT = "github.com/fatih/color"

inherit gonative
inherit native
