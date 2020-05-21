SUMMARY = "NPM: @types/keyv"
DESCRIPTION = "TypeScript definitions for keyv"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=27e94c0280987ab296b0b8dd02ab9fe5"

DEPENDS = "npm-types-node-native"

SRC_URI = "https://registry.npmjs.org/@types/keyv/-/keyv-3.1.1.tgz"
SRC_URI[md5sum] = "d40f8fb598436db12b0cc333043e16c0"
SRC_URI[sha256sum] = "498b509fca626878afc6d60c81e1578537f032ddca31ccf4a5573810a27c1931"

NPM_PKGNAME = "@types/keyv"

inherit npmhelper
inherit native

S = "${WORKDIR}/keyv"
