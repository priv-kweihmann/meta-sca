SUMMARY = "NPM: pify"
DESCRIPTION = "Promisify a callback-style function"
HOMEPAGE = "https://github.com/sindresorhus/pify#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

SRC_URI = "https://registry.npmjs.org/pify/-/pify-3.0.0.tgz"
SRC_URI[md5sum] = "34a98f7078e3d6481358eaf97c7b9867"
SRC_URI[sha256sum] = "591cd1f9937cb8e65dba3c319acafd6892e38d4acdfe4ab896f74f040199043c"

S = "${WORKDIR}/package"

NPM_PKGNAME = "pify"

inherit npmhelper
inherit native
