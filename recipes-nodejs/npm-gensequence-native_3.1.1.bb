SUMMARY = "NPM: gensequence"
DESCRIPTION = "Small library to simplify working with Generators and Iterators in Javascript / Typescript"
HOMEPAGE = "https://github.com/Jason3S/GenSequence#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a3165774f004774b003233e87ff7950c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/gensequence/-/gensequence-3.1.1.tgz"
SRC_URI[md5sum] = "e428cf423434cbfbb7a1a31e113eb872"
SRC_URI[sha256sum] = "d87b8667e3a481947d5933c6e3a260b11c1d424f1c65625a09e536a813b3db9b"

NPM_PKGNAME = "gensequence"

inherit npmhelper
inherit native
