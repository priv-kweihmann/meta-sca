SUMMARY = "NPM: strip-eof"
DESCRIPTION = "Strip the End-Of-File (EOF) character from a string/buffer"
HOMEPAGE = "https://github.com/sindresorhus/strip-eof"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=a12ebca0510a773644101a99a867d210"

SRC_URI = "https://registry.npmjs.org/strip-eof/-/strip-eof-1.0.0.tgz"
SRC_URI[md5sum] = "77c002e15f00f28039872c4a7bb1169b"
SRC_URI[sha256sum] = "f2bead0b21242d44edb6d3d1852fc456fc56ea9489cd8b9a85a458055b219c5d"

NPM_PKGNAME = "strip-eof"

inherit npmhelper
inherit native
