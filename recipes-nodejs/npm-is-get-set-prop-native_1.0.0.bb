SUMMARY = "NPM: is-get-set-prop"
DESCRIPTION = "Does a JS type have a getter/setter property"
HOMEPAGE = "https://github.com/dustinspecker/is-get-set-prop#readme"

DEPENDS = "npm-get-set-props-native npm-lowercase-keys-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=512b547cdbdb32ef8bcbd275eb09a8bd"

SRC_URI = "https://registry.npmjs.org/is-get-set-prop/-/is-get-set-prop-1.0.0.tgz"
SRC_URI[md5sum] = "584a9b87fdbea36d9c9f3a4b7d8bc2ed"
SRC_URI[sha256sum] = "c0bc6a18cbc003208ba8e0293ba9090699d1059fa7cde630bfa822cc130cbf72"

NPM_PKGNAME = "is-get-set-prop"

inherit npmhelper
inherit native
