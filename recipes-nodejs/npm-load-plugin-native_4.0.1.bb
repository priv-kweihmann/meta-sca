SUMMARY = "NPM: load-plugin"
DESCRIPTION = "Load a submodule, plugin, or file"
HOMEPAGE = "https://github.com/wooorm/load-plugin#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = "npm-import-meta-resolve-native \
           npm-libnpmconfig-native"

SRC_URI = "https://registry.npmjs.org/load-plugin/-/load-plugin-4.0.1.tgz"
SRC_URI[md5sum] = "f354d407ef6e2303f661f01f27c1b682"
SRC_URI[sha256sum] = "bd9ed7eeb4fd9571779c55bca72417d9f8f8d0c790b6c7251d53c41c59074e22"

NPM_PKGNAME = "load-plugin"

inherit npmhelper
inherit native
