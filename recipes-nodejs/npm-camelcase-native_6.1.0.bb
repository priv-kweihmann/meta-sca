SUMMARY = "NPM: camelcase"
DESCRIPTION = "Convert a dash/dot/underscore/space separated string to camelCase or PascalCase: `foo-bar` → `fooBar`"
HOMEPAGE = "https://github.com/sindresorhus/camelcase#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/camelcase/-/camelcase-6.1.0.tgz"
SRC_URI[md5sum] = "2f002280d5307df876554efb7f5a052c"
SRC_URI[sha256sum] = "9bbdc17c1bada0694473d0b0335d0f5b0e18647d7efdc3d196bfdbf192b0ec8a"

NPM_PKGNAME = "camelcase"

inherit npmhelper
inherit native
