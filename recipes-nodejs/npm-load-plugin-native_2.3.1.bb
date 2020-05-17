SUMMARY = "NPM: load-plugin"
DESCRIPTION = "Load a submodule, plugin, or file"
HOMEPAGE = "https://github.com/wooorm/load-plugin#readme"

DEPENDS = "npm-npm-prefix-native npm-resolve-from-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

SRC_URI = "https://registry.npmjs.org/load-plugin/-/load-plugin-2.3.1.tgz"
SRC_URI[md5sum] = "f2fb55f7cdf1af06f17244129a288769"
SRC_URI[sha256sum] = "e6156d27afce8e9005ed8d2581a2cde9399cc6d8fe481828a1687da26d67249e"

NPM_PKGNAME = "load-plugin"

inherit npmhelper
inherit native
