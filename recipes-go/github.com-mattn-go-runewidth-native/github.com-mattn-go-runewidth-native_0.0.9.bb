SUMMARY = "wcwidth for golang"
HOMEPAGE = "https://github.com/mattn/go-runewidth"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=24ce168f90aec2456a73de1839037245"

SRC_URI = "git://${GO_IMPORT};protocol=https"
SRCREV = "14e809f6d78fcf9f48ff9b70981472b64c05f754"
GO_IMPORT = "github.com/mattn/go-runewidth"

inherit go
inherit native
