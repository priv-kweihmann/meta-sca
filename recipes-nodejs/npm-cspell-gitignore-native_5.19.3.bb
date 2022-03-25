SUMMARY = "NPM: cspell-gitignore"
DESCRIPTION = "Gitignore Glob matcher for cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/main/packages/cspell-gitignore#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-cspell-glob-native \
           npm-find-up-native"

SRC_URI = "https://registry.npmjs.org/cspell-gitignore/-/cspell-gitignore-5.19.3.tgz"
SRC_URI[md5sum] = "025cc9d0996a89157a7a178288d689b1"
SRC_URI[sha256sum] = "5862abe2db0dab847cf97051967f57e96a0d38ec75be3fd5f90945d08520cb2f"

NPM_PKGNAME = "cspell-gitignore"

inherit npmhelper
inherit native
