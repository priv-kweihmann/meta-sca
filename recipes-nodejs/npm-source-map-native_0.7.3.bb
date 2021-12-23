SUMMARY = "NPM: source-map"
DESCRIPTION = "Generates and consumes source maps"
HOMEPAGE = "https://github.com/mozilla/source-map"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1ca6dbc0075d56cbd9931a75566cd44"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/source-map/-/source-map-0.7.3.tgz"
SRC_URI[md5sum] = "ff3fc23c366a902d7c9876b0d6ddb1ad"
SRC_URI[sha256sum] = "ad69b787ba774733c3e4f0eb20403df7b1fa466252d453533dbcc6a5ad15833e"

NPM_PKGNAME = "source-map"

inherit npmhelper
inherit native
