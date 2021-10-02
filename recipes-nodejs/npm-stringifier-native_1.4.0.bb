SUMMARY = "NPM: stringifier"
DESCRIPTION = "Yet another stringify function"
HOMEPAGE = "https://github.com/twada/stringifier"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.md;beginline=521;endline=522;md5=fc88c3505de4a4815d25e74964b621e1"

DEPENDS = "npm-core-js-native \
           npm-traverse-native \
           npm-type-name-native"

SRC_URI = "https://registry.npmjs.org/stringifier/-/stringifier-1.4.0.tgz"
SRC_URI[md5sum] = "bfd4fdc7cc482a58269846afdd6891c6"
SRC_URI[sha256sum] = "116b10bdb3eb78632e59f574579059a71e0be5259defb774d850688bcae9822c"

NPM_PKGNAME = "stringifier"

inherit npmhelper
inherit native
