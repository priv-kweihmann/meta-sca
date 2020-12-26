SUMMARY = "NPM: cspell-dict-aws"
DESCRIPTION = "AWS dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/aws#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8a8de7619f749a1f30c5fe2b5ea50650"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-aws/-/cspell-dict-aws-1.1.2.tgz"
SRC_URI[md5sum] = "28433a3ab1373125aed27e485f7894e3"
SRC_URI[sha256sum] = "f2d97ea2c2220d5378178151a88951adac7ca647e581f70122bbd9b3821e164f"

NPM_PKGNAME = "cspell-dict-aws"

inherit npmhelper
inherit native
