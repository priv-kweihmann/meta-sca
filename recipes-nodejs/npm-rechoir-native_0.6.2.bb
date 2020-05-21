SUMMARY = "NPM: rechoir"
DESCRIPTION = "Require any supported file as a node module."
HOMEPAGE = "https://github.com/tkellen/node-rechoir"

LICENSE = "Unlicense"
LIC_FILES_CHKSUM = "file://LICENSE;md5=40a27083d1803ac85e6203f364a63088"

DEPENDS = "npm-resolve-native"

SRC_URI = "https://registry.npmjs.org/rechoir/-/rechoir-0.6.2.tgz"
SRC_URI[md5sum] = "9a0aa4db2a887a452ef08921160c7eb4"
SRC_URI[sha256sum] = "141faa56cef4953ffbe236336a09af64097560338de5abbce57f990fb62ac635"

NPM_PKGNAME = "rechoir"

inherit npmhelper
inherit native
