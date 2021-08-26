SUMMARY = "NPM: rehype-retext"
DESCRIPTION = "rehype plugin to transform to retext"
HOMEPAGE = "https://github.com/rehypejs/rehype-retext#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = "npm-hast-util-to-nlcst-native \
           npm-types-hast-native \
           npm-types-unist-native \
           npm-unified-native"

SRC_URI = "https://registry.npmjs.org/rehype-retext/-/rehype-retext-3.0.1.tgz"
SRC_URI[md5sum] = "bb056d1b08f8835061e802421b1476a0"
SRC_URI[sha256sum] = "52906d31b26eea21de5f18c9356e65ae6c17a696de7f6a0f266a8da2b61ab955"

NPM_PKGNAME = "rehype-retext"

inherit npmhelper
inherit native
