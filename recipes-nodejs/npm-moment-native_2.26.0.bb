SUMMARY = "NPM: moment"
DESCRIPTION = "Parse, validate, manipulate, and display dates"
HOMEPAGE = "https://momentjs.com"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=397bb5fedab22612d8d69f1458a9321e"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/moment/-/moment-2.26.0.tgz"
SRC_URI[md5sum] = "e4185a782cf0c2fb6a24c5d23bb8169d"
SRC_URI[sha256sum] = "dd9a1bbdbf43c8c8b77aa92e6c30eda1ec7fc7d0fced0ac70968e291cb5ee235"

NPM_PKGNAME = "moment"

inherit npmhelper
inherit native
