SUMMARY = "A simple, fast, and fun package for building command line apps in Go"
HOMEPAGE = "https://github.com/urfave/cli"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=c542707ca9fc0b7802407ba62310bd8f"

DEPENDS += "\
            github.com-burntsushi-toml-native \
            github.com-cpuguy83-go-md2man-native \
            gopkg.in-yaml.v2-native \
           "

SRC_URI = "git://${GO_IMPORT};protocol=https"
SRCREV = "09ac54c2f97f4249282baf266c54a09fab1bef58"
GO_IMPORT = "github.com/urfave/cli"

export GO111MODULE = "auto"

inherit go
inherit native
