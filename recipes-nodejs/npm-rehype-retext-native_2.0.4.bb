SUMMARY = "NPM: rehype-retext"
DESCRIPTION = "rehype plugin to transform to retext"
HOMEPAGE = "https://github.com/rehypejs/rehype-retext#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = "npm-hast-util-to-nlcst-native"

SRC_URI = "https://registry.npmjs.org/rehype-retext/-/rehype-retext-2.0.4.tgz"
SRC_URI[md5sum] = "ddd8a7b2916695fbc5cdb896ef855ce0"
SRC_URI[sha256sum] = "8a2cc15f213c0de03c6822ca3f305c3818e92700718a96b8df71885c52a230d3"

NPM_PKGNAME = "rehype-retext"

inherit npmhelper
inherit native
