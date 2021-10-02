SUMMARY = "NPM: power-assert-util-string-width"
DESCRIPTION = "calculates width of given string"
HOMEPAGE = "https://github.com/twada/power-assert-runtime"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.md;beginline=39;endline=40;md5=fb09d58b915b126f1c353f70c292ce4e"

DEPENDS = "npm-eastasianwidth-native"

SRC_URI = "https://registry.npmjs.org/power-assert-util-string-width/-/power-assert-util-string-width-1.2.0.tgz"
SRC_URI[md5sum] = "c28af2d1de11711c47c5abe1cf93c4b1"
SRC_URI[sha256sum] = "de6cae3fd7b266494891f1637df9b2652bb0cb881415e205927c68a09610bba0"

NPM_PKGNAME = "power-assert-util-string-width"

inherit npmhelper
inherit native
