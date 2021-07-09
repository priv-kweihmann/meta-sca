SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/browserslist/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001243.tgz"
SRC_URI[md5sum] = "d0fb5024d3411b98463c38247cdda0bf"
SRC_URI[sha256sum] = "0a12e005019be79c03a4dfd68cb007873b9adc2e46dd3483a043217c45687c61"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
