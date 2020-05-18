SUMMARY = "NPM: lodash.defaults"
DESCRIPTION = "The lodash method `_.defaults` exported as a module."
HOMEPAGE = "https://lodash.com/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a3b2b7770df62392c164de4001b59f8f"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/lodash.defaults/-/lodash.defaults-4.2.0.tgz"
SRC_URI[md5sum] = "a33c77d84209856ed58ff01b116acf0f"
SRC_URI[sha256sum] = "081a230a5cdb33bac733946d9f11902b0f114162743b9bbe352f986b61d7fae6"

NPM_PKGNAME = "lodash.defaults"

inherit npmhelper
inherit native
