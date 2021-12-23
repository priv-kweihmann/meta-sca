SUMMARY = "NPM: unist-util-filter"
DESCRIPTION = "unist utility to create a new tree with nodes that pass a filter"
HOMEPAGE = "https://github.com/syntax-tree/unist-util-filter#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=a320e5b1aa9084c9b52db096dc5eee7f"

DEPENDS = "npm-types-unist-native \
           npm-unist-util-is-native \
           npm-unist-util-visit-parents-native"

SRC_URI = "https://registry.npmjs.org/unist-util-filter/-/unist-util-filter-4.0.0.tgz"
SRC_URI[md5sum] = "13ecabee103b2d6b9a1eef4f814bba81"
SRC_URI[sha256sum] = "aebe8ab259f984fd0f4e814983228395a0d99cb5579d8a59e22c873df4cf4a17"

NPM_PKGNAME = "unist-util-filter"

inherit npmhelper
inherit native
