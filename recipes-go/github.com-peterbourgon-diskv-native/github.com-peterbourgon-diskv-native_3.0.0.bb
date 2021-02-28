SUMMARY = "A disk-backed key-value store"
HOMEPAGE = "https://github.com/peterbourgon/diskv"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=f9f3e815fc84aa04c4f4db33c553eef9"

DEPENDS += "\
            github.com-google-btree-native \
           "

SRC_URI = "git://${GO_IMPORT};protocol=https"
SRCREV = "0be1b92a6df0e4f5cb0a5d15fb7f643d0ad93ce6"
GO_IMPORT = "github.com/peterbourgon/diskv"

export GO111MODULE = "auto"

inherit go
inherit native
