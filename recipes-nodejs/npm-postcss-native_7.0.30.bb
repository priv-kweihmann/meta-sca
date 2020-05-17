SUMMARY = "NPM: postcss"
DESCRIPTION = "Tool for transforming styles with JS plugins"
HOMEPAGE = "https://postcss.org/"

DEPENDS = "npm-chalk-native npm-source-map-native npm-supports-color-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e0ef868fdaaba6859dcbab082c20439b"

SRC_URI = "https://registry.npmjs.org/postcss/-/postcss-7.0.30.tgz"
SRC_URI[md5sum] = "e4f658e03a641b4f1db6b3ef1bb252fd"
SRC_URI[sha256sum] = "fe9024fd3f16af4a83ba7495db53861f1606b4f64220539003ba24d215324576"

NPM_PKGNAME = "postcss"

inherit npmhelper
inherit native
