SUMMARY = "NPM: is-regex"
DESCRIPTION = "Is this value a JS regex? Works cross-realm/iframe, and despite ES6 @@toStringTag"
HOMEPAGE = "https://github.com/inspect-js/is-regex"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d22b3eb619d81197fd4f3ca47c2c1ea5"

DEPENDS = "npm-call-bind-native \
           npm-has-symbols-native"

SRC_URI = "https://registry.npmjs.org/is-regex/-/is-regex-1.1.2.tgz"
SRC_URI[md5sum] = "89d5851ea7f6f3bbc3e32ca3fbfe94ad"
SRC_URI[sha256sum] = "445f9d56504c73cd5a9675471c9512df09243fdb1e4f906dab18eb3469aba39d"

NPM_PKGNAME = "is-regex"

inherit npmhelper
inherit native
