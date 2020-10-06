SUMMARY = "NPM: micromark-extension-frontmatter"
DESCRIPTION = "micromark extension to support frontmatter (YAML, TOML, etc)"
HOMEPAGE = "https://github.com/micromark/micromark-extension-frontmatter#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-fault-native"

SRC_URI = "https://registry.npmjs.org/micromark-extension-frontmatter/-/micromark-extension-frontmatter-0.2.2.tgz"
SRC_URI[md5sum] = "52871faca93492d5d14d44ec7bf1ce1d"
SRC_URI[sha256sum] = "c7e99ec030c6e6818692ffbac596268bdf56e71bcefdc6da466674c2554b4c25"

NPM_PKGNAME = "micromark-extension-frontmatter"

inherit npmhelper
inherit native
