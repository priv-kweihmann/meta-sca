SUMMARY = "NPM: json5"
DESCRIPTION = "JSON for humans."
HOMEPAGE = "http://json5.org/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=d80f2808a405d641840b50a06f80e93c"

DEPENDS = "npm-minimist-native"

SRC_URI = "https://registry.npmjs.org/json5/-/json5-2.2.0.tgz"
SRC_URI[md5sum] = "e4711e39d31c4887d0c727ee258c7b40"
SRC_URI[sha256sum] = "37875a2bd12417df58f547acc8b909db3a2cb437511f44516a6871e344c0b1fe"

NPM_PKGNAME = "json5"

inherit npmhelper
inherit native
