SUMMARY = "NPM: mdast-util-frontmatter"
DESCRIPTION = "mdast extension to parse and serialize frontmatter (YAML, TOML, etc)"
HOMEPAGE = "https://github.com/syntax-tree/mdast-util-frontmatter#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-micromark-extension-frontmatter-native"

SRC_URI = "https://registry.npmjs.org/mdast-util-frontmatter/-/mdast-util-frontmatter-1.0.0.tgz"
SRC_URI[md5sum] = "b0847aad08b9273b788f0dbc02bb66de"
SRC_URI[sha256sum] = "fb40ad4a4fb622dedf75632117a6443571d81e42497f73f17a6e6361504a012d"

NPM_PKGNAME = "mdast-util-frontmatter"

inherit npmhelper
inherit native
