SUMMARY = "NPM: cspell-gitignore"
DESCRIPTION = "Gitignore Glob matcher for cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/master/packages/cspell-gitignore#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-cspell-glob-native \
           npm-find-up-native"

SRC_URI = "https://registry.npmjs.org/cspell-gitignore/-/cspell-gitignore-5.16.0.tgz"
SRC_URI[md5sum] = "f37b17ba33ac3502542dc947817f3697"
SRC_URI[sha256sum] = "2ba8fdb46dc8623ab2d3cbdd372d1a750868a1f43b0b711cf3bae5033a2b9fe6"

NPM_PKGNAME = "cspell-gitignore"

inherit npmhelper
inherit native
