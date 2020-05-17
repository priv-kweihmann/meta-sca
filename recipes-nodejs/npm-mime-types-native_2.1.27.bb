SUMMARY = "NPM: mime-types"
DESCRIPTION = "The ultimate javascript content-type utility."
HOMEPAGE = "https://github.com/jshttp/mime-types#readme"

DEPENDS = "npm-mime-db-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bf1f9ad1e2e1d507aef4883fff7103de"

SRC_URI = "https://registry.npmjs.org/mime-types/-/mime-types-2.1.27.tgz"
SRC_URI[md5sum] = "c105c627e62e7ba99e934db0f832e096"
SRC_URI[sha256sum] = "f2a072da3505a4eaf6b155582a64429d27660f137f0644b6d0d86ec1e62529ec"

S = "${WORKDIR}/package"

NPM_PKGNAME = "mime-types"

inherit npmhelper
inherit native
