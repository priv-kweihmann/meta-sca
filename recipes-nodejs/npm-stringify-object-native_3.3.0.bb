SUMMARY = "NPM: stringify-object"
DESCRIPTION = "Stringify an object/array like JSON.stringify just without all the double-quotes"
HOMEPAGE = "https://github.com/yeoman/stringify-object#readme"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=793b3b442ec3c2448416decb9736b0c5"

DEPENDS = "npm-get-own-enumerable-property-symbols-native \
           npm-is-obj-native \
           npm-is-regexp-native"

SRC_URI = "https://registry.npmjs.org/stringify-object/-/stringify-object-3.3.0.tgz"
SRC_URI[md5sum] = "c8bc7e775646ac284de0256deea1c657"
SRC_URI[sha256sum] = "f6d24fe8a127756544ff4131f48b88bee3c2edc7dbe7eccc2b08d8ba8e4e731d"

NPM_PKGNAME = "stringify-object"

inherit npmhelper
inherit native
