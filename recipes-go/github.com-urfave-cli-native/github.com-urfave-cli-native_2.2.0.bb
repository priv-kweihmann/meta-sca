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
SRCREV = "d648edd48d89ef3a841b1ec75c2ebbd4de5f748f"
GO_IMPORT = "github.com/urfave/cli"

inherit gonative
inherit native
