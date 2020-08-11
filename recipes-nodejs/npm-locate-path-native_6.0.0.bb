SUMMARY = "NPM: locate-path"
DESCRIPTION = "Get the first path that exists on disk of multiple paths"
HOMEPAGE = "https://github.com/sindresorhus/locate-path#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-p-locate-native"

SRC_URI = "https://registry.npmjs.org/locate-path/-/locate-path-6.0.0.tgz"
SRC_URI[md5sum] = "88dec34f94138c96fd50374b3ff54935"
SRC_URI[sha256sum] = "71d20b2743581b997191a760edc54df51dcea7c53b12c613cabc360f636d832a"

NPM_PKGNAME = "locate-path"

inherit npmhelper
inherit native
