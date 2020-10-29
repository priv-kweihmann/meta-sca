SUMMARY = "NPM: camelcase"
DESCRIPTION = "Convert a dash/dot/underscore/space separated string to camelCase or PascalCase: `foo-bar` → `fooBar`"
HOMEPAGE = "https://github.com/sindresorhus/camelcase#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/camelcase/-/camelcase-6.2.0.tgz"
SRC_URI[md5sum] = "7a205868a94339bc8a3fd9030a34c483"
SRC_URI[sha256sum] = "9dfc3c357fa433155ae8ba795e98ac6fa6ae63acd929403e1a0ecf8c5aa8a844"

NPM_PKGNAME = "camelcase"

inherit npmhelper
inherit native
