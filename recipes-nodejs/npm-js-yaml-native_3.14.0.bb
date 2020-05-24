SUMMARY = "NPM: js-yaml"
DESCRIPTION = "YAML 1.2 parser and serializer"
HOMEPAGE = "https://github.com/nodeca/js-yaml"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=effd621a9bf5d72d6a7e6ef819bf3afb"

DEPENDS = "npm-argparse-native \
           npm-esprima-native"

SRC_URI = "https://registry.npmjs.org/js-yaml/-/js-yaml-3.14.0.tgz"
SRC_URI[md5sum] = "53b71484b326b5724789cc18cf155c5c"
SRC_URI[sha256sum] = "3c82c5db6d3a31632e442863ebb006640700d773f73ece89b3686ff42b88c8ef"

NPM_PKGNAME = "js-yaml"

inherit npmhelper
inherit native
