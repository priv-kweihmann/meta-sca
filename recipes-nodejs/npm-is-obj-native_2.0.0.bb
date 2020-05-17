SUMMARY = "NPM: is-obj"
DESCRIPTION = "Check if a value is an object"
HOMEPAGE = "https://github.com/sindresorhus/is-obj#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

SRC_URI = "https://registry.npmjs.org/is-obj/-/is-obj-2.0.0.tgz"
SRC_URI[md5sum] = "048a47855d52b6a82939e9661227960e"
SRC_URI[sha256sum] = "b0a75a7645339086c32f761cbfa2f8580606394093d94465371ee97a92e5761b"

S = "${WORKDIR}/package"

NPM_PKGNAME = "is-obj"

inherit npmhelper
inherit native
