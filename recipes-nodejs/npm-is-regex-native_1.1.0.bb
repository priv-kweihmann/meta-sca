SUMMARY = "NPM: is-regex"
DESCRIPTION = "Is this value a JS regex? Works cross-realm/iframe, and despite ES6 @@toStringTag"
HOMEPAGE = "https://github.com/ljharb/is-regex"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d22b3eb619d81197fd4f3ca47c2c1ea5"

DEPENDS = "npm-has-symbols-native"

SRC_URI = "https://registry.npmjs.org/is-regex/-/is-regex-1.1.0.tgz"
SRC_URI[md5sum] = "8c93e57632435e940842cbbbf11e5773"
SRC_URI[sha256sum] = "fb49450be7a71339e516d96d59de305f5a96238b5fc4c18409b5b2e292ec6728"

NPM_PKGNAME = "is-regex"

inherit npmhelper
inherit native
