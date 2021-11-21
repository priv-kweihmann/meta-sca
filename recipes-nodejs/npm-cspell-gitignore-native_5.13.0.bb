SUMMARY = "NPM: cspell-gitignore"
DESCRIPTION = "Gitignore Glob matcher for cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/master/packages/cspell-gitignore#readme"

DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-cspell-glob-native \
           npm-find-up-native"

SRC_URI = "https://registry.npmjs.org/cspell-gitignore/-/cspell-gitignore-5.13.0.tgz"
SRC_URI[md5sum] = "12d1089c695952c55393e5f6aaec0d1c"
SRC_URI[sha256sum] = "283f69d8fd8ce145cc0e8b458fa0cd3408a7ffe0c64f786f22d4a80a34c340c3"

NPM_PKGNAME = "cspell-gitignore"

inherit npmhelper
inherit native
