SUMMARY = "NPM: is-obj-prop"
DESCRIPTION = "Does a JS type have a property"
HOMEPAGE = "https://github.com/dustinspecker/is-obj-prop#readme"

DEPENDS = "npm-lowercase-keys-native npm-obj-props-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=512b547cdbdb32ef8bcbd275eb09a8bd"

SRC_URI = "https://registry.npmjs.org/is-obj-prop/-/is-obj-prop-1.0.0.tgz"
SRC_URI[md5sum] = "7998f3c8c78b764eaf429e1c5b5a32a5"
SRC_URI[sha256sum] = "cd13e95f3c090100a4305155e9ad93597f3c4d3683055a1686390ca725f81a39"

NPM_PKGNAME = "is-obj-prop"

inherit npmhelper
inherit native
