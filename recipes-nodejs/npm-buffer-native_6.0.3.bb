SUMMARY = "NPM: buffer"
DESCRIPTION = "Node.js Buffer API, for the browser"
HOMEPAGE = "https://github.com/feross/buffer"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e49e579dbcc02cf1f699deec85fd96f0"

DEPENDS = "npm-base64-js-native \
           npm-ieee754-native"

SRC_URI = "https://registry.npmjs.org/buffer/-/buffer-6.0.3.tgz"
SRC_URI[md5sum] = "62b43fa264d96f92199861e649ae5190"
SRC_URI[sha256sum] = "555b6f49224afcf6b2c5a9aea7cd34a7f443f395b10532bc5580022d57aa51f5"

NPM_PKGNAME = "buffer"

inherit npmhelper
inherit native
