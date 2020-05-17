SUMMARY = "NPM: camelcase"
DESCRIPTION = "Convert a dash/dot/underscore/space separated string to camelCase or PascalCase: `foo-bar` → `fooBar`"
HOMEPAGE = "https://github.com/sindresorhus/camelcase#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/camelcase/-/camelcase-6.0.0.tgz"
SRC_URI[md5sum] = "ebf618aab15a9d69a7189f2d8a054767"
SRC_URI[sha256sum] = "4be7c3eaf8f2721f4abba3ce6576dc6cb2f843517d60e7737d1b00be2c3dfc81"

NPM_PKGNAME = "camelcase"

inherit npmhelper
inherit native
