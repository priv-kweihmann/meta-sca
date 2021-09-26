SUMMARY = "NPM: stringify-object"
DESCRIPTION = "Stringify an object/array like JSON.stringify just without all the double-quotes"
HOMEPAGE = "https://github.com/yeoman/stringify-object#readme"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=793b3b442ec3c2448416decb9736b0c5"

DEPENDS = "npm-get-own-enumerable-property-symbols-native \
           npm-is-obj-native \
           npm-is-regexp-native"

SRC_URI = "https://registry.npmjs.org/stringify-object/-/stringify-object-4.0.0.tgz"
SRC_URI[md5sum] = "619cd0a862d2352d67a56a0c9a39703c"
SRC_URI[sha256sum] = "7df4357f8246893ff12cdc6a40d9fd0891bd8c8e93d18e5fdc65ae57a0e42ce0"

NPM_PKGNAME = "stringify-object"

inherit npmhelper
inherit native
