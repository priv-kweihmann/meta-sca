SUMMARY = "NPM: cspell-dict-aws"
DESCRIPTION = "AWS dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/aws#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c6da5c48319e04dd28e31b74cb7b8468"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-aws/-/cspell-dict-aws-1.0.9.tgz"
SRC_URI[md5sum] = "3c37fad570c50552a0254429627a8512"
SRC_URI[sha256sum] = "6a9030da9b6659427b509e042bd60e4b9df5cc26c32f815d4c9901ac627b015d"

NPM_PKGNAME = "cspell-dict-aws"

inherit npmhelper
inherit native
