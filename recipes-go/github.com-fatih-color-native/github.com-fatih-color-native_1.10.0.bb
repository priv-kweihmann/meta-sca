SUMMARY = "Color package for Go (golang)"
HOMEPAGE = "https://github.com/fatih/color"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE.md;md5=316e6d590bdcde7993fb175662c0dd5a"

SRC_URI = "git://${GO_IMPORT};protocol=https"
SRCREV = "bc2269661d49c6c9d0e514eef49710556883f3fa"
GO_IMPORT = "github.com/fatih/color"

export GO111MODULE = "auto"

inherit go
inherit native
