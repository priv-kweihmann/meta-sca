SUMMARY = "NPM: postcss"
DESCRIPTION = "Tool for transforming styles with JS plugins"
HOMEPAGE = "https://postcss.org/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e0ef868fdaaba6859dcbab082c20439b"

DEPENDS = "npm-nanoid-native \
           npm-picocolors-native \
           npm-source-map-js-native"

SRC_URI = "https://registry.npmjs.org/postcss/-/postcss-8.4.12.tgz"
SRC_URI[md5sum] = "f900ac3a482d743dfe24c41e089536ff"
SRC_URI[sha256sum] = "0aad15e7e8246317bf4ada23e96349d7205c6c29729b5e4d0b0b61262180f039"

NPM_PKGNAME = "postcss"

inherit npmhelper
inherit native
