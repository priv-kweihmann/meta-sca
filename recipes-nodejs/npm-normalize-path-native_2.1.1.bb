SUMMARY = "NPM: normalize-path"
DESCRIPTION = "Normalize file path slashes to be unix-like forward slashes. Also condenses repeat slashes to a single slash and removes and trailing slashes unless disabled."
HOMEPAGE = "https://github.com/jonschlinkert/normalize-path"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c8f80ed52c9074414e8a69541cdc1587"

DEPENDS = "npm-remove-trailing-separator-native"

SRC_URI = "https://registry.npmjs.org/normalize-path/-/normalize-path-2.1.1.tgz"
SRC_URI[md5sum] = "b2f3932160dc03a5604dbac60ef59c34"
SRC_URI[sha256sum] = "920110b8616e904bbfaaa5546a7f47ee69f3ed3e5393f52746f3618fb19702b5"

NPM_PKGNAME = "normalize-path"

inherit npmhelper
inherit native
