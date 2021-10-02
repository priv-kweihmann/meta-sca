SUMMARY = "NPM: power-assert-renderer-assertion"
DESCRIPTION = "assertion renderer for power-assert context"
HOMEPAGE = "https://github.com/twada/power-assert-runtime"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.md;beginline=36;endline=37;md5=fb09d58b915b126f1c353f70c292ce4e"

DEPENDS = "npm-power-assert-renderer-base-native \
           npm-power-assert-util-string-width-native"

SRC_URI = "https://registry.npmjs.org/power-assert-renderer-assertion/-/power-assert-renderer-assertion-1.2.0.tgz"
SRC_URI[md5sum] = "f1db639b6ed50a9b5b660db14434358b"
SRC_URI[sha256sum] = "29ce7c5701c1fa953d2a21af52b2520485f7aee0b25e7ff7e1aafa8353aac2f9"

NPM_PKGNAME = "power-assert-renderer-assertion"

inherit npmhelper
inherit native
