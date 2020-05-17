SUMMARY = "NPM: eslint-template-visitor"
DEPENDS = "npm-eslint-visitor-keys-native npm-espree-native npm-multimap-native"

LICENSE = "GPL-3.0-or-later | MIT"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "https://registry.npmjs.org/eslint-template-visitor/-/eslint-template-visitor-1.1.0.tgz"
SRC_URI[md5sum] = "b401c0721435e94714649d7b5cf826bf"
SRC_URI[sha256sum] = "746450c4737ae56abd577341ad3aa49c31954bdb1e128cb6dd9d36402f2ff468"

NPM_PKGNAME = "eslint-template-visitor"

inherit npmhelper
inherit native
