SUMMARY = "NPM: cspell-gitignore"
DESCRIPTION = "Gitignore Glob matcher for cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/main/packages/cspell-gitignore#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-cspell-glob-native \
           npm-find-up-native"

SRC_URI = "https://registry.npmjs.org/cspell-gitignore/-/cspell-gitignore-5.18.5.tgz"
SRC_URI[md5sum] = "2954efaaaa2048528e3341ae99c34275"
SRC_URI[sha256sum] = "9f1294f2bac36a2f6b3d30d639f776f16e3875c4e413f04e25c68aefd4a62528"

NPM_PKGNAME = "cspell-gitignore"

inherit npmhelper
inherit native
