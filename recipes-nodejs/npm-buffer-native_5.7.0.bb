SUMMARY = "NPM: buffer"
DESCRIPTION = "Node.js Buffer API, for the browser"
HOMEPAGE = "https://github.com/feross/buffer"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e49e579dbcc02cf1f699deec85fd96f0"

DEPENDS = "npm-base64-js-native \
           npm-ieee754-native"

SRC_URI = "https://registry.npmjs.org/buffer/-/buffer-5.7.0.tgz"
SRC_URI[md5sum] = "5706570015bf78b63348e42b263bd453"
SRC_URI[sha256sum] = "dc93cbd6a046e2a7d25f904c4840cdb1ce5c90b9661bfc55fe421d9d55af36be"

NPM_PKGNAME = "buffer"

inherit npmhelper
inherit native
