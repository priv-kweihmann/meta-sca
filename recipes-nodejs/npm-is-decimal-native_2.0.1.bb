SUMMARY = "NPM: is-decimal"
DESCRIPTION = "Check if a character is decimal"
HOMEPAGE = "https://github.com/wooorm/is-decimal#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/is-decimal/-/is-decimal-2.0.1.tgz"
SRC_URI[md5sum] = "b002b9e2c81bf9cf66f3c293bf280bfc"
SRC_URI[sha256sum] = "62b6375ccb0869ca7c26ccb1e5049de4c4f272157894360b50cf8466fc4c1beb"

NPM_PKGNAME = "is-decimal"

inherit npmhelper
inherit native
