SUMMARY = "NPM: is-alphanumerical"
DESCRIPTION = "Check if a character is alphanumerical"
HOMEPAGE = "https://github.com/wooorm/is-alphanumerical#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = "npm-is-alphabetical-native \
           npm-is-decimal-native"

SRC_URI = "https://registry.npmjs.org/is-alphanumerical/-/is-alphanumerical-2.0.0.tgz"
SRC_URI[md5sum] = "8808dccee4fba41d3098b0be59800fb2"
SRC_URI[sha256sum] = "aa0fcce493368db778ed45cd6828f0ada53ca957c7910932f3ae9f31dbfc6d54"

NPM_PKGNAME = "is-alphanumerical"

inherit npmhelper
inherit native
