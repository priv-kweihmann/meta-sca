SUMMARY = "NPM: micromark-extension-frontmatter"
DESCRIPTION = "micromark extension to support frontmatter (YAML, TOML, etc)"
HOMEPAGE = "https://github.com/micromark/micromark-extension-frontmatter#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-fault-native \
           npm-micromark-util-character-native \
           npm-micromark-util-symbol-native"

SRC_URI = "https://registry.npmjs.org/micromark-extension-frontmatter/-/micromark-extension-frontmatter-1.0.0.tgz"
SRC_URI[md5sum] = "6c08e5fcd3fbb444b188410cc673b285"
SRC_URI[sha256sum] = "063523ded4b8f558832ad82f6a76b08cfd891561fe109926f62fe02b5d780c5c"

NPM_PKGNAME = "micromark-extension-frontmatter"

inherit npmhelper
inherit native
