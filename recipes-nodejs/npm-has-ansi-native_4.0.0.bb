SUMMARY = "NPM: has-ansi"
DESCRIPTION = "Check if a string has ANSI escape codes"
HOMEPAGE = "https://github.com/chalk/has-ansi#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = "npm-ansi-regex-native"

SRC_URI = "https://registry.npmjs.org/has-ansi/-/has-ansi-4.0.0.tgz"
SRC_URI[md5sum] = "9b0c5bdd88fb1bd72422521dc10175b6"
SRC_URI[sha256sum] = "a971cc31feaed49507624eb0bab42c68ff6f1d47f1e7007b322b6168f9f20b30"

NPM_PKGNAME = "has-ansi"

inherit npmhelper
inherit native
