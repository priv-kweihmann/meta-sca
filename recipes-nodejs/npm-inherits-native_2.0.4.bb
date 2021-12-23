SUMMARY = "NPM: inherits"
DESCRIPTION = "Browser-friendly inheritance fully compatible with standard node.js inherits()"
HOMEPAGE = "https://github.com/isaacs/inherits#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5b2ef2247af6d355ae9d9f988092d470"

SRC_URI = "https://registry.npmjs.org/inherits/-/inherits-2.0.4.tgz"
SRC_URI[md5sum] = "bf725b87e6485c1d9db0279cce76a4a7"
SRC_URI[sha256sum] = "d94dbc6c1bb3c5ac0fb12a73ade187108fc60de273a1b754f55044eb5e24afaf"

S = "${WORKDIR}/package"

NPM_PKGNAME = "inherits"

inherit npmhelper
inherit native
