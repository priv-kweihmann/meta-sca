SUMMARY = "NPM: deep-is"
DESCRIPTION = "node's assert.deepEqual algorithm except for NaN being equal to NaN"
HOMEPAGE = "https://github.com/thlorenz/deep-is#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fb19b42ee6322a4b61b6277fb9e13d89"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/deep-is/-/deep-is-0.1.4.tgz"
SRC_URI[md5sum] = "5ae2691701dad1aec2e6bc66a610fbbe"
SRC_URI[sha256sum] = "0c03aa83c6bf68e7c2cc2c5b5a2d732c1879e7711b08011b0bc48df10d10bf3c"

NPM_PKGNAME = "deep-is"

inherit npmhelper
inherit native
