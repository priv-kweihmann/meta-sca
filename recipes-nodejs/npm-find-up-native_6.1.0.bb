SUMMARY = "NPM: find-up"
DESCRIPTION = "Find a file or directory by walking up parent directories"
HOMEPAGE = "https://github.com/sindresorhus/find-up#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-locate-path-native \
           npm-path-exists-native"

SRC_URI = "https://registry.npmjs.org/find-up/-/find-up-6.1.0.tgz"
SRC_URI[md5sum] = "23cd4dd1117074108e7f8eb79b4a61c9"
SRC_URI[sha256sum] = "e444879252882104d693832507f5a259d1dd1692ce5bfe2be51555370425f590"

NPM_PKGNAME = "find-up"

inherit npmhelper
inherit native
