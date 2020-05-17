SUMMARY = "NPM: ansi-escapes"
DESCRIPTION = "ANSI escape codes for manipulating the terminal"
HOMEPAGE = "https://github.com/sindresorhus/ansi-escapes#readme"

DEPENDS = "npm-type-fest-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

SRC_URI = "https://registry.npmjs.org/ansi-escapes/-/ansi-escapes-4.3.1.tgz"
SRC_URI[md5sum] = "a1679ce5c91251987f2005daf7c5406d"
SRC_URI[sha256sum] = "b0b89969a0840eb86230346e55e63ac1096b75b3e13e8eb24c7d8492ca1e492b"

NPM_PKGNAME = "ansi-escapes"

inherit npmhelper
inherit native
