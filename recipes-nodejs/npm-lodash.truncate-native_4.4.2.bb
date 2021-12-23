SUMMARY = "NPM: lodash.truncate"
DESCRIPTION = "The lodash method `_.truncate` exported as a module."
HOMEPAGE = "https://lodash.com/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a3b2b7770df62392c164de4001b59f8f"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/lodash.truncate/-/lodash.truncate-4.4.2.tgz"
SRC_URI[md5sum] = "ae7cca49dcb1eaef85d6023207c22468"
SRC_URI[sha256sum] = "2fb9e132f972a4ce231b60d116d3d750e5acc16b0cdfd479faecdc525b6dcd23"

NPM_PKGNAME = "lodash.truncate"

inherit npmhelper
inherit native
