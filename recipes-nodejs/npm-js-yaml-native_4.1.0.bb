SUMMARY = "NPM: js-yaml"
DESCRIPTION = "YAML 1.2 parser and serializer"
HOMEPAGE = "https://github.com/nodeca/js-yaml#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=effd621a9bf5d72d6a7e6ef819bf3afb"

DEPENDS = "npm-argparse-native"

SRC_URI = "https://registry.npmjs.org/js-yaml/-/js-yaml-4.1.0.tgz"
SRC_URI[md5sum] = "fba4491839b7fa47c38f639ac243b22d"
SRC_URI[sha256sum] = "0dae332559cf22b21c26ea70e732afd8303ff99412f9c3d9d209faa8882cf2ca"

NPM_PKGNAME = "js-yaml"

inherit npmhelper
inherit native
