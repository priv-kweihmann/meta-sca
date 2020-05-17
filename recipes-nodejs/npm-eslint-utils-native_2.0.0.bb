SUMMARY = "NPM: eslint-utils"
DESCRIPTION = "Utilities for ESLint plugins."
HOMEPAGE = "https://github.com/mysticatea/eslint-utils#readme"

DEPENDS = "npm-eslint-visitor-keys-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a8f21789009221b0b37faaa24544da54"

SRC_URI = "https://registry.npmjs.org/eslint-utils/-/eslint-utils-2.0.0.tgz"
SRC_URI[md5sum] = "404097b94b2812d548deeb93329cdec4"
SRC_URI[sha256sum] = "a52ec3bd4501cc7ff442d94e70ae398d50b7d7c51f3b7d2cc06401f91e97a063"

NPM_PKGNAME = "eslint-utils"

inherit npmhelper
inherit native
