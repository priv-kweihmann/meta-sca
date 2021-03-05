SUMMARY = "NPM: postcss"
DESCRIPTION = "Tool for transforming styles with JS plugins"
HOMEPAGE = "https://postcss.org/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e0ef868fdaaba6859dcbab082c20439b"

DEPENDS = "npm-colorette-native \
           npm-nanoid-native \
           npm-source-map-native"

SRC_URI = "https://registry.npmjs.org/postcss/-/postcss-8.2.7.tgz"
SRC_URI[md5sum] = "e2e7338a8b65a58c924069fbbe8f7e09"
SRC_URI[sha256sum] = "f4e1d223adca683e1ec11eafb9be3b5a25ac2e69fd67e20b2d82c431a36f58a9"

NPM_PKGNAME = "postcss"

inherit npmhelper
inherit native
