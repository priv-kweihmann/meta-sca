SUMMARY = "NPM: xml"
DESCRIPTION = "Fast and simple xml generator. Supports attributes, CDATA, etc. Includes tests and examples."
HOMEPAGE = "http://github.com/dylang/node-xml"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=48f688d5f151a089b8175bbf2919474c"

SRC_URI = "https://registry.npmjs.org/xml/-/xml-1.0.1.tgz"
SRC_URI[md5sum] = "cd0657e89d77ec585fe29c9b568d16c9"
SRC_URI[sha256sum] = "38032bd701fa20427b2ee31ed55e6761ce1a881a6eabcd90005ebe74ab04a623"

S = "${WORKDIR}/package"

NPM_PKGNAME = "xml"

inherit npmhelper
inherit native
