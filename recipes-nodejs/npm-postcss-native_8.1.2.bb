SUMMARY = "NPM: postcss"
DESCRIPTION = "Tool for transforming styles with JS plugins"
HOMEPAGE = "https://postcss.org/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e0ef868fdaaba6859dcbab082c20439b"

DEPENDS = "npm-colorette-native \
           npm-line-column-native \
           npm-nanoid-native \
           npm-source-map-native"

SRC_URI = "https://registry.npmjs.org/postcss/-/postcss-8.1.2.tgz"
SRC_URI[md5sum] = "7ce9f889e67da0a97c19a42add861ead"
SRC_URI[sha256sum] = "7ea7d6cf82cd9595b74f70ef3e0a2a92cf9e3fb2846bf5a4fede41325b3c1f1d"

NPM_PKGNAME = "postcss"

inherit npmhelper
inherit native
