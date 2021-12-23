SUMMARY = "NPM: minimatch"
DESCRIPTION = "a glob matcher in javascript"
HOMEPAGE = "https://github.com/isaacs/minimatch#readme"

DEPENDS = "npm-brace-expansion-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=82703a69f6d7411dde679954c2fd9dca"

SRC_URI = "https://registry.npmjs.org/minimatch/-/minimatch-3.0.4.tgz"
SRC_URI[md5sum] = "6a2c6f3ffed6ed50faaff89ef8eab0a0"
SRC_URI[sha256sum] = "426a24d79bb6f0d3bb133e62cec69021836d254b39d931c104ddd7c464adea71"

S = "${WORKDIR}/package"

NPM_PKGNAME = "minimatch"

inherit npmhelper
inherit native
