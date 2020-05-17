SUMMARY = "NPM: typedarray-to-buffer"
DESCRIPTION = "Convert a typed array to a Buffer without a copy"
HOMEPAGE = "http://feross.org"

DEPENDS = "npm-is-typedarray-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=badd5e91c737e7ffdf10b40c1f907761"

SRC_URI = "https://registry.npmjs.org/typedarray-to-buffer/-/typedarray-to-buffer-3.1.5.tgz"
SRC_URI[md5sum] = "d693220f5eabe1359169bb992abaa064"
SRC_URI[sha256sum] = "2b264d84a680cb57b9ee9e6f0bf8a365c79465408509116a2c52461dcc1ff936"

S = "${WORKDIR}/package"

NPM_PKGNAME = "typedarray-to-buffer"

inherit npmhelper
inherit native
