SUMMARY = "NPM: js-tokens"
DESCRIPTION = "Tiny JavaScript tokenizer."
HOMEPAGE = "https://github.com/lydell/js-tokens#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ab455c623065d572cb2a9039482eb9e8"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/js-tokens/-/js-tokens-6.0.0.tgz"
SRC_URI[md5sum] = "e565aa443b25976567f2bd1d78278448"
SRC_URI[sha256sum] = "987a404f60443b04cad94848a06a83834b131ba09d3aadc8bfe753c87d7dc97d"

NPM_PKGNAME = "js-tokens"

inherit npmhelper
inherit native
