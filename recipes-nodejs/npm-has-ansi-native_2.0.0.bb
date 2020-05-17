SUMMARY = "NPM: has-ansi"
DESCRIPTION = "Check if a string has ANSI escape codes"
HOMEPAGE = "https://github.com/sindresorhus/has-ansi"

DEPENDS = "npm-ansi-regex-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=a12ebca0510a773644101a99a867d210"

SRC_URI = "https://registry.npmjs.org/has-ansi/-/has-ansi-2.0.0.tgz"
SRC_URI[md5sum] = "6c5e87ad63e866b41fc47eaddd3174b0"
SRC_URI[sha256sum] = "e30265eb491e78d3586ea64dea6b61f3d45a28a28d908caf73f04531764344ed"

NPM_PKGNAME = "has-ansi"

inherit npmhelper
inherit native
