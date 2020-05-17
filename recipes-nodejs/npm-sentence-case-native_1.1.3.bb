SUMMARY = "NPM: sentence-case"
DESCRIPTION = "Sentence case a string"
HOMEPAGE = "https://github.com/blakeembrey/sentence-case"

DEPENDS = "npm-lower-case-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=44088ba57cb871a58add36ce51b8de08"

SRC_URI = "https://registry.npmjs.org/sentence-case/-/sentence-case-1.1.3.tgz"
SRC_URI[md5sum] = "51f6733d9556402b7b8bebadc2797200"
SRC_URI[sha256sum] = "b2746210a7aff42450cd92967235921dbfa35b531eac65b7e317ecc0479ade19"

NPM_PKGNAME = "sentence-case"

inherit npmhelper
inherit native
