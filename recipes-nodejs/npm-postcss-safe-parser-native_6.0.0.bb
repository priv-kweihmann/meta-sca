SUMMARY = "NPM: postcss-safe-parser"
DESCRIPTION = "Fault-tolerant CSS parser for PostCSS"
HOMEPAGE = "https://github.com/postcss/postcss-safe-parser#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e0ef868fdaaba6859dcbab082c20439b"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/postcss-safe-parser/-/postcss-safe-parser-6.0.0.tgz"
SRC_URI[md5sum] = "d3c1c98896ebe1c62a72ac239c516f99"
SRC_URI[sha256sum] = "801052c06d5bddefb3b9af6d111278444513a1eca9a8113242e65ba5facad741"

NPM_PKGNAME = "postcss-safe-parser"

inherit npmhelper
inherit native
