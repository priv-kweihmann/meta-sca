SUMMARY = "NPM: gensequence"
DESCRIPTION = "Small library to simplify working with Generators and Iterators in Javascript / Typescript"
HOMEPAGE = "https://github.com/Jason3S/GenSequence#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a3165774f004774b003233e87ff7950c"

SRC_URI = "https://registry.npmjs.org/gensequence/-/gensequence-2.3.0.tgz"
SRC_URI[md5sum] = "e9abea6fefa301ded703a23b8a464480"
SRC_URI[sha256sum] = "b1e9f0ffefb1a9ff7a6c34d6e099132da11502998fbb5ef91c5af58070536424"

S = "${WORKDIR}/package"

NPM_PKGNAME = "gensequence"

inherit npmhelper
inherit native
