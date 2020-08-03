SUMMARY = "NPM: acorn"
DESCRIPTION = "ECMAScript parser"
HOMEPAGE = "https://github.com/acornjs/acorn"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f6e380cb54b7b0b1b2f8428b190f4f73"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/acorn/-/acorn-7.4.0.tgz"
SRC_URI[md5sum] = "f94e18b73da9cf083f83e6500976bc45"
SRC_URI[sha256sum] = "d0213df4ca06c0f481512942d55fab742c2f76ef05ce80db1911d0ba616a2b28"

NPM_PKGNAME = "acorn"

inherit npmhelper
inherit native
