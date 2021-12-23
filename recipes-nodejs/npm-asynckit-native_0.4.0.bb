SUMMARY = "NPM: asynckit"
DESCRIPTION = "Minimal async jobs utility library, with streams support"
HOMEPAGE = "https://github.com/alexindigo/asynckit#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=177bc287fb9558bf3ea50b440c1c86ff"

SRC_URI = "https://registry.npmjs.org/asynckit/-/asynckit-0.4.0.tgz"
SRC_URI[md5sum] = "54e27449ef7679e93c75930c340dc4a0"
SRC_URI[sha256sum] = "8c254f30f70792645042e4d71f590ec49f8e386a475772f7430c73b964b57dcf"

S = "${WORKDIR}/package"

NPM_PKGNAME = "asynckit"

inherit npmhelper
inherit native
