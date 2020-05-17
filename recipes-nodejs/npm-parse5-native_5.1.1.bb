SUMMARY = "NPM: parse5"
DESCRIPTION = "HTML parser and serializer."
HOMEPAGE = "https://github.com/inikulin/parse5"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=179850e04995d6fceaf64f2dd2a851b0"

SRC_URI = "https://registry.npmjs.org/parse5/-/parse5-5.1.1.tgz"
SRC_URI[md5sum] = "84d0df961b6b73e7a37ac470494da33a"
SRC_URI[sha256sum] = "92727eff70b78a7ecc5ee9d88a76d13f746f98eea2f81e945e69d8e32d863e75"

NPM_PKGNAME = "parse5"

inherit npmhelper
inherit native
