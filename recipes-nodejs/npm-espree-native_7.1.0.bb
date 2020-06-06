SUMMARY = "NPM: espree"
DESCRIPTION = "An Esprima-compatible JavaScript parser built on Acorn"
HOMEPAGE = "https://github.com/eslint/espree"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a5ecf182a71b918e8375ab67f2cc85e7"

DEPENDS = "npm-acorn-jsx-native \
           npm-acorn-native \
           npm-eslint-visitor-keys-native"

SRC_URI = "https://registry.npmjs.org/espree/-/espree-7.1.0.tgz"
SRC_URI[md5sum] = "f400da842bdbda8d42534a831fe4840e"
SRC_URI[sha256sum] = "ecfe296bd6c59b70c41558c39556baff070be70bd79188c82d7ce26800b14d8f"

NPM_PKGNAME = "espree"

inherit npmhelper
inherit native
