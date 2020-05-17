SUMMARY = "NPM: jsonfile"
DESCRIPTION = "Easily read/write JSON files."
HOMEPAGE = "https://github.com/jprichardson/node-jsonfile#readme"

DEPENDS = "npm-graceful-fs-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=423f377ade95936f6fe009b1c137bfdb"

SRC_URI = "https://registry.npmjs.org/jsonfile/-/jsonfile-4.0.0.tgz"
SRC_URI[md5sum] = "73dff28a2f7b59aafdbba8a2e1882c2e"
SRC_URI[sha256sum] = "5fb99597f70008b05f401d4d0d522a9c18e019be5e780fa17f7bd13a3c0be0e8"

S = "${WORKDIR}/package"

NPM_PKGNAME = "jsonfile"

inherit npmhelper
inherit native
