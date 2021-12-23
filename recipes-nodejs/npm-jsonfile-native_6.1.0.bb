SUMMARY = "NPM: jsonfile"
DESCRIPTION = "Easily read/write JSON files."
HOMEPAGE = "https://github.com/jprichardson/node-jsonfile#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=423f377ade95936f6fe009b1c137bfdb"

DEPENDS = "npm-graceful-fs-native \
           npm-universalify-native"

SRC_URI = "https://registry.npmjs.org/jsonfile/-/jsonfile-6.1.0.tgz"
SRC_URI[md5sum] = "bfc1ad2448232a7384d047c522ef868f"
SRC_URI[sha256sum] = "0bd8eed33a92113fd8176b1393a5a918f725bb34fd76f9b1501b32e29bf859b3"

NPM_PKGNAME = "jsonfile"

inherit npmhelper
inherit native
