SUMMARY = "NPM: is-regex"
DESCRIPTION = "Is this value a JS regex? Works cross-realm/iframe, and despite ES6 @@toStringTag"
HOMEPAGE = "https://github.com/inspect-js/is-regex"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d22b3eb619d81197fd4f3ca47c2c1ea5"

DEPENDS = "npm-call-bind-native \
           npm-has-symbols-native"

SRC_URI = "https://registry.npmjs.org/is-regex/-/is-regex-1.1.3.tgz"
SRC_URI[md5sum] = "8b20db6abd2a879b150e28a7e7426305"
SRC_URI[sha256sum] = "2a49c548d73bc7a54fe68963871e20551317e009aee90bf742b1917117f3128f"

NPM_PKGNAME = "is-regex"

inherit npmhelper
inherit native
