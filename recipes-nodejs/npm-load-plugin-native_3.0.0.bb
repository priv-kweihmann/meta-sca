SUMMARY = "NPM: load-plugin"
DESCRIPTION = "Load a submodule, plugin, or file"
HOMEPAGE = "https://github.com/wooorm/load-plugin#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = "npm-libnpmconfig-native \
           npm-resolve-from-native"

SRC_URI = "https://registry.npmjs.org/load-plugin/-/load-plugin-3.0.0.tgz"
SRC_URI[md5sum] = "1ade91a210c99dda40ec04ab08209d2e"
SRC_URI[sha256sum] = "a4a9efa604ae914b188f9f378814827c3fae3e3b76c2e18ed040a5aecc128ec3"

NPM_PKGNAME = "load-plugin"

inherit npmhelper
inherit native
