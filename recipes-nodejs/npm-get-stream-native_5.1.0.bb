SUMMARY = "NPM: get-stream"
DESCRIPTION = "Get a stream as a string, buffer, or array"
HOMEPAGE = "https://github.com/sindresorhus/get-stream#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = "npm-pump-native"

SRC_URI = "https://registry.npmjs.org/get-stream/-/get-stream-5.1.0.tgz"
SRC_URI[md5sum] = "daf96f4a75dbd40c4782fc6454633372"
SRC_URI[sha256sum] = "b821874eed90a44198924f42719c4806c7e800acc9c931407126b8180a3d9baf"

NPM_PKGNAME = "get-stream"

inherit npmhelper
inherit native
