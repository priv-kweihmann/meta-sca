SUMMARY = "NPM: isarray"
DESCRIPTION = "Array#isArray for older browsers"
HOMEPAGE = "https://github.com/juliangruber/isarray"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.md;beginline=42;md5=0d3b013fed6c1109884819205a9b3104"

SRC_URI = "https://registry.npmjs.org/isarray/-/isarray-1.0.0.tgz"
SRC_URI[md5sum] = "c24471c617803171eed93b3516624c97"
SRC_URI[sha256sum] = "e23c76f14f5222e07e39d89858b61e8e33f96956de9e0df3659cbdf8db950c87"

NPM_PKGNAME = "isarray"

inherit npmhelper
inherit native
