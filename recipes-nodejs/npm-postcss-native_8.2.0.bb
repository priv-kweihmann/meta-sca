SUMMARY = "NPM: postcss"
DESCRIPTION = "Tool for transforming styles with JS plugins"
HOMEPAGE = "https://postcss.org/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e0ef868fdaaba6859dcbab082c20439b"

DEPENDS = "npm-colorette-native \
           npm-nanoid-native \
           npm-source-map-native"

SRC_URI = "https://registry.npmjs.org/postcss/-/postcss-8.2.0.tgz"
SRC_URI[md5sum] = "5bab29a20fbebb62117c328ffcb0cd15"
SRC_URI[sha256sum] = "5e40495562efe167eef5212e188f129b82c9d119bb03fb1c5bdd12806099c539"

NPM_PKGNAME = "postcss"

inherit npmhelper
inherit native
