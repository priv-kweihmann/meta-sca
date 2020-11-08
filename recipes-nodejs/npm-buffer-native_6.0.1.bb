SUMMARY = "NPM: buffer"
DESCRIPTION = "Node.js Buffer API, for the browser"
HOMEPAGE = "https://github.com/feross/buffer"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e49e579dbcc02cf1f699deec85fd96f0"

DEPENDS = "npm-base64-js-native \
           npm-ieee754-native"

SRC_URI = "https://registry.npmjs.org/buffer/-/buffer-6.0.1.tgz"
SRC_URI[md5sum] = "9d116738d452e40ce38df0c528e9bf9a"
SRC_URI[sha256sum] = "fa4c26c323c9cec3c8bfb6e9caa557655e77153e9236578271be6c79bfcfea12"

NPM_PKGNAME = "buffer"

inherit npmhelper
inherit native
