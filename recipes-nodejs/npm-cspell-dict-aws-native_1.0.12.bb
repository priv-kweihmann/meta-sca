SUMMARY = "NPM: cspell-dict-aws"
DESCRIPTION = "AWS dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/aws#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8a8de7619f749a1f30c5fe2b5ea50650"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-aws/-/cspell-dict-aws-1.0.12.tgz"
SRC_URI[md5sum] = "38eb20cbfd69bb5d11361a63a72f0a36"
SRC_URI[sha256sum] = "9b3ddd2e5a26194b8dad8bf2f411ae787f0accd91bee08a64728467bcbd24590"

NPM_PKGNAME = "cspell-dict-aws"

inherit npmhelper
inherit native
