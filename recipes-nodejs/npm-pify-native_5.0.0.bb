SUMMARY = "NPM: pify"
DESCRIPTION = "Promisify a callback-style function"
HOMEPAGE = "https://github.com/sindresorhus/pify#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pify/-/pify-5.0.0.tgz"
SRC_URI[md5sum] = "dee3ee7813bed6d84d56c2dfed53b28b"
SRC_URI[sha256sum] = "ab6680f688c8e98a83ca1a9aa983632950a6b1eb086d2d844657ee3967df7d90"

NPM_PKGNAME = "pify"

inherit npmhelper
inherit native
