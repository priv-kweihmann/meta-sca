SUMMARY = "NPM: find-up"
DESCRIPTION = "Find a file or directory by walking up parent directories"
HOMEPAGE = "https://github.com/sindresorhus/find-up#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-locate-path-native \
           npm-path-exists-native"

SRC_URI = "https://registry.npmjs.org/find-up/-/find-up-6.0.0.tgz"
SRC_URI[md5sum] = "4b72d11e3d5b6fb85da3a3e44b712e55"
SRC_URI[sha256sum] = "72b673e4e2786ace12463973e701e5efc694168944f1ad94e9a24a5a1aca329d"

NPM_PKGNAME = "find-up"

inherit npmhelper
inherit native
