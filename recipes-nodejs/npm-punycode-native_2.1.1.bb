SUMMARY = "NPM: punycode"
DESCRIPTION = "A robust Punycode converter that fully complies to RFC 3492 and RFC 5891, and works on nearly all JavaScript platforms."
HOMEPAGE = "https://mths.be/punycode"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE-MIT.txt;md5=ee9bd8b835cfcd512dd644540dd96987"

SRC_URI = "https://registry.npmjs.org/punycode/-/punycode-2.1.1.tgz"
SRC_URI[md5sum] = "189447403a7580274f318eb19af7ea8c"
SRC_URI[sha256sum] = "e5ccd079bf02390e34cbb51b75f73a8be42795146a2e2e23cbb204dddb04ff3c"

S = "${WORKDIR}/package"

NPM_PKGNAME = "punycode"

inherit npmhelper
inherit native
