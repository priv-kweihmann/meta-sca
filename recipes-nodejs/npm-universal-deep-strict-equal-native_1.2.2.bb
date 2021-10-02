SUMMARY = "NPM: universal-deep-strict-equal"
DESCRIPTION = "A port of Node v6's internal _deepEqual function in a universal style"
HOMEPAGE = "https://github.com/twada/universal-deep-strict-equal"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.md;beginline=52;endline=53;md5=06451d792313e4698951e9b1aafa853d"

DEPENDS = "npm-array-filter-native \
           npm-indexof-native \
           npm-object-keys-native"

SRC_URI = "https://registry.npmjs.org/universal-deep-strict-equal/-/universal-deep-strict-equal-1.2.2.tgz"
SRC_URI[md5sum] = "72bfd46491dd83a4556329dd65398c90"
SRC_URI[sha256sum] = "4210596cdc1f50a876d56745e9f69259757617b935f92141a3b99758043f0a27"

NPM_PKGNAME = "universal-deep-strict-equal"

inherit npmhelper
inherit native
