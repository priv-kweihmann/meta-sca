SUMMARY = "NPM: is-ci"
DESCRIPTION = "Detect if the current environment is a CI server"
HOMEPAGE = "https://github.com/watson/is-ci"

DEPENDS = "npm-ci-info-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0c6fa9c682ce05a9a4da4f4a96cf42ec"

SRC_URI = "https://registry.npmjs.org/is-ci/-/is-ci-1.2.1.tgz"
SRC_URI[md5sum] = "1fa9ffcb8d102eedaa839401ac74d9d8"
SRC_URI[sha256sum] = "bb41d3c77e05d4cf39f63e4e915d65a986b513bfffc04db5195bf319926589b3"

NPM_PKGNAME = "is-ci"

inherit npmhelper
inherit native
