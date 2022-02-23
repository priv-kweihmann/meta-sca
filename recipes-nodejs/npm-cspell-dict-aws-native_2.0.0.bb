SUMMARY = "NPM: @cspell/dict-aws"
DESCRIPTION = "AWS dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/dictionaries/aws#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8a8de7619f749a1f30c5fe2b5ea50650"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-aws/-/dict-aws-2.0.0.tgz"
SRC_URI[md5sum] = "56b226f537de7a7494670d066189b8ea"
SRC_URI[sha256sum] = "0f7a7ba57f6143bbd1687b53728d1a4888e761e359b8dcab5ffa31273e8ac65a"

NPM_PKGNAME = "@cspell/dict-aws"

inherit npmhelper
inherit native
