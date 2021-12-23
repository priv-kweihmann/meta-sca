SUMMARY = "NPM: is-builtin-module"
DESCRIPTION = "Check if a string matches the name of a Node.js builtin module"
HOMEPAGE = "https://github.com/sindresorhus/is-builtin-module#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = "npm-builtin-modules-native"

SRC_URI = "https://registry.npmjs.org/is-builtin-module/-/is-builtin-module-3.1.0.tgz"
SRC_URI[md5sum] = "71b55f5b0890dbfb8ec48fdee93c9421"
SRC_URI[sha256sum] = "152ac0b6f8fff72002e7364b12ed946db4814a9d734f974fb37a5cc61fbac808"

NPM_PKGNAME = "is-builtin-module"

inherit npmhelper
inherit native
