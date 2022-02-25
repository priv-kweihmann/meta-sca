SUMMARY = "NPM: postcss"
DESCRIPTION = "Tool for transforming styles with JS plugins"
HOMEPAGE = "https://postcss.org/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e0ef868fdaaba6859dcbab082c20439b"

DEPENDS = "npm-nanoid-native \
           npm-picocolors-native \
           npm-source-map-js-native"

SRC_URI = "https://registry.npmjs.org/postcss/-/postcss-8.4.7.tgz"
SRC_URI[md5sum] = "da844eb257eb5e741d7b6baf39c69524"
SRC_URI[sha256sum] = "1ac1e94b147a6e2d1b81e39d36ef74a0b458ecc278181383c6c20305a472cbe3"

NPM_PKGNAME = "postcss"

inherit npmhelper
inherit native
