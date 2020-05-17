SUMMARY = "NPM: slash"
DESCRIPTION = "Convert Windows backslash paths to slash paths"
HOMEPAGE = "https://github.com/sindresorhus/slash#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

SRC_URI = "https://registry.npmjs.org/slash/-/slash-3.0.0.tgz"
SRC_URI[md5sum] = "fb2d8f06a6cab32103f4ee61ebe072b1"
SRC_URI[sha256sum] = "f29a17d14b334511cf6f862bfe8a56b690a1d0291c2d264a25ca6f06b4a85d07"

NPM_PKGNAME = "slash"

inherit npmhelper
inherit native
