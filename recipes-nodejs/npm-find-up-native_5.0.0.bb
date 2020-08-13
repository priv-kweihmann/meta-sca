SUMMARY = "NPM: find-up"
DESCRIPTION = "Find a file or directory by walking up parent directories"
HOMEPAGE = "https://github.com/sindresorhus/find-up#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-locate-path-native \
           npm-path-exists-native"

SRC_URI = "https://registry.npmjs.org/find-up/-/find-up-5.0.0.tgz"
SRC_URI[md5sum] = "f30df2388d75158c7361f549edfe9bef"
SRC_URI[sha256sum] = "f4a64efb583769c09638d81963fd3f7aa883b632f9992a256de3fbe962ca75b4"

NPM_PKGNAME = "find-up"

inherit npmhelper
inherit native
