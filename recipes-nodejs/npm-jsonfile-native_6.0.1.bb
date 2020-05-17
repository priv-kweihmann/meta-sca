SUMMARY = "NPM: jsonfile"
DESCRIPTION = "Easily read/write JSON files."
HOMEPAGE = "https://github.com/jprichardson/node-jsonfile#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=423f377ade95936f6fe009b1c137bfdb"

DEPENDS = "npm-graceful-fs-native \
           npm-universalify-native"

SRC_URI = "https://registry.npmjs.org/jsonfile/-/jsonfile-6.0.1.tgz"
SRC_URI[md5sum] = "4591499456aad6813f9ef672dbcb48d3"
SRC_URI[sha256sum] = "c04d98338f4acd435fdf19865693faabfb2867998a93b445a88436e9be518a31"

NPM_PKGNAME = "jsonfile"

inherit npmhelper
inherit native
