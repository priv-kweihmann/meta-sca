SUMMARY = "NPM: cspell-dict-aws"
DESCRIPTION = "AWS dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/aws#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c6da5c48319e04dd28e31b74cb7b8468"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-aws/-/cspell-dict-aws-1.0.5.tgz"
SRC_URI[md5sum] = "c20cc2f701202f9f132d24398e474b8a"
SRC_URI[sha256sum] = "b2081fece96419106337fb708dca43ac468110089239803c8d19c7ee648a8ec3"

NPM_PKGNAME = "cspell-dict-aws"

inherit npmhelper
inherit native
