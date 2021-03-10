SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/ben-eb/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001198.tgz"
SRC_URI[md5sum] = "f3a3156ed8d751e8db1d09144adc6eb5"
SRC_URI[sha256sum] = "98a1b44a3cb4ff0890bc2264ea65b494bbf32d120fded0296d3dc8964a5e9750"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
