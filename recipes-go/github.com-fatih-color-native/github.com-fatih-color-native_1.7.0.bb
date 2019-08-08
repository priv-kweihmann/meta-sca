SUMMARY = "Color package for Go (golang)"
HOMEPAGE = "https://github.com/fatih/color"

SRC_URI = "git://${GO_IMPORT};protocol=https;tag=v${PV}"
GO_IMPORT = "github.com/fatih/color"

LICENSE = "MIT"
LIC_FILES_CHKSUM  = "file://src/${GO_IMPORT}/LICENSE.md;md5=316e6d590bdcde7993fb175662c0dd5a"

inherit go
inherit native