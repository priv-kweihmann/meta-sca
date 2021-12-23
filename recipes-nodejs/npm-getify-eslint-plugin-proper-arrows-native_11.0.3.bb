SUMMARY = "NPM: @getify/eslint-plugin-proper-arrows"
DESCRIPTION = "ESLint rules to ensure proper arrow function definitions"
HOMEPAGE = "https://github.com/getify/eslint-plugin-proper-arrows"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=f4c73255c3265e56b09fabfd64badbbc"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@getify/eslint-plugin-proper-arrows/-/eslint-plugin-proper-arrows-11.0.3.tgz"
SRC_URI[md5sum] = "84d66c988d6836bc76be259aedcbf349"
SRC_URI[sha256sum] = "e257bd416650d1fa245827d61ef82adfcfb0e0b9368577f5a5a887e8c71689c6"

NPM_PKGNAME = "@getify/eslint-plugin-proper-arrows"

inherit npmhelper
inherit native
