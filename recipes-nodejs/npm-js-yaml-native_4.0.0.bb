SUMMARY = "NPM: js-yaml"
DESCRIPTION = "YAML 1.2 parser and serializer"
HOMEPAGE = "https://github.com/nodeca/js-yaml#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=effd621a9bf5d72d6a7e6ef819bf3afb"

DEPENDS = "npm-argparse-native"

SRC_URI = "https://registry.npmjs.org/js-yaml/-/js-yaml-4.0.0.tgz"
SRC_URI[md5sum] = "2eb5e4f04a619da68844f706291beeb0"
SRC_URI[sha256sum] = "988fba55ae3bd980d1013d529a1cac9023be633132573581265f649ea632e41b"

NPM_PKGNAME = "js-yaml"

inherit npmhelper
inherit native
