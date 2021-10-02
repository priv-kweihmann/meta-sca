SUMMARY = "NPM: xtend"
DESCRIPTION = "extend like a boss"
HOMEPAGE = "https://github.com/Raynos/xtend"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=66787c5cd698a0b30b358c7e30f500ca"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/xtend/-/xtend-4.0.2.tgz"
SRC_URI[md5sum] = "183e6eef1df0529fd39bd932447ba547"
SRC_URI[sha256sum] = "bd22a01d43c799be7bb53dfa9e775b132045e39525e51efb977528a00041ba48"

NPM_PKGNAME = "xtend"

inherit npmhelper
inherit native
