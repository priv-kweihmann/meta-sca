SUMMARY = "NPM: cspell-dict-aws"
DESCRIPTION = "AWS dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/aws#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8a8de7619f749a1f30c5fe2b5ea50650"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-aws/-/cspell-dict-aws-1.1.3.tgz"
SRC_URI[md5sum] = "e9f9316aaae605b8c914e0a6b8053e2f"
SRC_URI[sha256sum] = "fecca21d35e0e26f5dcea9d67dac5334b10fdfec98225992ed71a7a3b1291c86"

NPM_PKGNAME = "cspell-dict-aws"

inherit npmhelper
inherit native
