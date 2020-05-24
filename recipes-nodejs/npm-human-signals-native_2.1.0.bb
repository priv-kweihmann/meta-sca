SUMMARY = "NPM: human-signals"
DESCRIPTION = "Human-friendly process signals"
HOMEPAGE = "https://git.io/JeluP"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=516e9dc27e78d3e350ca7869c976b0cd"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/human-signals/-/human-signals-2.1.0.tgz"
SRC_URI[md5sum] = "04294cb833bb9fe1c1fd1123294826b9"
SRC_URI[sha256sum] = "bef9e69fde224e067907418f9e01218fda00bdea4101c33b05b56046f42936b8"

NPM_PKGNAME = "human-signals"

inherit npmhelper
inherit native
