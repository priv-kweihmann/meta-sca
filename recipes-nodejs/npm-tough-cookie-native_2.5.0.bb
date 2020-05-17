SUMMARY = "NPM: tough-cookie"
DESCRIPTION = "RFC6265 Cookies and Cookie Jar for node.js"
HOMEPAGE = "https://github.com/salesforce/tough-cookie"

DEPENDS = "npm-psl-native npm-punycode-native"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7189377a5215f1211b70cf2b9754841e"

SRC_URI = "https://registry.npmjs.org/tough-cookie/-/tough-cookie-2.5.0.tgz"
SRC_URI[md5sum] = "846095a90d54d0a53cd981e803b3d1a8"
SRC_URI[sha256sum] = "f0ab8738d11c6189efba829ee4b8a1aaf99c45fe5241746046c8d6424d6dda4e"

NPM_PKGNAME = "tough-cookie"

inherit npmhelper
inherit native
