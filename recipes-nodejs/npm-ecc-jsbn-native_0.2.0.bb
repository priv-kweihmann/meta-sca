SUMMARY = "NPM: ecc-jsbn"
DESCRIPTION = "ECC JS code based on JSBN"
HOMEPAGE = "https://github.com/quartzjer/ecc-jsbn"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0d289b6d63cbcc18e4b2af9a5bd28b54"

DEPENDS = "npm-jsbn-native"

SRC_URI = "https://registry.npmjs.org/ecc-jsbn/-/ecc-jsbn-0.2.0.tgz"
SRC_URI[md5sum] = "9ebc332cdaf8339cc4c25dd8d9767c1c"
SRC_URI[sha256sum] = "1179c9968d012d6898607c98b6705f71ee6bbe633675aa782de4cbce87b6415e"

NPM_PKGNAME = "ecc-jsbn"

inherit npmhelper
inherit native
