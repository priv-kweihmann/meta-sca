SUMMARY = "NPM: load-plugin"
DESCRIPTION = "Load a submodule, plugin, or file"
HOMEPAGE = "https://github.com/wooorm/load-plugin#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = "npm-import-meta-resolve-native \
           npm-libnpmconfig-native"

SRC_URI = "https://registry.npmjs.org/load-plugin/-/load-plugin-4.0.0.tgz"
SRC_URI[md5sum] = "643120513b8f6f14adc0e1ef30cce01b"
SRC_URI[sha256sum] = "bd59efcb0dd60425c6ec4e0883e69431b14e90b5ea436c2a4457212145922192"

NPM_PKGNAME = "load-plugin"

inherit npmhelper
inherit native
