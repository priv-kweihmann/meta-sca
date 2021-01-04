SUMMARY = "Converts markdown into roff (man pages)"
HOMEPAGE = "https://github.com/cpuguy83/go-md2man"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE.md;md5=80794f9009df723bbc6fe19234c9f517"

DEPENDS += "\
            github.com-russross-blackfriday-native \
           "

SRC_URI = "git://${GO_IMPORT};protocol=https"
SRCREV = "f79a8a8ca69da163eee19ab442bedad7a35bba5a"
GO_IMPORT = "github.com/cpuguy83/go-md2man"

inherit go
inherit native
