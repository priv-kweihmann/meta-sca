SUMMARY = "NPM: slice-ansi"
DESCRIPTION = "Slice a string with ANSI escape codes"
HOMEPAGE = "https://github.com/chalk/slice-ansi#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=c6bf89c1f07fabb257790ed06f37af92"

DEPENDS = "npm-ansi-styles-native \
           npm-astral-regex-native \
           npm-is-fullwidth-code-point-native"

SRC_URI = "https://registry.npmjs.org/slice-ansi/-/slice-ansi-4.0.0.tgz"
SRC_URI[md5sum] = "4294d49390179c04aebd664e99814b2d"
SRC_URI[sha256sum] = "348316572da167e4ad69da480f801116515f9a7cdc8c9ca79a164ff6e6b4f184"

NPM_PKGNAME = "slice-ansi"

inherit npmhelper
inherit native
