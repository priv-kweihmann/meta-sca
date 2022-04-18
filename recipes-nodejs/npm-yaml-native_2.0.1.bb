SUMMARY = "NPM: yaml"
DESCRIPTION = "JavaScript parser and stringifier for YAML"
HOMEPAGE = "https://eemeli.org/yaml/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=128142eeb7d706269284a8f0e5aa587c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/yaml/-/yaml-2.0.1.tgz"
SRC_URI[md5sum] = "f244e6630531c220a4d65aeb8c49ddae"
SRC_URI[sha256sum] = "7240611fdd5b63e3cc316ae5de95bc5eba3f1c551f8f27f483f03706bcf26031"

NPM_PKGNAME = "yaml"

inherit npmhelper
inherit native
