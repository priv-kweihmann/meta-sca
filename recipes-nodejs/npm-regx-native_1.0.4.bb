SUMMARY = "NPM: regx"
DESCRIPTION = "Tagged template string regular expression compiler."
HOMEPAGE = "https://github.com/shannonmoeller/regx"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.md;beginline=98;endline=100;md5=1e5fb5243ed1126f85c37c6992f50557"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/regx/-/regx-1.0.4.tgz"
SRC_URI[md5sum] = "9a5e892d77f2600298a2c1bf1d8699dd"
SRC_URI[sha256sum] = "1bf609aae00c3caae503f0ea9224adbf6973208613710ce01d378d9e8ee69828"

NPM_PKGNAME = "regx"

inherit npmhelper
inherit native
