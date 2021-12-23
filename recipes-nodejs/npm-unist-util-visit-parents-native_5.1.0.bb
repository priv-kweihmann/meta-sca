SUMMARY = "NPM: unist-util-visit-parents"
DESCRIPTION = "unist utility to recursively walk over nodes, with ancestral information"
HOMEPAGE = "https://github.com/syntax-tree/unist-util-visit-parents#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = "npm-types-unist-native \
           npm-unist-util-is-native"

SRC_URI = "https://registry.npmjs.org/unist-util-visit-parents/-/unist-util-visit-parents-5.1.0.tgz"
SRC_URI[md5sum] = "cfa42d37bc476ddf5728168acb84dfaa"
SRC_URI[sha256sum] = "e8cb113a17ba071286007b7580c949c13efcc39716373d73bd2cf29b7e318b13"

NPM_PKGNAME = "unist-util-visit-parents"

inherit npmhelper
inherit native
