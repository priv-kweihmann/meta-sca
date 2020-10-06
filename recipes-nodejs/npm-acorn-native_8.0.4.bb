SUMMARY = "NPM: acorn"
DESCRIPTION = "ECMAScript parser"
HOMEPAGE = "https://github.com/acornjs/acorn"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f6e380cb54b7b0b1b2f8428b190f4f73"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/acorn/-/acorn-8.0.4.tgz"
SRC_URI[md5sum] = "b237b58d5f1a8da3a5dc23754e9ce98d"
SRC_URI[sha256sum] = "5f398477e9b6c3a27cc898f39c290c50d3e5901f1ecd2e8c9f88f2101a80d9e3"

NPM_PKGNAME = "acorn"

inherit npmhelper
inherit native
